package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP5 {
	
	public static void main(String[] args) {
		
		// INITIALISATION DES PERSONNAGES
		Commercant marco = new Commercant("Marco",20);
		Commercant chonin =  new Commercant("Chonin", 40);
		Commercant kumi =  new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		// SCENARIO DE MARCO QUI FAIT CONNAISSANCE
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		
		// SCENARIO DIRE BONJOUR / CLAN YAKUZA
		yaku.direBonjour();
		
	}
}