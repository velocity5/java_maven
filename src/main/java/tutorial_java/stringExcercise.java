/*

 */
package tutorial_java;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class stringExcercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Pls enter a string (space ok): ");
//		String chuoi = sc.nextLine();
//		String newChuoi = chuoi.replaceAll(" ","");
//		System.out.println(newChuoi);
//		System.out.println("Moi nhap vao chuoi: ");
//		String chuoi = sc.nextLine();
//		String firstLetter = chuoi.substring(0,1);
//		String remainLetters = chuoi.substring(1,chuoi.length());
//		System.out.println("Chuoi sau khi chuyen doi la: " + firstLetter.toUpperCase() + remainLetters);
		//char[] charArray = chuoi.toCharArray();
		// Viet hoa cac chu cai dau
//		boolean space = true;
//		for (int i = 0; i < charArray.length; i++) {
//			if (Character.isLetter(charArray[i])) {
//				if (space) {
//					charArray[i] = Character.toUpperCase(charArray[i]);
//					space = false;
//				}
//			} else
//				space = true;
//		}
//		chuoi = String.valueOf(charArray);
//		System.out.println("Chuoi sau khi chuyen doi: \n" + chuoi);
		// Chuyen chu thuong -> chu hoa
//		String stringTransform = chuoi.toUpperCase();
//		System.out.println("Chuoi sau khi chuyen doi thanh chu hoa la: " + stringTransform);
		// chuyen doi tu Char -> String
//		System.out.println("Moi nhap vao ky tu");
//		char ch = 'a';
//		String str = Character.toString(ch);
//		System.out.println("Chuoi la: " + str);
//		String str1 = String.valueOf(ch);
//		System.out.println("Chuoi 1 la: " + str1);
		// tim cac ky tu trung lap
		System.out.println("Moi nhap chuoi de check: ");
		String userStr = sc.nextLine();
		stringExcercise obj = new stringExcercise();
		obj.timKiem(userStr);
	}
	public void timKiem(String str){
		HashMap<Character, Integer> map = new HashMap<>();
		// doi chuoi thanh ky tu
		char[] chars = str.toCharArray();
		int count;
		for (int i = 0; i< chars.length; i++){
			count = 1;
			for (int j = i+1;j<chars.length; j++){
				if (chars[i] == chars[j]&&chars[i]!=' '){
					count++;
					chars[j] = '0';
				}
			}
			if (count > 1 && chars[i]!='0')
				System.out.println(chars[i]);
		}
	}
}
