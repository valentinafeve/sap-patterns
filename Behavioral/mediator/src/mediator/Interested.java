package mediator;

public abstract class Interested {

	private Mediator mediator;
	private String name;
	
	public Interested(Mediator mediator, String name) {
		super();
		this.mediator = mediator;
		this.name = name;
	}
	
	public void offerMarriage(double gift, double prestige, double love) {
		mediator.offerMarriage(gift, prestige, love, this.name);
	}
	
	public void acceptMarriage(double gift, double prestige, double love) {
		mediator.acceptMarriage(gift, prestige, love, this.name);
	}
}
