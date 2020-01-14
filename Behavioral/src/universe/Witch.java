package universe;

public class Witch extends MagicCreature{

	public Witch(String name, String kingdom) {
		super(name, kingdom, "witch");
		
//		Witches fight
		setFightingType(new DoFight());
		
	}

	
}
