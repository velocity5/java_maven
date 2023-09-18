package tutorial_java.jav_excercise;

import java.util.Scanner;

public class palinDrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter a string to be check: ");
		String s = sc.next();
		s = s.toLowerCase();
		boolean f = true;
		for (int i = 0; i < s.length(); i++){
			if (s.charAt(i) != s.charAt(s.length()-i-1)){
				f = false;
				break;
			}
		} if (f) {
			System.out.println("This " + s + " is a Palidrome");
		} else
			System.out.println("Given string is not a Palidrome");
	}
}
