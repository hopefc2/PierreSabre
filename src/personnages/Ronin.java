package personnages;
public class Ronin extends Humain {

    private int honneur;



    public Ronin(String nom, int quantiteArgent) {

        super(nom, "shochu", quantiteArgent);

        this.honneur = 1;

    }



    public void provoquer(Yakuza adversaire) {

        int force = honneur * 2;

        if (force >= adversaire.getReputation()) {

            int gain = adversaire.perdre();

            gagnerArgent(gain);

            honneur += 1;

            parler("Je t’ai eu petit yakuza!");

        } else {

            honneur -= 1;

            int perte = perdreArgent();

            adversaire.gagner(perte);

            parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");

        }

    }



    private int perdreArgent() {

        int perdu = getArgent();

        perdreArgent(perdu);

        return perdu;

    }

}


