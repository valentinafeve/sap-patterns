package universe;

public class Fairy extends MagicCreature{

	
	public Fairy(String name, String kingdom) {
		
		super(name, kingdom, "fairy");
		
//		Fairies fight
		setFightingType(new DoFight());
		
	}
	
}
