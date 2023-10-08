package tutorial_java.jav_excercise.lab_9_package;

import java.util.Scanner;

public class Ex_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap ban kinh R: ");
		double r = sc.nextDouble();
		double s = Math.pow(r,2)*Math.PI;
		double c = 2*r*Math.PI;
		System.out.println("Dien tich hinh tron la: " + s);
		System.out.println("Chu vi hinh tron la: " + c);
	}
}
