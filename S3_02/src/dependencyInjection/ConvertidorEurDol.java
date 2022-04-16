package dependencyInjection;

public class ConvertidorEurDol implements ConvertidorMonedes{

	private IArticle article;
	
	@Override
	public void setArticle(IArticle article) {
		this.article = article;
	}
	
	@Override
	public float convertirMonedes() {
		float preuDol;
		
		preuDol = article.getPreu()  * 1.08f;
		
		return preuDol;
	}
}
