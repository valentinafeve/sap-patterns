package universe;

public class MagicCreature {

	private String name;
	private String  kingdom;
	private String creatureType;
	private Fights fightingType;
	
	public MagicCreature(String name, String kingdom, String creatureType) {
		super();
		this.name = name;
		this.kingdom = kingdom;
		this.creatureType = creatureType;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the kingdom
	 */
	public String getKingdom() {
		return kingdom;
	}
	/**
	 * @param kingdom the kingdom to set
	 */
	public void setKingdom(String kingdom) {
		this.kingdom = kingdom;
	}
	/**
	 * @return the creatureType
	 */
	public String getcreatureType() {
		return creatureType;
	}
	/**
	 * @param creatureType the creatureType to set
	 */
	public void setcreatureType(String creatureType) {
		this.creatureType = creatureType;
	}
	
	
	/**
	 * @return the creatureType
	 */
	public String getCreatureType() {
		return creatureType;
	}

	/**
	 * @param creatureType the creatureType to set
	 */
	public void setCreatureType(String creatureType) {
		this.creatureType = creatureType;
	}

	/**
	 * @return the fightingType
	 */
	public Fights getFightingType() {
		return fightingType;
	}

	/**
	 * @param fightingType the fightingType to set
	 */
	public void setFightingType(Fights fightingType) {
		this.fightingType = fightingType;
	}

	public String tryToFight() {
		return fightingType.fight();
	}
	
}
