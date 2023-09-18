package tutorial_java;

import java.util.Scanner;

public class checkChanLe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter a number: ");
		int n = sc.nextInt();
		if (n%2==0)
			System.out.println("Number " + n + " is even");
		else
			System.out.println("Number " + n + " is odd");
	}
}
