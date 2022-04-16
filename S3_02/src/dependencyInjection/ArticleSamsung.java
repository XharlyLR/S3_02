package dependencyInjection;

public class ArticleSamsung implements IArticle{

	String nom;
	float preu; //Euros per defecte
	
	public ArticleSamsung(String nom, float preu) {
		this.nom = nom;
		this.preu = preu;
	}
	
	@Override
	public float getPreu() {
		return preu;
	}

	@Override
	public String getNom() {
		return nom;
	}
}