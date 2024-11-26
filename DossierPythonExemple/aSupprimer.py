import tkinter as tk

def changer_texte():
    # Modifier le texte du bouton
    texte_bouton.set("Texte modifié")

# Créer la fenêtre principale
root = tk.Tk()
root.title("Changer texte bouton")

# Créer une variable StringVar pour gérer le texte
texte_bouton = tk.StringVar()
texte_bouton.set("Texte initial")

# Créer le bouton avec la variable
bouton = tk.Button(root, textvariable=texte_bouton, command=changer_texte)
bouton.pack(pady=10)

# Bouton pour tester un changement via une autre fonction
def reset_texte():
    texte_bouton.set("Texte initial")

bouton_reset = tk.Button(root, text="Réinitialiser", command=reset_texte)
bouton_reset.pack(pady=10)

# Boucle principale
root.mainloop()
