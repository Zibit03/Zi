import java.util.Scanner;

public class RunAnimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dog d = new Dog();
		Cat c = new Cat();
		Bird b = new Bird();
		
		System.out.println("Choose an animal. Press B for Bird, C for Cat, D for Dog: ");
		String input = sc.nextLine();
			if (input.equalsIgnoreCase("B")) {
				b.eat();
				b.sleep();
				b.makeSound();
		  	}
		  	else if (input.equalsIgnoreCase("C")) {
				c.eat();
				c.sleep();
				c.makeSound();
		  	}
		  	else if (input.equalsIgnoreCase("D")) {
				d.eat();
				d.sleep();
				d.makeSound();
		  	}
			else {
				System.out.println("Invalid Input");
		}
}
}