package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajucules extends CommandeDocument{

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
