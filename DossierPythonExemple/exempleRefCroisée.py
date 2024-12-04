import csv

# importation des autres shémas tables 
from exemple2 import tableauIndustrie


# importation des algo
from AlgoMoyExp import moy




class Contrainte:
    def __init__(self, message, actionContrainte, comparatifs, colonnes):
        self._message = message
        self._actionContrainte = actionContrainte
        self._comparatifs = comparatifs
        self._colonnes = colonnes







class industAllemand:

    tableau = []

    def __init__(self, tableau):
        self._tableau = [["Date","Open","Min","Max","Close", "Volume","Moyenne","Variation"],
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
        typesColonne = [str, float, float, float, float, int, float,float]
        contrainteMinMax = Contrainte("min et max inverser","Erreur","<=",["close","Volume"])

        #vérification
        for ligne in range(1,len(contenue)):
            for colonne in range (0,len(contenue[ligne])) :
                #vérification de type 
                if not(isinstance(contenue[ligne][colonne]),typesColonne[colonne]):
                    print("mauvais type de données ligne : " + ligne + ", colonne : " + colonne)
                    return False      
            
            #vérification des contraintes
            def chercherElements(listeElement,listeRecherche) :
                result = []
                for i in listeElement:
                    for j in listeRecherche:
                        if i==j:
                            result.append(j)
                return result       
            #contrainte 1
            colonnes = chercherElements(contrainteMinMax._colonnes,self._tableau[0])
            if eval(str(contenue[colonnes[0]]) + contrainteMinMax._comparatifs + str(contenue[colonnes[1]])) :
                if contrainteMinMax._actionContrainte == "Erreur":
                    print(contrainteMinMax._message + ", ligne:" + ligne )
                    return False
                elif contrainteMinMax._actionContrainte == "Avertissement":
                    print(contrainteMinMax._message + ", ligne: " + ligne ) 
                else :
                    print("Erreur de transformation")



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
        except Exception as e:
            print("Erreur dans l'importation")
        #verification que la matrice importer est conforme aux contraintes et aux types
        if self.verification(contenue):
            for i in range(1,len(contenue)):
                self._tableau[i] = contenue[i]
        else :
            print("ereur dans l'importation retourner après la vérification")
            Exception("ereur dans l'importation retourner après la vérification")

        




    def calcul(fonction, colonne):
        #plusieurs colonne à calculer


        #colonne calculer avec un script de x = x sont les colonnes étrangères

        #ajouter une hiérachisation des calcules peut être 
        #donnée 

        #imaginons une colonne calculée 
        colonneMoy = []
        #ici à aller chercher dans industrieAllemande
        identifiantColonnesEntree = ["low","close"]
        #importation des colonnes
        def chercherElements(listeElement,listeRecherche) :
                result = []
                for i in listeElement:
                    for j in listeRecherche:
                        if i==j:
                            result.append(j)
                return result 
        IDColonnesE = chercherElements(identifiantColonnesEntree,tableauIndustrie._tableau[0])
        for i in range(1,len(tableauIndustrie._tableau)):
            colonneMoy = moy(tableauIndustrie._tableau[IDColonnesE[0]], tableauIndustrie._tableau[IDColonnesE[0]])
        print(colonneMoy)
               
        
        