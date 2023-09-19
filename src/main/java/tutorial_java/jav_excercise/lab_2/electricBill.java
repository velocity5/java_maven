package tutorial_java.jav_excercise.lab_2;

import java.util.Scanner;

public class electricBill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter the electric number: ");
		int eNum = sc.nextInt();
		tinhTien(eNum);
	}
	public static void tinhTien(int eNum){
		int eMoney;
		if (eNum <= 50) {
			eMoney = eNum * 1000;
			System.out.println(eMoney);
		} else {
			eMoney = 50 * 1000 + (eNum - 50) * 1200;
			System.out.println(eMoney);
		}
	}
}
