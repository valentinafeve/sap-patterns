package mediator;

public class MarriageOffer {

	private double gift;
	private double prestige;
	private double love;
	private String name;
	
	public MarriageOffer(double gift, double prestige, double love, String name) {
		super();
		this.gift = gift;
		this.prestige = prestige;
		this.love = love;
		this.name = name;
	}

	public double getGift() {
		return gift;
	}

	public void setGift(double gift) {
		this.gift = gift;
	}

	public double getPrestige() {
		return prestige;
	}

	public void setPrestige(double prestige) {
		this.prestige = prestige;
	}

	public double getLove() {
		return love;
	}

	public void setLove(double love) {
		this.love = love;
	}

	public String getName() {
		return this.name;
	}

	public void setLoverCode(String name) {
		this.name = name;
	}
	
	
	
}
