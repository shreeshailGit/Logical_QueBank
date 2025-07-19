package com.nt.string;

public class MyClass {

	    private int id;
	    private String name;

	    // Constructor, getters, setters, etc.

	    public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "MyClass [id=" + id + ", name=" + name + "]";
		}

		public MyClass(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		@Override
	    public int hashCode() {
	        int result = 17; // Choose a prime number as the initial value
	        result = 31 * result + id; // Combine hash code of id
	        result = 31 * result + (name != null ? name.hashCode() : 0); // Combine hash code of name (null-safe)
	        return result;
	    }

				
	public static void main(String[] args) {
		MyClass mc = new MyClass(101, "shreeshai");
		System.out.println(mc.hashCode());//249388262

		String input = "British";
		input.chars().mapToObj(c -> Character.valueOf((char)c)).findFirst().ifPresent(System.out::println);
	}

}
