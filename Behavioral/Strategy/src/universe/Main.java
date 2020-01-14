package universe;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MagicCreature bloom = new Fairy("Bloom", "Domino");
		MagicCreature stella = new Fairy("Stella", "Solaria");
		MagicCreature andros = new Fairy("Aisha", "Andros");
		MagicCreature icy = new Witch("Icy", "Dyamond");
		MagicCreature serena = new Selkie("Serena", "Domino");
		MagicCreature phylla = new Selkie("Phylla", "Earth");
		
		System.out.println("Starting a fight...");
		System.out.println("Bloom: "+ bloom.tryToFight());
		System.out.println("Icy: "+ icy.tryToFight());
		System.out.println("Phylla: "+ phylla.tryToFight());
	}

}
