package tutorial_java.jav_excercise;

import java.util.Scanner;

public class switch_caseExcercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap chu cai: ");
		char ch = sc.next().charAt(0);
		boolean isVowel = switch (ch) {
			case 'A', 'I', 'U', 'E', 'O', 'a', 'i', 'u', 'e', 'o' -> true;
			default -> false;
		};
		if (isVowel) {
				System.out.println(ch + " la nguyen am");
			} else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
					System.out.println(ch + " la phu am");
				} else
					System.out.println("Ko nam trong bang chu cai");
			}
		}
