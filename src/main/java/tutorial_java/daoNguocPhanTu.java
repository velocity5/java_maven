package tutorial_java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class daoNguocPhanTu {
	public static void main(String[] args) {
		int counter, i,j,temp;
		int num[] = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter a list of number: ");
		counter = sc.nextInt();
		for (i = 0; i < counter; i++){
			System.out.println("Element " + (i+1)+ ": ");
			num[i] = sc.nextInt();
		}
		j = i - 1;
		i = 0;
		sc.close();
		while (i<j){
			temp = num[i];
			num[i] = num[j];
			num[j] = temp;
			i++;
			j--;
		}
		System.out.println("Reverse array: ");
		for (i=0; i<counter;i++){
			System.out.println(num[i] + " ");
		}
	}
}
