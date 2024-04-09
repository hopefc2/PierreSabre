package personnages;
public class Yakuza extends Humain {

    private String clan;

    private int reputation;



    public Yakuza(String nom, String boissonFavorite, int quantiteArgent, String clan) {

        super(nom, boissonFavorite, quantiteArgent);

        this.clan = clan;

        this.reputation = 0;

    }



    public void extorquer(Commercant victime) {

        int sommeExtorquee = victime.seFaireExtorquer();

        gagnerArgent(sommeExtorquee);

        reputation += 1;

        parler("Marco, si tu tiens à la vie donne moi ta bourse !");

        parler("J’ai piqué les " + sommeExtorquee + " sous de Marco, ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");

    }

    public int perdre() {

        parler("J’ai perdu mon duel et mes " + getArgent() + " sous, snif... J'ai déshonoré le clan de " + clan + ".");

        int perdu = getArgent();

        perdreArgent(perdu);

        reputation -= 1;

        return perdu;

    }



    public void gagner(int gain) {

        gagnerArgent(gain);

        reputation += 1;

        parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");

    }



    public int getReputation() {

        return reputation;

    }

}





