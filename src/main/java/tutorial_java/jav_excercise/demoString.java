package tutorial_java.jav_excercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class demoString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Pls enter a username: ");
//		String s = sc.next();
//		System.out.println("Pls enter a password: ");
//		String p = sc.next();
//		if (s.equalsIgnoreCase("hello") && p.length()>=6){
//			System.out.println("Access granted!");
//		} else
//			System.out.println("Access denied!");
//		String[] s = new String[]{"Nguyen Van Tuan", "Tran Huy Minh", "Nguyen My Hanh", "Le My Tho"};
//		for (int i = 0; i < s.length; i++) {
//			if (s[i].startsWith("Nguyen") || s[i].endsWith("Tuan"))
//				System.out.println(s[i].toUpperCase());
//			if (s[i].contains("My")){
//				int lastId = s[i].lastIndexOf(" ");
//				System.out.println(s[i].substring(lastId + 1));
//			}
//		System.out.println("Pls enter some content: ");
//		String content = sc.nextLine();
//		System.out.println("Pls enter word to find: ");
//		String find = sc.nextLine();
//		System.out.println("Pls enter replace content: ");
//		String replace = sc.nextLine();
//		if (content.contains(find)) {
//			System.out.println("New string is: " + content.replace(find,replace));
//		} else
//			System.out.println("Content does not contain that word!");
//		System.out.println("Pls enter some number: ");
//		String someNumb = sc.next();
//		String[] stringNumb = someNumb.split(",");
//
//		for (String numb : stringNumb){
//			int x = Integer.parseInt(numb);
//			if (x%2==0){
//				System.out.println(x + " is even");
//				}
//			}

		String regMa = "[A-Z]{5}";
//		System.out.println("Moi nhap pass: ");
//		String pass = sc.nextLine();
		String regPass = "^[a-zA-Z]{7}$";
//		System.out.println("Moi nhap ten nhan vien: ");
//		String name = sc.nextLine();
		String regName = "[a-zA-Z]+";
		boolean validMaNV = false;
		boolean validPass = false;
		boolean validName = false;
		String maNV;
		String pass;
		String name;
		do {
			System.out.println("Moi nhap ma nhan vien: ");
			maNV = sc.nextLine();
			System.out.println("Moi nhap pass: ");
			pass = sc.nextLine();
			System.out.println("Moi nhap ten nhan vien: ");
			name = sc.nextLine();
			if (!maNV.matches(regMa)){
				System.out.println("Can it nhat 5 ky tu viet hoa.");
				} else
					validMaNV = true;
			if (!pass.matches(regPass)){
				System.out.println("Mk can it nhat 7 ky tu bao gom chu hoa va chu thuong.");
				} else
					validPass = true;
			if (!name.matches(regName)){
				System.out.println("Chi dung alphabet va ky tu trang.");
				} else
					validName = true;
			} while (!validMaNV || !validPass || !validName);
		System.out.println("Ma nhan vien la: " + maNV);
		System.out.println("MK nhan vien la: " + pass);
		System.out.println("Ten nhan vien la: " + name);
		}
	}