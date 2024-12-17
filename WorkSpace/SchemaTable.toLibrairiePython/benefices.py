

import csv
import inspect
from enum import Enum


# importation des algo
#fonctions signature
#entrée : - valeurs en entrée 
#         - ...
#         - valeurs en entrée 
#sortie ; - valeurs en sortie
import benefice as benefice


import est_positif as estPositif
import est_positif as estPositif


import est_positif as estPositif
import est_positif as estPositif


import est_positif as estPositif
import est_positif as estPositif



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







class benefices:


    colonnes = []
    

    def getColonne(self,idColonne):
        for colonne in self.colonnes:
            if (idColonne == colonne.id):
                return colonne
    

    def __init__(self):
        

        
        self.colonnes = [
            colonne("id","int","benefices.id", True )
,             colonne("pa","float","benefices.pa")
,             colonne("pv","float","benefices.pv")
,             colonne("nbc","int","benefices.nbc")
,             colonne("benef","float","benefices.benef")
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
        
        ahisto_ventes = histo_ventes()
        ahisto_ventes.AjoutColonneReference([])
        ahisto_ventes.importationCSV(addresseTabRef[0])
        ahisto_ventes.calcul()
        if not(ahisto_ventes.verificationFinal()):
            raise Exception("Erreur dans les vérifications")
        self.getColonne("benefices.pa").valeur = ahisto_ventes.getColonne("histo_ventes.prix_achat").valeur
        ahisto_ventes = histo_ventes()
        ahisto_ventes.AjoutColonneReference([])
        ahisto_ventes.importationCSV(addresseTabRef[0])
        ahisto_ventes.calcul()
        if not(ahisto_ventes.verificationFinal()):
            raise Exception("Erreur dans les vérifications")
        self.getColonne("benefices.pv").valeur = ahisto_ventes.getColonne("histo_ventes.prix_vente").valeur
        ahisto_ventes = histo_ventes()
        ahisto_ventes.AjoutColonneReference([])
        ahisto_ventes.importationCSV(addresseTabRef[0])
        ahisto_ventes.calcul()
        if not(ahisto_ventes.verificationFinal()):
            raise Exception("Erreur dans les vérifications")
        self.getColonne("benefices.nbc").valeur = ahisto_ventes.getColonne("histo_ventes.nb_cartes").valeur



    def calcul(self):
        
        intermediaire = []
            
        #faire de l'introspection pour récupérer le nom de la fonction
        methodes = [name for name, obj in inspect.getmembers(benefice, inspect.isfunction)]
        #si il y a plusieurs méthode fini 
        if len(methodes) > 1:
            raise Exception("L'algo " + "benefice" + "a trop de fonction alors que nous en voulons qu'une")
        for i in range(0,len(self.colonnes[0].valeur)):
            #Il faut ajouter le nom du dossier de la fonction importer
            intermediaire.append(eval("benefice." + str(methodes[0]) + "(  self.getColonne(\"benefices.nbc\").valeur[i] ,  self.getColonne(\"benefices.pa\").valeur[i] ,  self.getColonne(\"benefices.pv\").valeur[i]  )" )
        self.getColonne("benefices.benef").valeur = intermediaire
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

    

tabCal = benefices()
tabadd = input('rentrer les addresses des csv des schemas tables etranger : ')
tabCal.AjoutColonneReference([tabadd])
couradd = input('rentrer l\'addresses du csv du schema table courrant : ')
tabCal.importationCSV(couradd)
tabCal.calcul()
if not(tabCal.verificationFinal()):
	raise Exception("erreur de contrainte")
tabCal.ExportationCSV()

