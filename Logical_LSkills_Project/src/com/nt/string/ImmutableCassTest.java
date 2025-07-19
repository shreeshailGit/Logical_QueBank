package com.nt.string;
//Q How to make the Immutable class
public  final class ImmutableCassTest {

	private final int i;
	
	public ImmutableCassTest(int i) {
		this.i = i;
	}
	
	public ImmutableCassTest modify(int i) {
	       
		 if(this.i == i) {
			 return this;
		 }else {
			 return new ImmutableCassTest(i);
		 }
	}
	
	public static void main(String[] args) {

		ImmutableCassTest t1 = new ImmutableCassTest(100);
		ImmutableCassTest t2 = t1.modify(10);
		ImmutableCassTest t3 = t1.modify(100);
	
		System.out.println(t1 == t2);
		System.out.println(t1 == t3);
		
		
		//second exmaple
		Student s1 = new Student("Alice",20);
		System.out.println(s1);
		
		//s1.setName("Smith");s1.setAge(10);
		Student s2 = new Student("Smith",10);
		System.out.println(s2);
	}

}

final class Student{
    
    private final String name;
    private final int age;
    
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    @Override
    public String toString() {
        return "Student [Name: " + name + ", Age: " + age + "]";
    }
    
}
