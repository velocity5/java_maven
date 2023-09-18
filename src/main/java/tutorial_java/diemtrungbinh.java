package tutorial_java;

import java.util.Scanner;

public class diemtrungbinh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter score: ");
		double n = sc.nextDouble();
		String rank = (n>8 && n<=10)?"Gioi":((6.5<=n && n<8)?"Kha":(5<=n && n<6.5)?"TB":(n<5)?"Yeu":"Diem ko hop le");
		System.out.println("Diem trung binh " + n + " co xep loai la " + rank);
	}
}
