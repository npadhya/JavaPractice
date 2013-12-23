package com.nikul.javapractice.stack;

public class TestStack {

	public static void main(String[] args){
		StackImpl stack = new StackImpl();
		
		stack.stackPush("this");
		stack.stackPush("is");
		stack.stackPush("good");
		stack.stackPush("day");
		
		stack.showStack();
		
		System.out.println(stack.stackPop());
		System.out.println(stack.stackPop());
		stack.stackPush("some");
		stack.stackPush("seven");
		stack.stackPush("nice");
		
		stack.showStack();
	}
}
