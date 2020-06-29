package com.JavaInterview;

public class QuotiontReminder {
	static int quotient,reminder;

	public static void main(String[] args) {
		quotiontReminder(30, 4);
	}

	public static void quotiontReminder(int dividend, int divisor){
		quotient=dividend/divisor;
		System.out.println("Quotient is : "+quotient );
		
		reminder=dividend %divisor;
		System.out.println("Reminder is : "+reminder );
	}
	
}
