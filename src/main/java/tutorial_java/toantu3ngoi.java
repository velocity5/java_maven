package tutorial_java;

import java.util.Scanner;

public class toantu3ngoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number: ");
		int n = sc.nextInt();
		String reply = (n%2==0)?"Even":"Odd";
		System.out.println("The number " + n + " is: " + reply);
	}
}
