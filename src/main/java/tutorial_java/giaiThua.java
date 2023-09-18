package tutorial_java;

import java.util.Scanner;

public class giaiThua {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter n: ");
		int n = sc.nextInt();
		int fact = 1;
//		for (int i = 1; i <= n; i++){
//			fact*=i;
//		}
//		System.out.println("Factorial of " + n + " is: " + fact);
//		int i = 1;
//		while (i<=n) {
//			fact*=i;
//			i++;
//		}
//		System.out.println("Factorial of " + n + " is: " + fact);
		int sum = 0; // dung de cong don
		for (int i = 1; i <= n; i++) {
			fact*=i;
			sum+=fact;
//			System.out.println(i);
//			System.out.println(fact);
		}
		System.out.println("Sum of a Factorial is: " + sum);
	}
}
