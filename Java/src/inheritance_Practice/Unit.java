package inheritance_Practice;

public class Unit implements Box, Cube {
	
	public Unit() {}
	
	@Override
	public int volume(int value) {
		return value;
	}

	@Override
	public int area(int value) {
		return value;
	}

}
