package class_study;

enum AnimalCategory{
	DOG, CAT, LION, TIGER, ELEPHANT
}

public class Animal {
	
	AnimalCategory type;
	String size;
	
	public Animal() {
		this.type = AnimalCategory.DOG;
		this.size = "귀엽고 작다.";
	}
	
	public void InitInfo() {
		this.type = AnimalCategory.DOG;
		this.size = "귀엽고 작다.";
	}
	
	public void showInfo() {
		System.out.println("동물이름: " + type);
		System.out.println("크기: " + size);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj = new Animal();
		//obj.InitInfo();
		obj.showInfo();
	}

}
