package com.nt.common;

import java.lang.reflect.Field;

public class ReflecionAPI_Test {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		Person person = new Person();

		Field field = Person.class.getDeclaredField("name");
	   field.setAccessible(true);
	   field.set(person,"shreeshail");
	   
	   Field roleField = Person.class.getDeclaredField("role");
	   roleField.setAccessible(true);
	   roleField.set(person, "Cricketer");
	   
	   
	   System.out.println("Updated name : "+field.get(person));
	   System.out.println("Updated role : "+roleField.get(person));
	}

}

class Person{
	
	private String name = "John";
	private String role = "Professor";
}