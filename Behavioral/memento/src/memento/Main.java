package memento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CareTaker caretaker = new CareTaker();
		Originator originator = new Originator();
		
		originator.set("Today is a bautiful day.");
		
		caretaker.addMemento(originator.storeInMemento());
		
		
		
	}

}
