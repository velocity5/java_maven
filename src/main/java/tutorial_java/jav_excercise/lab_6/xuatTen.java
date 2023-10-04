package tutorial_java.jav_excercise.lab_6;

import java.util.Scanner;

public class xuatTen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap ho ten: ");
		String fullName = sc.nextLine();
		String familyName = fullName.substring(0,fullName.indexOf(" "));
		String middleName = fullName.substring(fullName.indexOf(" "),fullName.lastIndexOf(" ")).trim();
		String name = fullName.substring(fullName.lastIndexOf(" ")).trim();
		System.out.println(familyName.toUpperCase());
		System.out.println(name.toUpperCase());
		System.out.println(middleName);
		sc.close();
	}
}
