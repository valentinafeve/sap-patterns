package memento;

public class Originator {

	private String article;
	
	public void set(String newArticle) {
		article = newArticle;
	}
	
	public Memento storeInMemento() {
		return new Memento(article);
	}
	
	public String restoreFromMemento(Memento memento) {
		article = memento.getArticle();
		return article;
	}
}
