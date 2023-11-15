package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajucules extends CommandeDocument{

    /**
     * Permet de passer une partie du texte en majuscule
     * @param document le document dans lequel effectuer les modifications
     * @param parameters paramètres d'appel de la fonction
     */
    public CommandeMajucules(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3){
            System.err.println("Format attendu : majuscules;start;end");
        }
        this.document.majuscules(Integer.parseInt(parameters[1]),Integer.parseInt(parameters[2]));
        super.executer();
    }
}
