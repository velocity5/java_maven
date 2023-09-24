package tutorial_java.jav_excercise.lab_3;

import java.util.Arrays;
import java.util.Scanner;

public class arraySort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter number of array: ");
		int n = sc.nextInt();
		int[] num = new int[n];
		System.out.println("Pls enter value of array: ");
		Arrays.sort(num);
		for (int i = 0; i < n; i++){
			num[i] = sc.nextInt();
		}
		System.out.println("The value of array are: ");
		show(num);
	}
	public static void show(int[] num){
		// Minimum number in array
//		int min = num[0];
//		for (int i = 0; i < num.length;i++){
//			if (min > num[i]) {
//				int minNum = Math.min(min,num[i]);
//				System.out.println("Minimum number in array is: " + minNum);
//			}
		// TB cong cac phan tu chia het cho 3
		int sum = 0;
		int count = 0;
		for (int x : num){
			if (x % 3 == 0){
				sum+=x;
				count++;
				}
			}
		System.out.println("TB cong cac so chia het cho 3 la: " + sum/count);
		}
	}