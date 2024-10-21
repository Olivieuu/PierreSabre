package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	
	public static void main(String[] args) {

//		SCENARIO DE HUMAIN
		Humain prof = new Humain("Prof","kombucha",54);

		prof.direBonjour();
		prof.boire();

		prof.acheter("une boisson", 12);
		prof.perdreArgent(12);
		
		prof.acheter("un jeu", 2);
		prof.perdreArgent(2);
		
		prof.acheter("un kimono", 50);
		
//		SCENARIO DE COMMERCANT
		Commercant marco = new Commercant("Marco","thé",20);
		
		marco.direBonjour();
		
		marco.seFaireExtorquer();
		marco.recevoir(15);
		
		marco.boire();
		
//		SCENARIO DE YAKUZA
		Yakuza yaku = new Yakuza("Yaku le noir","whisky",30);
		
		yaku.direBonjour();
		yaku.extorquer(marco);
		
//		SCENARIO DE RONIN
		Ronin roro = new Ronin("Roro","shochu",60);
		
		roro.direBonjour();
		roro.donner(marco);
	}
	
}
