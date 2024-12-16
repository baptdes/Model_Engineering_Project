

import csv
import inspect
from enum import Enum

# importation des autres shémas tables 



# importation des algo
#fonctions signature
#entrée : - valeurs en entrée 
#         - ...
#         - valeurs en entrée 
#sortie ; - valeurs en sortie
import est_positif.xmi









class colonne:
    valeur = []
    type = "str"
    nom = ""
	import = false
	id 

    def __init__(self,nom,type,id,import = false):
        self.valeur = []
        self.type = type
        self.nom = nom
		self.import = import
		self.id = id

class tata:


	colonnes = []

	def getColonne(self,idColonne):
		for colonne in self.colonnes:
			if idColonne = colonne.id:
				return colonne
    

    def __init__(self):
		

		
        self.colonnes = [
            colonne("lignes","Entier","tata.lignes", true )
,             colonne("lignes_toto","Flottant","tata.lignes_float_toto")
            ]

        

    #permet de vérifier que la matrice est conforme
    #argument : - self classe
    #sortie : booléen, retourne true si le fichier à bien été importé et false sinon
    # affiche les messages d'avertissements ou d'éreurs 
    def verificationImport(self,contenue):  
        #vérification
        for ligne in range(1,len(contenue)):
            for colonne in range (0,len(self.colonnes)) :
				if (colonne.import)
                
	                #vérification de type
	                try :
	                    contenue[ligne][colonne]  = eval(self.colonnes[colonne].type + "(\"" + contenue[ligne][colonne] + "\")")  
	
	                    #ajout de la valeur dans le tableau 
	                    self.colonnesImport[colonne].valeur.append(contenue[ligne][colonne])          
	                except Exception as e:
	                    print("mauvais type de données ligne : " + str(ligne) + ", colonne : " + str(colonne))
	                    return False      
	                      
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
                    if not(self.verificationImport(contenue)):
                            print("retour false Calcul")                                                 
        except Exception as e:
            print("Erreur dans l'importation de Calcul")



        
    #permet d'ajouter les colonnes des autres tableaux
    def AjoutColonneReference(self,addresseTabRef):
        #création du tableau 
        RefC = RefCroise()
        #appel des fonctions d'importations des données et calcul des données sur le tableau en référence
        RefC.AjoutColonneReference([])
        RefC.importationCSV(addresseTabRef[0])
        RefC.calcul()
        if not(RefC.verificationFinal):
            raise("Erreur dans les vérifications")
        self.colonnesReference[0].valeur = RefC.colonnesImport[0].valeur




    def calcul(self):
		return 0
		



    #permet de vérifier que les calculs sont les bons
    #argument : - self classe
    #sortie : booléen, retourne true si le fichier à bien été importé et false sinon
    # affiche les messages d'avertissements ou d'éreurs 
    def verificationFinal(self):  
		return 0


    def ExportationCSV(self):
        # Écriture des données dans le fichier CSV
        with open("fichierSortie.csv", mode='w', newline='', encoding='utf-8') as fichier_csv: 
            writer = csv.writer(fichier_csv) 
            #création de la matrice adéquate :
            taille = len(self.colonne[0].valeur)
            #colonne de référence
            for colonne in self.colonnne:
                donnees[0].append(colonne.nom)
                for ligne in range (0,taille):
                    donnees[ligne+1].append(colonne.valeur[ligne])
         

            writer.writerows(donnees)  # Écrit chaque ligne du dictionnair

    

tabCal = tata()
tabCal.AjoutColonneReference(["fichierDeTest/testRef.csv"])
tabCal.importationCSV("fichierDeTest/testCal.csv")
tabCal.calcul()
tabCal.verificationFinal()
tabCal.ExportationCSV()

