package mediator;

import java.util.ArrayList;

public class MarriageMediator implements Mediator {

	private ArrayList<Interested> interestedPeople;
	private ArrayList<MarriageOffer> accepting;
	private ArrayList<MarriageOffer> offering;
	
	public MarriageMediator() {
		
		super();
		this.interestedPeople = new ArrayList<Interested>();
		this.offering =  new ArrayList<MarriageOffer>();
		this.accepting =  new ArrayList<MarriageOffer>();
	}

	@Override
	public void offerMarriage(double gift, double prestige, double love, String name) {
		
		System.out.println("Adding offer from "+name+"...");
		MarriageOffer marriageOffer = new MarriageOffer(gift, prestige, love, name);
		offering.add(marriageOffer);	
		
	}

	@Override
	public void acceptMarriage(double gift, double prestige, double love, String name) {
		int index = 0;
		System.out.println("Trying to accept a proposal.");
		for (MarriageOffer marriageOffer : offering) {
			if (marriageOffer.getGift() >= gift+1000 && marriageOffer.getPrestige() >= prestige+0.1 && marriageOffer.getLove() >= love) {
				System.out.println("Is getting married with "+name);
				accepting.add(marriageOffer);
				offering.remove(index);
			}
			index++;
		}
	}

	@Override
	public void addInterested(Interested interested) {
		// TODO Auto-generated method stub
		interestedPeople.add(interested);
		
	}

	public ArrayList<Interested> getInterestedPeople() {
		return interestedPeople;
	}

	public void setInterestedPeople(ArrayList<Interested> interestedPeople) {
		this.interestedPeople = interestedPeople;
	}

	public ArrayList<MarriageOffer> getAccepting() {
		return accepting;
	}

	public void setAccepting(ArrayList<MarriageOffer> accepting) {
		this.accepting = accepting;
	}

	public ArrayList<MarriageOffer> getOffering() {
		return offering;
	}

	public void setOffering(ArrayList<MarriageOffer> offering) {
		this.offering = offering;
	}

	

}
