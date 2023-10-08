package tutorial_java.jav_excercise.lab_10_tendangnhap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ExampleArray {
	public static void main(String[] args) {
		int [] soNguyen = new int[5];
			Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < 5; i++){
//			System.out.println("Please enter number " + (i+1) + ":");
//			int numb = sc.nextInt();
//			soNguyen.add(numb);
//		}
		try{
			System.out.println("Please enter number 1: ");
			int num_1 = sc.nextInt();
			soNguyen[0] = num_1;
			System.out.println("Please enter number 2: ");
			int num_2 = sc.nextInt();
			soNguyen[1] = num_2;
			System.out.println("Please enter number 3: ");
			int num_3 = sc.nextInt();
			soNguyen[2] = num_3;
			System.out.println("Please enter number 4: ");
			int num_4 = sc.nextInt();
			soNguyen[3] = num_4;
			System.out.println("Please enter number 5: ");
			int num_5 = sc.nextInt();
			soNguyen[4] = num_5;
			System.out.println("Please enter number 6: ");
			int num_6 = sc.nextInt();
			soNguyen[5] = num_6;
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Mang chi co 5 phan tu");
			}

		int sum = 0;
		for (Integer n:soNguyen){
			sum+=n;
		}
		System.out.println("Sum of the num are: " +sum);
	}
}
