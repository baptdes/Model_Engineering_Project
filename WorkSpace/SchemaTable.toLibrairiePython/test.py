

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






class colonne:
    valeur = []
    type = "str"
    nom = ""

    def __init__(self,nom,type):
        self.valeur = []
        self.type = type
        self.nom = nom


class Contrainte:
	def __init__(self, message, actionContrainte, colonnes):
		self.message = message
		self.actionContrainte = actionContrainte
		self.colonnes = colonnes


class test:

    colonnesImport = []
    colonnesReference = []
    colonnesCalcule = []
    

    def __init__(self):
        self.colonnesImport = [
            colonne("1","float")
,             colonne("3","float")
,             colonne("2","float")
            ]
        self.colonnesReference = [
            ]
        self.colonnesCalcule = [
            ]

        

    #permet de vérifier que la matrice est conforme
    #argument : - self classe
    #sortie : booléen, retourne true si le fichier à bien été importé et false sinon
    # affiche les messages d'avertissements ou d'éreurs 
    def verificationImport(self,contenue):  
        #vérification
        for ligne in range(1,len(contenue)):
            for colonne in range (0,len(self.colonnesImport)) :
                
                #vérification de type
                try :
                    contenue[ligne][colonne]  = eval(self.colonnesImport[colonne].type + "(\"" + contenue[ligne][colonne] + "\")")  

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
    		return(True)




    def calcul(self):return(True)
		



    #permet de vérifier que les calculs sont les bons
    #argument : - self classe
    #sortie : booléen, retourne true si le fichier à bien été importé et false sinon
    # affiche les messages d'avertissements ou d'éreurs 
    def verificationFinal(self):return(True)


    def ExportationCSV(self):
        # Écriture des données dans le fichier CSV
        with open("fichierSortie.csv", mode='w', newline='', encoding='utf-8') as fichier_csv: 
            writer = csv.writer(fichier_csv) 
            #création de la matrice adéquate :
            taille = 0
            if len(self.colonnesReference) != 0:
                taille = len(self.colonnesReference[0].valeur)
                donnees = [[] for i in range(0,taille+1)]
            elif len(self.colonnesCalcule) != 0:
                taille = len(self.colonnesCalcule[0].valeur)
                donnees = [[] for i in range(0,taille+1)]
            elif len(self.colonnesImport) != 0:
                taille = len(self.colonnesImport[0].valeur)
                donnees = [[] for i in range(0,taille+1)]
            else :
                raise("Le tableau ne contient aucune colonne")
            #colonne de référence
            for colonne in self.colonnesReference:
                donnees[0].append(colonne.nom)
                for ligne in range (0,taille):
                    donnees[ligne+1].append(colonne.valeur[ligne])
            #colonne importe
            for colonne in self.colonnesImport:
                donnees[0].append(colonne.nom)
                for ligne in range(0,taille):
                    donnees[ligne+1].append(colonne.valeur[ligne])
            #colonne calculé
            for colonne in self.colonnesCalcule:
                donnees[0].append(colonne.nom)
                for ligne in range(0,taille):
                    donnees[ligne+1].append(colonne.valeur[ligne])

            writer.writerows(donnees)  # Écrit chaque ligne du dictionnair

    

tabCal = test()
tabCal.AjoutColonneReference([])
tabCal.importationCSV("test1.csv")
tabCal.calcul()
tabCal.verificationFinal()
tabCal.ExportationCSV()

