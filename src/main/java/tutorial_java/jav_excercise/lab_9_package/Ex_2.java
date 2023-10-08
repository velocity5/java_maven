package tutorial_java.jav_excercise.lab_9_package;

import java.util.Scanner;

public class Ex_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap so a (a != 0): ");
		int a = sc.nextInt();
		System.out.println("Moi nhap so b: ");
		int b = sc.nextInt();
		System.out.println("Moi nhap so c: ");
		int c = sc.nextInt();
		double delta = Math.pow(b, 2) - 4 * a * c;
		if (delta < 0)
			System.out.println("PT vo nghiem");
		else if (delta == 0) {
			System.out.println("PT co nghiem kep: ");
			System.out.println("x1 = x2 = " + -b / (2 * a));
		} else {
			System.out.println("PT co 2 nghiem phan biet");
			System.out.println("Nghiem x1 = " + (-b + Math.sqrt(delta) / (2 * a)));
			System.out.println("Nghiem x2 = " + (-b - Math.sqrt(delta) / (2 * a)));
		}

	}
}
