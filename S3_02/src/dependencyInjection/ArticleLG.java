package dependencyInjection;

public class ArticleLG implements IArticle{

	String nom;
	float preu; //Euros per defecte
	
	public ArticleLG(String nom, float preu) {
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
