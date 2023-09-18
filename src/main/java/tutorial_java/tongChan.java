package tutorial_java;

import java.util.Scanner;

public class tongChan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter number: ");
		int a = sc.nextInt();
		int sum = 0;
		if (a % 2 != 0)
			System.out.println("I don't calculate the odd number");
		else {
			for (int i = 0; i <= a; i++) {
				sum+=i;
			}
			System.out.println("Sum of a is " + sum);
		}
	}
}
