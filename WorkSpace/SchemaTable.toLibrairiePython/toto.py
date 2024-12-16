

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
import est_positif.xmi as est_positif
import int_to_float.py as int_to_float






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

class toto:


	colonnes = []
	

	def getColonne(self,idColonne):
		for colonne in self.colonnes:
			if idColonne = colonne.id:
				return colonne
    

    def __init__(self):
		

		
        self.colonnes = [
            colonne("lignes","float","toto.lignes", true )
,             colonne("col2","float","toto.col2")
,             colonne("col1","float","toto.col1", true )
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
		
		intermediaire = []
			  
        #faire de l'introspection pour récupérer le nom de la fonction
        methodes = [name for name, obj in inspect.getmembers(int_to_float.py, inspect.isfunction)]
        #si il y a plusieurs méthode fini 
        if len(methodes) > 1:
            raise("L'algo " + "int_to_float.py" + "a trop de fonction alors que nous en voulons qu'une")
        for i in range(0,len(self.colonne[[0]].valeur)):
	        #Il faut ajouter le nom du dossier de la fonction importer
	        intermediaire.append(eval("int_to_float." + str(methodes[0]) + "("  getColonne(toto.lignes).valeur[i])  + ")" ))
        getColonne(toto.col2).valeur = intermediaire
		print("calcul des colonnes")
		



    #permet de vérifier que les calculs sont les bons
    #argument : - self classe
    #sortie : booléen, retourne true si le fichier à bien été importé et false sinon
    # affiche les messages d'avertissements ou d'éreurs 
    def verificationFinal(self):  
		#vérification des contraintes 
		  
        #faire de l'introspection pour récupérer le nom de la fonction
        methodes = [name for name, obj in inspect.getmembers(est_positif.xmi, inspect.isfunction)]
        #si il y a plusieurs méthode fini 
        if len(methodes) > 1:
            raise("L'algo " + "est_positif.xmi" + "a trop de fonction alors que nous en voulons qu'une")
        for i in range(0,len(self.colonne[[0]].valeur)):
	        #Il faut ajouter le nom du dossier de la fonction importer
	        if eval("not(est_positif." + str(methodes[0]) + "("  getColonne(toto.lignes).valeur[i]) ,  getColonne(toto.col2).valeur[i])  + "))" )):
	            return false
	          

		


		
	


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

    

tabCal = toto()
tabCal.AjoutColonneReference(["fichierDeTest/testRef.csv"])
tabCal.importationCSV("fichierDeTest/testCal.csv")
tabCal.calcul()
tabCal.verificationFinal()
tabCal.ExportationCSV()

