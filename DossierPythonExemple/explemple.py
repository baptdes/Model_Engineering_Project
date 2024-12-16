# -*- coding: utf-8 -*-
"""
librairie test fichier exemple sur l'exemple du cours
"""
import csv



class Autorisation:
    valeurAutorisees 
    messageErreur
    autorisation
    
    def __init__(self,nom,messageErreur):
        self._nom = nom
        self._messageErreur = messageErreur
        
    def setNom(nom):
        self._nom = nom
    
    def getNom():
        return self._nom
    
    def setMessageErreur(messageErreur):
        self._nom = nom
    
    def getMessageErreur():


class Contraintes:
    nom
    messageErreur
    autorisation
    
    def __init__(self,nom,messageErreur):
        self._nom = nom
        self._messageErreur = messageErreur
        
    def setNom(nom):
        self._nom = nom
    
    def getNom():
        return self._nom
    
    def setMessageErreur(messageErreur):
        self._nom = nom
    
    def getMessageErreur():
        return self._messageErreur



class Colonne:
    nom
    id
    contraines
    
    def __init__(self,nom,id,contraintes):
        self._nom = nom
        self._id = id
        self._contraintes = contraintes
        
    def setNom(nom):
        self._nom = nom
    
    def getNom():
        return self._nom
    
    def setId(id):
        self._id = id
    
    def getId():
        return self._id
    
    def setContraintes(contraintes):
        self._contraintes = contraintes
    
    def getContraintes():
        return self._contraintes


class SchemaTable:
    nom
    colonnes
    
    def __init__(self,nom, colonnes):
        self._nom = nom
        self._colonnes = colonnes
        
    def setNom(nom):
        self._nom = nom
    
    def getNom():
        return self._nom
    
    def setColonnes(colonnes):
        self._colonnes = colonnes
    
    def getColonnes():
        return self._colonnes
    
    
    

class Tableau:
    valeurs
    
    
    def __init__(self,valeurs):
        self._valeurs = valeurs
        
    def setValeurs(nom):
        self._valeurs = valeurs
    
    def getValeurs():
        return self._valeurs
    
    def modifier(val,ligne,colonne):
        valeur[ligne][colonne] = val
        
    #fonction listLigne->listColonn e->float
    def calcul(fonction,listLigne,listColonne):
        return fonction(listLigne,listColonne)
    

class ExportImport:
    schemaTable
    exceptionCSVNonConforme
    

    
    def __init__(self,schemaTable):
        self._schemaTable = schemaTable
        
    def verifier(fichierCSV):
        return 0
        
        
    def exporter(tableau,fichierCSV):
        with open('fichierCSV', 'w', newline='') as file:
            writer = csv.writer(file, delimiter=';')
            writer.writerows(tableau.getValeurs)
        
    
    def importer(fichierCSV):
        try 
            verifier(fichierCSV)
            valeurs = []
            with open('fichierCSV', newline='') as csvfile:
                reader = csv.DictReader(csvfile)
                for row in reader:
                    valeurs.append(row.split(','))
            return Tableau(valeurs)
       except exceptionCSVNonConforme as e:
           print("le csv n'est pas conforme")
           
           
           
           
           
SchemaTabletransfer = schemaTable()


ExportImport = ExportImport(schemaTabletransfer)


        
            

        
        
        
    
    

