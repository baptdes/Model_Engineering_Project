
import csv
from tkinter import * 
from tkinter import filedialog
from matplotlib import pyplot as plt 
X=[]
Y=[]





#interface graphique
fenetre = Tk()


Frame1 = Frame(fenetre, borderwidth=2, relief=GROOVE)
Frame1.pack(side=LEFT, padx=30, pady=30)


Frame2 = Frame(fenetre, borderwidth=2, relief=GROOVE)
Frame2.pack(side=LEFT, padx=10, pady=10)


Frame3 = Frame(Frame2, bg="white", borderwidth=2, relief=GROOVE)
Frame3.pack(side=RIGHT, padx=5, pady=5)


labelRepGraphique = Label(fenetre, text="Représenation Graphique")
labelRepGraphique.pack()


labelConfirmationImportation = Label(Frame1, text="En attente d'importation")
labelConfirmationImportation.pack()

def Estimporter() :
    global contenue
    chemin_fichier = filedialog.askopenfilename(
        title="Importer un fichier",
        filetypes=[("Tous les fichiers", "*.csv*")]
    )
    if chemin_fichier:  
        labelConfirmationImportation.config(text=f"Fichier importé : {chemin_fichier}")
    else:
        labelConfirmationImportation.config(text="Aucun fichier sélectionné.")

    try:
        with open(chemin_fichier, mode='r', encoding='utf-8') as fichier:
                fichierCSV = fichier
                lecteur_csv = csv.reader(fichier)
                contenue = [ligne for ligne in lecteur_csv]  
    except Exception as e:
        labelConfirmationImportation.config(text="Erreur lors de la lecture du fichier.")
        print(f"Erreur : {e}") 

bouton=Button(Frame1, text="importer un fichier CSV", command=Estimporter)
bouton.pack()







# X
labelX = Label(Frame3, text="Colonnes pour l'axe des abscisses")
labelX.pack()
listeX = Listbox(Frame3,  selectmode=SINGLE)
listeX.insert(END, "id")
listeX.insert(END, "pa")
listeX.insert(END, "pv")
listeX.insert(END, "nbc")
listeX.insert(END, "benef")
listeX.pack()

def selectionX():
    global colonneX 
    colonneX = listeX.curselection()

listeXBouton = Button(Frame3 , text="Selectionner X", command= selectionX)
listeXBouton.pack()

# X
labelY = Label(Frame3, text="Colonnes pour l'axe des abscisses")
labelY.pack()
listeY = Listbox(Frame3,  selectmode=SINGLE)
listeY.insert(END, "id")
listeY.insert(END, "pa")
listeY.insert(END, "pv")
listeY.insert(END, "nbc")
listeY.insert(END, "benef")
listeY.pack()

def selectionY():
    global colonneY 
    colonneY = listeY.curselection()
listeYBouton = Button(Frame3 , text="Selectionner Y", command=selectionY)
listeYBouton.pack()


# bouton de sortie
def afficherGraph(): 
        for ligne in contenue :
            X.append(ligne[colonneX[0]])
            Y.append(ligne[colonneY[0]])
            a=[float(i) for i in X[1:]]
            b=[float(i) for i in Y[1:]]
        plt.plot(a,b)
        plt.show()
        fenetre.destroy()

boutonRepGraphique=Button(fenetre, text="Représentation Graphique", command=afficherGraph)
boutonRepGraphique.pack()


fenetre.mainloop()


