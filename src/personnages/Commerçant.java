package personnages;

public class Commer�ant extends Humain {
	public Commercant(String nom, int quantiteArgent) {

        super(nom, "th�", quantiteArgent);

    }



    public int seFaireExtorquer() {

        int somme = getArgent(); 

        perdreArgent(somme); 

        parler("J�ai tout perdu! Le monde est trop injuste...");

        return somme;

    }



    public void recevoir(int quantiteArgent) {

        gagnerArgent(quantiteArgent); 

        parler(quantiteArgent + " sous ! Je te remercie g�n�reux donateur!");

    }

}
