package universe;

public class Pixie extends MagicCreature{

	public Pixie(String name, String kingdom) {
		super(name, kingdom, "pixie");
		
//		Selkies doesnt fight
		setFightingType(new DoesntFight());
		
	}

}
