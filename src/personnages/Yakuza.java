package personnages;

public class Yakuza extends Humain{
	
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFavorite, int argent) {
		super(nom,boissonFavorite,argent);
		this.clan = clan;
		this.reputation = reputation;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + " si tu tiens à la vie donne moi ta bourse !");
        int argentVictime = victime.argent;
		gagnerArgent(victime.argent);
		victime.seFaireExtorquer();
        parler(" J’ai piqué les " + argentVictime + " sous de Marco, ce qui me fait " + argent + " sous dans ma poche. Hi ! Hi !");
        reputation += 1;
	} 
	
}