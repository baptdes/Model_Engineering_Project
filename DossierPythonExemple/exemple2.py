import csv

# importation des autres shémas tables 







class Contrainte:
    def __init__(self, message, actionContrainte, comparatifs, colonnes):
        self._message = message
        self._actionContrainte = actionContrainte
        self._comparatifs = comparatifs
        self._colonnes = colonnes







class industAllemand:

    tableau = []

    def __init__(self, tableau):
        self._tableau = [["Date","Open","low","close","adj Close", "Volume"],
                          [],
                          [],
                          [],
                          [],
                          []]
        


        

    
    def verifierCSV(self,fichierCSV):  
        typesColonne = [str, float, float, float, float, float, int]
        contrainteMinMax = Contrainte("min et max inverser","Erreur","<=",["close","Volume"])

        try:
            with open(fichierCSV, mode='r', encoding='utf-8') as fichier:
                    fichierCSV = fichier
                    lecteur_csv = csv.reader(fichier)
                    contenue = [ligne for ligne in lecteur_csv]  
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
                                print(contrainteMinMax._message + ligne:" + ligne ) 
                            else :
                                print("Erreur de transformation")
                                         
        except Exception as e:
            print("Erreur dans l'importation")




    def calcul(fonction, colonne):