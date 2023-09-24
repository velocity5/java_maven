package tutorial_java.jav_excercise.lab_3;

import java.util.Scanner;

public class primeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter a number: ");
		int num = sc.nextInt();
		if (checkPrime(num)){
			System.out.println("The number " + num + " is not a Prime");
		} else
			System.out.println("The number " + num + " is a Prime");
	}
	public static boolean checkPrime(int num) {
		if (num < 2) {
			return false;
		} else {
			for (int i = 2; i < Math.sqrt(num); i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
}
