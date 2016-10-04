//Stack is first in last out Structure (LIFO) Structure .
//Perform common operations of stack push, pop, display elements in Stack.

package com.session7.assign1Stack;

public class Ass1Stack {

private static final int stackSize = 4;
int stackArry[] = new int[stackSize];
int head = -1;
//int tail = 0;

//display the elements in the stack
public void display()
{
	if (head >= 0)
	{
	System.out.println("Elements in the stack are: ");
	for (int i = 0;i<=head;i++)
	{
		System.out.println(stackArry[i]);
	} 
	}else {
		System.out.println("Stack is empty");
	}	
}

//push: add an item at the head of the stack
public void push (int pushedElment)
{
	if (head < stackSize -1){
		head++;
		stackArry[head]=pushedElment;
		System.out.println(pushedElment + " is pushed to the stack");
		display();
	} else {
		System.out.println("Overflow.");
	}
}

//pop: remove an item at the head of the stack
public void pop ()
{
	if (head >= 0)
	{
		head--;
		System.out.println("Element in the stack is removed");
		display();
	} else 
	{
		System.out.println("System is underflow");
	}
}

//main method 

public static void main(String[] arg){
	Ass1Stack myStack = new Ass1Stack();
	myStack.display();
	myStack.push(40);
	myStack.push(30);
	myStack.push(20);
	myStack.push(10);
	
	myStack.pop();
	myStack.pop();
	myStack.pop();
	myStack.pop();
	myStack.pop();
}
}
