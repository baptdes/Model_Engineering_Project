import csv
import tkinter
from tkinter import * 
from tkinter import filedialog
from tkinter import StringVar
from matplotlib import pyplot as plt 

#librairie pyton
# permet de mettre en place la librairie python réutilisable
#
#




















#interface graphique
# permet de mettre en place l'interface graphique d'un tableur
# avec utilisation de la librairie ci-dessus
#
#


#instantiation des objets




#aspects graphiques
fenetre = Tk()

Frame1 = Frame(fenetre, borderwidth=2, relief=GROOVE)
Frame1.pack(side=LEFT, padx=30, pady=30)


boutonGraphic=Button(Frame1, text="graphic", command=fenetre.quit)
boutonGraphic.pack()
boutonCalcul=Button(Frame1, text="calcul", command=fenetre.quit)
boutonCalcul.pack()
boutonImport=Button(Frame1, text="importer un CSV", command=fenetre.quit)
boutonImport.pack()


#fonction pour les cases
Frame2 = Frame(fenetre, borderwidth=2, relief=GROOVE)
Frame2.pack(side=LEFT, padx=10, pady=10)
listFrame = []
listBouton = []
listtext = []


for i in range(0,10):
     sousListe = []
     for j in range(0,10):
        var = tkinter.StringVar()
        var.set("0")
        sousListe.append(var)
     listtext.append(sousListe)

def modifier(boutonI) :
    fenetreModifier = Tk()
    Frame1 = Frame(fenetreModifier, borderwidth=2, relief=GROOVE)
    Frame1.pack(side=LEFT, padx=30, pady=30)
    T = Text(Frame1, height = 5, width = 52)
    L = Label(Frame1, text="Entrez un nombre")
    def valider():
            try :
                text = T.get("1.0","end-1c")
                boutonI.config(text=float(text))
                fenetreModifier.destroy()
            except Exception : 
                L.config(text="Entrez un nombre valide")
    b1 = Button(Frame1, text = "valider", command = valider)
    L.pack()
    T.pack()
    b1.pack()


#création des cases du tableau
frame = Frame(Frame2, borderwidth=2, relief=GROOVE)
listFrame.append(frame)
for j in range(1,10) : 
    bouton = Button(listFrame[0], text=j)
    bouton.pack(pady=5)
frame.pack(side=LEFT, padx=10, pady=10)

def creer_boutons():
    for i in range(1,10) :
        frame = Frame(Frame2, borderwidth=2, relief=GROOVE)
        listFrame.append(frame)
        for j in range(1,10) : 
            bouton = Button(listFrame[i], text="0")
            bouton.pack(pady=5)
            bouton.config(command=lambda b=bouton: modifier(b))
        frame.pack(side=LEFT, padx=10, pady=10)

creer_boutons()

fenetre.mainloop()

