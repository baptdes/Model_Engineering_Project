

import csv
import inspect
from enum import Enum


# importation des algo
#fonctions signature
#entrée : - valeurs en entrée 
#         - ...
#         - valeurs en entrée 
#sortie ; - valeurs en sortie


import est_positif as est_positif
import int_to_float as int_to_float



class colonne:
    valeur = []
    type = "str"
    nom = ""

    def __init__(self,nom,type,id,Isimport = False):
        self.valeur = []
        self.type = type
        self.nom = nom
        self.Isimport = Isimport
        self.id = id




class toto:


    colonnes = []
    

    def getColonne(self,idColonne):
        for colonne in self.colonnes:
            if (idColonne == colonne.id):
                return colonne
    

    def __init__(self):
        self.colonnes = [
            colonne("lignes","float","toto.lignes", True ), colonne("col2","float","toto.col2"), colonne("col1","float","toto.col1", True )]
        

 # permet de vérifier que la matrice est conforme
    # argument : - self classe
    # sortie : booléen, retourne true si le fichier a bien été importé et false sinon
    # affiche les messages d'avertissements ou d'erreurs 
    def verificationImport(self, contenue):  
        # vérification
        for ligne in range(1, len(contenue)):
            a = 0
            for colonne in range(0, len(self.colonnes)):
                if self.colonnes[colonne].Isimport:
                    
                    # vérification de type
                    contenue[ligne][a] = eval(self.colonnes[a].type + "(\"" + contenue[ligne][a] + "\")")    
                    
                    # ajout de la valeur dans le tableau 
                    self.colonnes[a].valeur.append(contenue[ligne][a])  
                    a += 1            
                        
        return True


    
    

    #permet d'importer in fichier CSV
    #argument : - self classe
    #           - fichierCSV : chemin du fichier CSV que l'on veut importer
    #sortie : booléen, retourne true si le fichier à bien été importé et false sinon
    def importationCSV(self,fichierCSV):
            with open(fichierCSV, mode='r', encoding='utf-8') as fichier:
                    fichierCSV = fichier
                    lecteur_csv = csv.reader(fichier)
                    contenue = [ligne for ligne in lecteur_csv]
                            #verification que la matrice importer est conforme aux contraintes et aux types
                    if not(self.verificationImport(contenue)):
                            print("retour false Calcul")                                                 



        
    def AjoutColonneReference(self, addresseTabRef):
        
        
        
        print("Ajout Colonne Référence")



    def calcul(self):
        
        intermediaire = []
            
        #faire de l'introspection pour récupérer le nom de la fonction
        methodes = [name for name, obj in inspect.getmembers(int_to_float, inspect.isfunction)]
        #si il y a plusieurs méthode fini 
        if len(methodes) > 1:
            raise Exception("L'algo " + "int_to_float" + "a trop de fonction alors que nous en voulons qu'une")
        for i in range(0,len(self.colonnes[0].valeur)):
            #Il faut ajouter le nom du dossier de la fonction importer
            intermediaire.append(eval("int_to_float." + str(methodes[0]) + "(  self.getColonne(\"toto.lignes\").valeur[i]  )" ))
        self.getColonne("toto.col2").valeur = intermediaire
        print("calcul des colonnes")
        



    #permet de vérifier que les calculs sont les bons
    #argument : - self classe
    #sortie : booléen, retourne true si le fichier à bien été importé et false sinon
    # affiche les messages d'avertissements ou d'éreurs 
    def verificationFinal(self):  
        #vérification des contraintes 
        
        #faire de l'introspection pour récupérer le nom de la fonction
        methodes = [name for name, obj in inspect.getmembers(est_positif, inspect.isfunction)]
        #si il y a plusieurs méthode fini 
        if len(methodes) > 1:
            raise Exception("L'algo " + "est_positif" + "a trop de fonction alors que nous en voulons qu'une")
        for i in range(0,len(self.colonnes[0].valeur)):
            #Il faut ajouter le nom du dossier de la fonction importer
            if eval("not(est_positif." + str(methodes[0]) + "(  self.getColonne(\"toto.lignes\").valeur[i] ,  self.getColonne(\"toto.col2\").valeur[i]   ))" ):
                return False  
        print("vérification")
        return True
        




class tata:


    colonnes = []
    

    def getColonne(self,idColonne):
        for colonne in self.colonnes:
            if (idColonne == colonne.id):
                return colonne
    

    def __init__(self):
        

        
        self.colonnes = [
            colonne("lignes","float","tata.lignes", True )
,             colonne("lignes_toto","float","tata.lignes_float_toto")
            ]

        

 # permet de vérifier que la matrice est conforme
    # argument : - self classe
    # sortie : booléen, retourne true si le fichier a bien été importé et false sinon
    # affiche les messages d'avertissements ou d'erreurs 
    def verificationImport(self, contenue):  
        # vérification
        for ligne in range(1, len(contenue)):
            a = 0
            for colonne in range(0, len(self.colonnes)):
                if self.colonnes[colonne].Isimport:
                    
                    # vérification de type
                    contenue[ligne][a] = eval(self.colonnes[a].type + "(\"" + contenue[ligne][a] + "\")")    
                    
                    # ajout de la valeur dans le tableau 
                    self.colonnes[a].valeur.append(contenue[ligne][a])  
                    a += 1            
                        
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
        
        atoto = toto()
        atoto.AjoutColonneReference([])
        atoto.importationCSV(addresseTabRef[0])
        atoto.calcul()
        if not(atoto.verificationFinal()):
            raise Exception("Erreur dans les vérifications")
        self.getColonne("tata.lignes_float_toto").valeur = atoto.getColonne("toto.col2").valeur



    def calcul(self):
        
        print("calcul des colonnes")
        



    #permet de vérifier que les calculs sont les bons
    #argument : - self classe
    #sortie : booléen, retourne true si le fichier à bien été importé et false sinon
    # affiche les messages d'avertissements ou d'éreurs 
    def verificationFinal(self):  
        #vérification des contraintes 
        print("vérification")
        return True

        


        
    


    def ExportationCSV(self):
        # Écriture des données dans le fichier CSV
        with open("fichierSortie.csv", mode='w', newline='', encoding='utf-8') as fichier_csv: 
            writer = csv.writer(fichier_csv) 
            
            # création de la matrice adéquate :
            taille = len(self.colonnes[0].valeur)
            donnees = [[] for i in range(0, taille + 1)]
            
            # colonne de référence
            for colonne in self.colonnes:
                donnees[0].append(colonne.nom)
                for ligne in range(0, taille):
                    donnees[ligne + 1].append(colonne.valeur[ligne])
            
            writer.writerows(donnees)  # Écrit chaque ligne du dictionnaire

    

tabCal = tata()
tabadd = input('rentrer les addresses des csv des schemas tables etranger : ')
tabCal.AjoutColonneReference([tabadd])
couradd = input('rentrer l\'addresses du csv du schema table courrant : ')
tabCal.importationCSV(couradd)
tabCal.calcul()
if not(tabCal.verificationFinal()):
	raise Exception("erreur de contrainte")
tabCal.ExportationCSV()

