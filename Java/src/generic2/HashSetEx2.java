package generic2;

import java.util.HashSet;
class Animal{
	String species;
	String habitat;
	
	public Animal(String species, String habitat) {
		this.species = species;
		this.habitat = habitat;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Animal) {
			Animal tmp = (Animal)obj;
			return species.equals(tmp.species) && habitat.equals(tmp.habitat);
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (species + habitat).hashCode();
	}
	
}

public class HashSetEx2 {

	public static void main(String[] args) {
		
		HashSet<Animal> hs = new HashSet<Animal>();
		hs.add(new Animal("고양이","육지"));
		hs.add(new Animal("고양이","육지"));
		hs.add(new Animal("개","육지"));
		System.out.println(hs.size());
	}

}
