package com.JavaInterview;

public class LeapYear {

	public static void main(String[] args) {
		leapYear(1900);
	}

	public static void leapYear(int year) {
		// leap year means year that is divisible by 4 for all the century
		// years- ending with 00
		// and century year is leap year if it is perfectly divisible by 400
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("Year is Leap Year " + year);
				} else {
					System.out.println("Year is not a leap year " + year);
				}
			} else {
				System.out.println("Year is Leap Year " + year);
			}

		}else{
			System.out.println("Year is leap Year "+  year);
		}
		

	}
}
