package tutorial_java.jav_excercise;

import java.util.Scanner;

public class nguyenDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap so a: ");
		int a = sc.nextInt();
		System.out.println("Moi nhap so b: ");
		int b = sc.nextInt();
		int phanNg = a / b;
		int phanDU = a % b;
		System.out.println("Phan nguyen la: " + phanNg);
		System.out.println("Phan du la: " + phanDU);
	}
}
