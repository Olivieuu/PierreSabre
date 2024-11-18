package personnages;

public class Humain {
	
	protected String nom;
	protected String boissonFavorite;
	protected int argent;
	
	private int nbHumain = 0;
	private Humain[] memoire = new Humain[30];
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	
	protected void parler(String texte) {
		System.out.println("(" + getNom() + ")" + " - " + texte);
	}
	
	protected void parlerSansSautDeLigne(String texte) {
		System.out.print("(" + getNom() + ")" + " - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + boissonFavorite);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if(argent - prix > 0) {
			parler("J'ai " + getArgent() + " en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
		}
		else {
			parler("Je n'ai plus que " + getArgent() + " en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		}
	}
	
	public int gagnerArgent(int gain) {
		argent += gain;
		return gain;
	}
	
	public int perdreArgent(int gain) {
		argent -= gain;
		return gain;
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	
	private void memoriser(Humain autreHumain) {
		
		nbHumain ++;
		
		if (nbHumain > memoire.length) {
			for(int i=0;i<nbHumain-2;i++) {
				memoire[i] = memoire[i+1];
			}
			nbHumain --;
		}
		
		memoire[nbHumain-1] = autreHumain;
	}
	
	public void repondre(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain);
	}
	
	public void listerConnaissance() {
		parlerSansSautDeLigne("Je connais beaucoup de monde comme : ");
		int cpt = 0;
		for(int i=0;i<nbHumain-1;i++) {
			System.out.print(memoire[i].getNom() + ", ");
			cpt ++;
		}
		System.out.println(memoire[cpt].getNom());
	}
}