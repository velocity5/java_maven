package tutorial_java.jav_excercise;

import java.util.Scanner;

public class chuHoaThuong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter some text (Uppercase may include): ");
		String txt = sc.nextLine();
		System.out.println(txt.toLowerCase());
	}
}
