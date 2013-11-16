package com.nikul.javapractice.stack;

public class TestStack {

	public static void main(String[] args){
		StackImpl stack = new StackImpl();
		
		stack.stackPush(3);
		stack.stackPush(4);
		stack.stackPush(5);
		stack.stackPush(9);
		
		stack.showStack();
		
		System.out.println(stack.stackPop());
		System.out.println(stack.stackPop());
		stack.stackPush(6);
		stack.stackPush(7);
		stack.stackPush(8);
		
		stack.showStack();
	}
}
