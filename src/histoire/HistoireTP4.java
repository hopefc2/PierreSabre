package histoire;

import personnages.Humain;

public class HistoireTP4 {
	String noms;
	public static void main(String[] argv) {
		System.out.println("texte");
		Humain prof =new Humain("prof", "kombucha", 54);
		prof.direBonjour();
		prof.boire();
		prof.acheter("jeu", 2);
		Commercant proff=new Commercant()
        Commercant marco = new Commercant("Marco", 20);

	Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
	marco.direBonjour();
	yakuLeNoir.direBonjour();
	yakuLeNoir.extorquer(marco);
	marco.recevoir(15);
	marco.boire();
	Commercant marco = new Commercant("Marco", 20);
	Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
	Ronin roro = new Ronin("Roro", 60);
	roro.direBonjour();
	roro.donner(marco);
	}

	

}


