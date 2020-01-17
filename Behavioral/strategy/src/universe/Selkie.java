package universe;

public class Selkie extends MagicCreature{

	public Selkie(String name, String kingdom) {
		super(name, kingdom, "selkie");
		
//		Selkies doesnt fight
		setFightingType(new DoesntFight());
		
	}

}
