package multilrvelInheritance;

class Electronics{
	public void device_type() {
	    System.out.println("This is an Electronic device");
	}
}

class Television extends Electronics{
	 public void category() {
		System.out.println("The Electronic device is a Television");
	}
}
 
class LED extends Television{
	public void display_tech() {
		System.out.println("The technology is LED");
	}
}

public class Q1 {

	public static void main(String[] args) {
		Television A = new Television();
		A.device_type();
		
		Electronics B = new Television();
		B.device_type();
		
		Television C = new Television();
		C.category();
		
		Television D = new LED();
		D.category();
		
		LED E = new LED();
		E.display_tech();
		
	}

}
