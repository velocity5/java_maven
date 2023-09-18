package tutorial_java;

import java.util.Scanner;

public class daoNguocPhanTu {
	public static void main(String[] args) {
		int mangN, i = 0, j = 0, temp;
		int number[] = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu mang: ");
		mangN = sc.nextInt();
		for (i = 0; i < mangN; i++){
			System.out.println("Phan tu " + (i+1)+": ");
			number[i] = sc.nextInt();
		}
		j = i - 1;
		i=0;
		sc.close();
		while (i<j){
			temp = number[i];
			number[i] = number[j];
			number[j] = temp;
			i++;
			j--;
		}
		System.out.println("Mang dao nguoc la: ");
		for (i=0;i<mangN;i++){
			System.out.println(number[i] + " ");
		}
	}
}
