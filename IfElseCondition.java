package com.digitek.ifcondition;

public class IfElseCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfElseExample();
	}
	
	public static void IfElseExample(){
		
		int number1 = 10;
		int number2 = 20;
		
		if(number1==number2) {
		System.out.println("If Condition#1");
		System.out.println("number1==number2");
		} 
		
		else {
		System.out.println("Else Condition#1");
		System.out.println("number1 is equal to number2");
		}
		
		if(number1!=number2) {
		System.out.println("If Condition#2");
		System.out.println("number1!=number2");
		}
		
		if(number1>=number2) {
		System.out.println("If Condition#3");
		System.out.println("number1>=number2");
		}
		
		if(number1<=number2) {
		System.out.println("If Condition#4");
		System.out.println("number1<='number2");
		}
	}

}
