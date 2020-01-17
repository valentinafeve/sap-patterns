package mediator;

public interface Mediator {

	
	public void offerMarriage(double gift, double prestige, double love, String name);
	public void acceptMarriage(double gift, double prestige, double love, String name);
	public void addInterested(Interested interested);
}
