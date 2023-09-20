package tutorial_java.jav_excercise.lab_2;

import java.util.Scanner;

public class menuGoibai {
	public static void main(String[] args) {
		menuGoibai mb = new menuGoibai();
		mb.menu();
	}
	public void menu(){
		System.out.println("====================================");
		System.out.println("Pls select a function from 1-3:");
		System.out.println("1. Linear Equation");
		System.out.println("2. Electricity Money Counting");
		System.out.println("3. Quit");
		System.out.println("====================================");
		Scanner sc = new Scanner(System.in);
		int ans = sc.nextInt();
		switch (ans){
			case 1:
				System.out.println("1. Calculating the equation...");
				ptb1.tinhToan(0,0);
				break;
			case 2:
				System.out.println("2. Calculating the bill...");
				electricBill.tinhTien(50);
				break;
			case 3:
				System.out.println("Shutting down...");
				System.exit(0);
				break;
		}
		sc.close();
	}
}
