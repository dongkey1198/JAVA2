package abstractPractice;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer computer = new Desktop();
		computer.display();
		computer.typing();
		computer.turnOff();
		
		Computer myNote = new MyNoteBook();
		myNote.display();
		myNote.typing();
		
	}

}
