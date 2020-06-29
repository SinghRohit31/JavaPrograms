package com.JavaInterview;

public class PrimeNumber {

	public static void main(String[] args) {
//		checkNumberPrime(37);
		
		primeNumber();
	}

/*	public static void checkNumberPrime(int number) {
		boolean isPrime = true;

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Number is Prime Number");
		} else {
			System.out.println("Number is not Prime Number");
		}

	}*/

	public static void primeNumber(){
		for(int i=1; i < 100; i++){

            boolean isPrime = true;

            //check to see if the number is prime
            for(int j=2; j < i ; j++){

                    if(i % j == 0){
                            isPrime = false;
                            break;
                    }
            }
            // print the number
            if(isPrime)
                    System.out.print(i + " ");
    }
	}
}	
