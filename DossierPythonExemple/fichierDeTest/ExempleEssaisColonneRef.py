import csv
from enum import Enum






#la classe des contraintes
class Contrainte:
    def __init__(self, message, actionContrainte, comparatifs, colonnes):
        self.message = message
        self.actionContrainte = actionContrainte
        self.comparatifs = comparatifs
        self.colonnes = colonnes



class colonne:
    valeur = []
    type = "str"
    nom = ""

    def __init__(self,nom,type):
        self.valeur = []
        self.type = type
        self.nom = nom





class RefCroise:

    colonnesImport = []
    colonnesReference = []
    colonnesCalcule = []
    

    def __init__(self):
        self.colonnesImport = [colonne("Open","float")]


        

    #permet de vérifier que la matrice est conforme
    #argument : - self classe
    #sortie : booléen, retourne true si le fichier à bien été importé et false sinon
    # affiche les messages d'avertissements ou d'éreurs 
    def verificationImport(self,contenue):  
       
        tableau = []
        #vérification
        for ligne in range(1,len(contenue)):
            for colonne in range (0,len(contenue[ligne])) :
                 
        


                #vérification de type
                try :
                    contenue[ligne][colonne]  = eval(self.colonnesImport[colonne].type + "(\"" + contenue[ligne][colonne] + "\")")    

                    #ajout de la valeur dans le tableau 
                    self.colonnesImport[colonne].valeur.append(contenue[ligne][colonne])        
                except Exception as e:
                    print("mauvais type de données ligne : " + str(ligne) + ", colonne : " + str(colonne))
                    return False      
            
            #vérification des contraintes     
   
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
                            print("retour False reférence")                                                 
        except Exception as e:
            print("Erreur dans l'importation de reférérence")



        
    #permet d'ajouter les colonnes des autres tableaux
    def AjoutColonneReference(self,addresseTabRef):
        return 0

    #permet de vérifier que les calculs sont les bons
    #argument : - self classe
    #sortie : booléen, retourne true si le fichier à bien été importé et false sinon
    # affiche les messages d'avertissements ou d'éreurs 
    def verificationFinal(self):  
        return True


    def calcul(self):
        #rien ici
        return 0
    
