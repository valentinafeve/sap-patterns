package memento;

public class Memento {

	private String article;

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public Memento(String article) {
		super();
		this.article = article;
	}
}
