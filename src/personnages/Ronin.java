package personnages;

public class Ronin extends Humain{
	
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom,boissonFavorite,argent);
		this.honneur = honneur;
	}
	
	public void donner(Commercant beneficiaire) {
		
		int argentDonne = argent/10;
		parler(beneficiaire.getNom() + " prends ces " + argentDonne + " sous.");
		perdreArgent(argentDonne);
		beneficiaire.gagnerArgent(argentDonne);
		beneficiaire.recevoir(argentDonne);
		honneur += 1;
	} 
	
}