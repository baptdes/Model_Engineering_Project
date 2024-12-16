import csv

# importation des autres shémas tables 
import exempleRefCroisée






class Contrainte:
    def __init__(self, message, actionContrainte, comparatifs, colonnes):
        self._message = message
        self._actionContrainte = actionContrainte
        self._comparatifs = comparatifs
        self._colonnes = colonnes







class industAllemand:

    tableau = []

    def __init__(self):
        self._tableau = [["Date","Open","low","close","adj Close", "Volume"],
                          [],
                          [],
                          [],
                          [],
                          []]
        


        

    #permet de vérifier que la matrice est conforme
    #argument : - self classe
    #sortie : booléen, retourne true si le fichier à bien été importé et false sinon
    # affiche les messages d'avertissements ou d'éreurs 
    def verification(self,contenue):  
        #énumération des types et des contraintes
        typesColonne = ["str", "float", "float", "float", "float", "float", "int"]
        

        #vérification
        for ligne in range(1,len(contenue)):
            for colonne in range (0,len(contenue[ligne])) :
                #vérification de type
                try :
                    contenue[ligne][colonne]  = eval(typesColonne[colonne] + "(\"" + contenue[ligne][colonne] + "\")")            
                except Exception as e:
                    print("mauvais type de données ligne : " + str(ligne) + ", colonne : " + str(colonne))
                    return False      
            
            #vérification des contraintes
            def chercherElements(listeElement,listeRecherche) :
                result = []
                for i in range(0,len(listeElement)):
                    for j in range(0,len(listeRecherche)):
                        if listeElement[i]==listeRecherche[j]:
                            result.append(j)
                return result       
            #contrainte 1
            contrainteMinMax = Contrainte("min et max inverser","Erreur","<=",["adj Close","Volume"])
            colonnes = chercherElements(contrainteMinMax._colonnes,self._tableau[0])
            if eval("not(" + str(contenue[ligne][colonnes[0]]) + contrainteMinMax._comparatifs + str(contenue[ligne][colonnes[1]]) + ")") :
                if contrainteMinMax._actionContrainte == "Erreur":
                    print(str(contrainteMinMax._message) + ", ligne:" + str(ligne) )
                    return False
                elif contrainteMinMax._actionContrainte == "Avertissement":
                    print(str(contrainteMinMax._message) + ", ligne: " + str(ligne) ) 
                else :
                    print("Erreur de transformation")
        return True



    #permet d'importer in fichier CSV
    #argument : - self classe
    #           - fichierCSV : chemin du fichier CSV que l'on veut importer
    #sortie : booléen, retourne true si le fichier à bien été importé et false sinon
    def importationCSV(self,fichierCSV):
        try:
            with open(fichierCSV, mode='r', encoding='utf-8') as fichier:
                    fichierCSV = fichier
                    lecteur_csv = csv.reader(fichier)
                    contenue = [ligne for ligne in lecteur_csv]
                            #verification que la matrice importer est conforme aux contraintes et aux types
                    if self.verification(contenue):
                        for i in range(1,len(contenue)):
                            self._tableau[i] = contenue[i]
                    else :
                        print("mauvaise importation")                                                   
        except Exception as e:
            print("Erreur dans l'importation")



        




    def calcul(fonction, colonne):
        #rien ici
        return 0
    

tableauIndustrie = industAllemand()
tableauIndustrie.importationCSV("C:\Users\flori\Documents\Travail\IDM\Projet-IDM\DossierPythonExemple\test.csv")