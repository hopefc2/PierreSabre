package personnages;

public class Humain {

	private String nom;

	private String boissonFavorite;

	private int quantiteArgent;

	public Humain(String nom, String boissonFavorite, int quantiteArgent) {

        this.nom = nom;

        this.boissonFavorite = boissonFavorite;

        this.quantiteArgent = quantiteArgent;

    }

	public String getNom() {	

    	return nom;

    }

    public int getArgent() {

        return quantiteArgent;

    }

    // Method direBonjour

    public void direBonjour() {

        parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite + ".");

    }



    private void parler(String texte) {

    	System.out.println(texte);

		

	}

	// Method boire

    public void boire() {

        parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");

    }



    // Method acheter

    public void acheter(String bien, int prix) {

    	parler("J'ai " + quantiteArgent + "sous en poche.Je vais pouvoir m'offrir un" +bien+ "à"+prix+"sous");

    }

    	

	// Method gagnerArgent

    private void gagnerArgent(int gain) {

        quantiteArgent += gain;

        parler("Super ! J'ai gagné " + gain + " euros.");

    }



    // Method perdreArgent

    private void perdreArgent(int perte) {

        quantiteArgent -= perte;

        parler("Oh non, j'ai perdu " + perte + " euros.");

    }

    

    	

}

