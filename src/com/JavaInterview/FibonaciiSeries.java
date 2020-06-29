package com.JavaInterview;

public class FibonaciiSeries {

	// 0 1 1 2 3 5 8 13 21 34

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacci(10);
	}

	public static void fibonacci(int number) {
		int a = 0, b = 1, temp=0;
		for (int i = 1; i <= number; i++) {
			System.out.println(a);
			temp = a + b;
			a = b;
			b = temp;
		}
	}
}
