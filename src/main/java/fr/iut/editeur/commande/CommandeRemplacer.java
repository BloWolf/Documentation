package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument{

    /**
     * Remplace une portion du texte par une autre chaine de caractère
     * @param document le document dans lequel effectuer les modifications
     * @param parameters paramètres d'appel de la fonction
     */
    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : remplacer;start;end{;texte}");
            return;
        }
        String texte = "";
        if(parameters.length>3){
            texte=parameters[3];
        }
        this.document.remplacer(Integer.parseInt(parameters[1]),Integer.parseInt(parameters[2]),texte);
        super.executer();
    }
}
