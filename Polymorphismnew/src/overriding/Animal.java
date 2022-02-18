package overriding;


 public class Animal {
	public void sound() {
		System.out.println("Animal is making a sound");
	}
}
class Horse extends Animal {
	public void sound() {
		System.out.println("Neigh");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Animal obj = new Horse();
		obj.sound();
	}

}
class Cat extends Animal {
	public void sound() {
		System.out.println("Meow");
	}
	public static void main(String[] args) {
		Animal obj = new Cat();
		obj.sound();	
	}
}