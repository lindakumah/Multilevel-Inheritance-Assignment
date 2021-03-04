package multilrvelInheritance;

class Person{
	public void nationality() {
		System.out.println("I am a Ghanaian");
	}
	
	public void place() {
		System.out.println("I stay in Takoradi ");
	}
}

class Emp extends Person{
	public void Organization() {
		System.out.println("I will soon work for Amalitech!");
	}
	
	public void place() {
	super.place();
	}
}

class Manager extends Emp{
	public void Subordinates() {
		System.out.println("Amalitech has amazing Surbordinates");
	}
	
	public void place() {
	super.place();
	}
}

public class Q3 {

	public static void main(String[] args) {
		Manager lyn = new Manager();
		lyn.Subordinates();
		lyn.place();

	}

}
