package tutorial_java.jav_excercise;

import java.util.Scanner;

public class if_else_excercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap nam de check: ");
		int yrs = sc.nextInt();
		if (yrs%400==0 && yrs%100==0){
			System.out.println("Day la nam nhuan");
		} else
			System.out.println("Day ko phai la nam nhuan");
	}
}
