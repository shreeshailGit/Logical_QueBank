package com.nt.collection;

public class StackMain {

	public int arr[];
	public int top;
	public int capacity;
	
	
	public StackMain(int size) {
		arr  = new int[size];
		this.top = -1;
		this.capacity = size;
	}
	
	public void push(int x) {
		if(isFull()) {
			System.out.println("Stack OverFlow!");
		}
		System.out.println("Inserting "+x);
		arr[++top] = x;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack underFlow!");
		}
		System.out.println("Removing Element "+arr[top]);
		return arr[top--];
	}
	
	public int peak() {
		if(!isEmpty()) {
			return arr[top];
		}else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}
	
	public boolean isFull() {
		return top == capacity - 1;
	}
	
	public boolean isEmpty() {
		return top == - 1;
	}	
	
	//peak() - Returns the element on the top of the stack, but does not remove it.
	//pop() - Removes and returns the top element of the stack. An ‘EmptyStackException’ 
    //        An exception is thrown if we call pop() when the invoking stack is empty.
	//firstElement() -	Returns the first component (the item at index 0) of this vector.
	
	public static void main(String[] args) {
		StackMain v = new StackMain(3);
		//v.push(1);v.push(2);
        v.pop();
        v.pop();
        v.push(3);
        System.out.println("Element at top = "+v.peak());
	}

}
