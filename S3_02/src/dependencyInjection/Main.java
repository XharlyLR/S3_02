package dependencyInjection;

public class Main {

	public static void main(String[] args) {
		IArticle art1 = new ArticleSamsung("TV Samsung 55' SQ2435", 599.99f);
		IArticle art2 = new ArticleLG("TV LG 45' H66474e", 549.95f);
		
		ConvertidorMonedes convM = new ConvertidorEurDol();
		convM.setArticle(art1);
		
		System.out.println("El preu de " + art1.getNom() + " en dolars es: " + convM.convertirMonedes());

	}

}
