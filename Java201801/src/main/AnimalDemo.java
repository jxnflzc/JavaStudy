package main;

import animal.*;

public class AnimalDemo {
	public static void main(String[] args) {
		Animal cat1 = new animal.Cat();
		Animal dog1 = new animal.Dog();
		Animal pig1 = new animal.Pig();
		cat1.eat();
		cat1.work();
		dog1.eat();
		dog1.work();
		pig1.eat();
		pig1.work();
	}
}
