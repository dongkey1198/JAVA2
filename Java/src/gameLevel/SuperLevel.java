package gameLevel;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("아주 높이 jump 합니다.");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("turn 합니다.");
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("****** 상급자 레벨입니다.*******");
	}
	
	
}
