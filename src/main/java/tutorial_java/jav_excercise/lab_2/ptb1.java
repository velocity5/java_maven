package tutorial_java.jav_excercise.lab_2;

import java.util.Scanner;

public class ptb1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a: ");
		double a = sc.nextDouble();
		System.out.println("Enter number b: ");
		double b = sc.nextDouble();
		tinhToan(a,b);
	}
	public static void tinhToan(double a, double b) {
		if (a == 0) {
			if (b==0){
				System.out.println("Infinity result");
			} else
				System.out.println("Don't have any result");
		} else
			System.out.println("Have 1 result is: " + -b/a);
	}
}
