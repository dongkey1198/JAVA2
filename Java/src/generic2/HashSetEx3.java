package generic2;

import java.util.HashSet;

class Person{
	String aa;
	String bb;
	
	Person(String aa, String bb){
		this.aa = aa;
		this.bb = bb;
	}
	@Override
	public int hashCode() {
		return  aa.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person tmp = (Person)obj;
			if(this.aa.equals(tmp.aa)) {
				return true;
			}
		}
		else {
			return false;
		}
		return false;
	}
	
}
public class HashSetEx3 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Person> aa = new HashSet<Person>();
		Person person1 = new Person("aa","aaa");
		Person person2 = new Person("aa","aaa");
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		
		aa.add(person1);
		aa.add(person2);
		
		System.out.println(aa.size());
		
	}

}
