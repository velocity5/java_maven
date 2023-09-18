package tutorial_java;

import java.util.Scanner;

public class tongLe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap so le n: ");
		int n = sc.nextInt();
		int sum = 0;
		if (n%2!=0){
			for (int i = 1; i<=n;i+=2) {
				//if (i == 3 || i % 2 == 0)
				if (i == 3)
					break;
				else
					sum+=i;
			}
			System.out.println("Tong so le tu 1 den " + n + " la: " + sum);
		}
	}
}
