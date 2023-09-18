package tutorial_java;

import java.util.Scanner;

public class timNguyenDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter number a: ");
		int a = sc.nextInt();
		System.out.println("Pls enter number b: ");
		int b = sc.nextInt();
		timNguyenDu ngDu = new timNguyenDu();
		ngDu.calculate(a,b);
	}
	public void calculate(int a, int b){
		int phanNg = a / b;
		int phanDu = a % b;
		System.out.println("Phan nguyen la: " + phanNg);
		System.out.println("Phan du la: " + phanDu);
	}
}
