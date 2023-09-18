package tutorial_java.jav_excercise;

import java.util.Arrays;
import java.util.Scanner;

public class alphabetSort {
	public static void main(String[] args) {
		String temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter a string: ");
		int count = sc.nextInt();
		String s[] = new String[count];
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Pls enter value for each string: ");
		for (int i = 0; i < count; i++){
			s[i] = sc1.nextLine();
		}
		sc.close();
		sc1.close();
		for (int i = 0; i < count; i++){
			for (int j = i + 1; j < count; j--){
				if (s[i].compareTo(s[j]) > 0){
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		System.out.println("String after sort is: ");
		for (int i = 0; i <= count - 1; i++)
		{
			System.out.print(s[i] + ", ");
		}
	}
}
