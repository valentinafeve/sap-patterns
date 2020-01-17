package mediator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarriageMediator lisaveta = new MarriageMediator();
		Aglaya aglaya = new Aglaya(lisaveta);
		Mishkin mishkin = new Mishkin(lisaveta);
		Prince prince = new Prince(lisaveta);
		
		mishkin.offerMarriage(20000, 0.3, 0.8);
		prince.offerMarriage(50000, 0.8, 0.4);
		aglaya.acceptMarriage(10000, 0, 0.7);
		
	}

}
