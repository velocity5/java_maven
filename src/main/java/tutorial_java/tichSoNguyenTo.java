/*
Static: su dung de tham chieu thuoc tinh chung cua tat ca cac doi tuong
(ma ko la duy nhat).
Chi lay bo nho 1 lan.
 */
package tutorial_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tichSoNguyenTo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter a number: ");
		int n = sc.nextInt();
		List<Integer> listNumbs = phanTichSoNguyen(n);
		System.out.printf("KQ: %d = ", n);
		int size = listNumbs.size();
		for (int i = 0; i < size - 1; i++) {
			System.out.print(listNumbs.get(i) + " * ");
		}
		System.out.println(listNumbs.get(size - 1));
	}

	public static List<Integer> phanTichSoNguyen(int n) {
		int i = 2;
		List<Integer> listNumbs = new ArrayList<Integer>();
		while (n > 1) {
			if (n % i == 0) {
				n /= i;
				listNumbs.add(i);
			} else
				i++;
		}
		if (listNumbs.isEmpty()){
			listNumbs.add(n);
		}
		return listNumbs;
	}
}
