package com.nt.common;

public class Covariant_Test {

	public static void main(String[] args) {
		Parent p = new Child();
       Animal a = p.getAnimal();//Works
       Dog d = ((Child)p).getAnimal(); // No cast needed if reference is Child
       
       
		/*      int b = 09;//CE error: integer number too large
		      int c = 9;
		      System.out.println(b == c); //CE
		      
		      int f = 07;   // octal for decimal 7
		      int e = 010;  // octal for decimal 8
		*/       
	}

}

class Animal { }
class Dog extends Animal{ }

class Parent{
	public Animal getAnimal() {
		System.out.println("Calling Parent class Method");
		return new Animal();
	}
}

class Child extends Parent{
	public Dog getAnimal() {  // Allowed: Dog is a subclass of Animal
		System.out.println("Calling Child class Method");
		return new Dog();
	}
}