package tutorial_java.jav_excercise.lab_1;

import java.util.Scanner;

public class lapPhuong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap canh hinh lap phuong: ");
		double sides = sc.nextDouble();
		double v = Math.pow(sides,3);
		System.out.println(v);
	}
}
