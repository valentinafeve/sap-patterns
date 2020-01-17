package universe;

public interface Fights {
	
	String fight();

}


// If the Magic creature fights
class DoFight implements Fights{

	@Override
	public String fight() {
		return "Fighting hard.";
	}
	
}

//If the magic creature doesn't fight
class DoesntFight implements Fights{

	@Override
	public String fight() {
		return "Standing back.";
	}
	
}