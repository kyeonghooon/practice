package practice;

class Animal{
	public static void A() {
		System.out.println("static method in Animal");
	}
	public void B() {
		System.out.println("method in Animal");
	}
}

public class Dog extends Animal {
	public static void A() {
		System.out.println("static method in Dog");
	}
	public void B() {
		System.out.println("method in Dog");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Animal a = dog;
		a.A();
		dog.A();
		a.B();
		dog.B();
	}

}
