package tutorial_java;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter a number: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++){
			System.out.print(fibo(i) + " ");
		}
	}
	/*
	Tinh so fibonacci thu n
	 */
//	public static int fibo(int n){
//		int F0=0;
//		int F1=1;
//		int Fn=1;
//		if (n<0){
//			return -1;
//		} else if (n == 0 || n == 1){
//			return n;
//		} else
//			for (int i = 2; i< n; i++){
//				F0 = F1;
//				F1 = Fn;
//				Fn = F0 + F1;
//			}
//		return Fn;
//	}
	public static int fibo(int n){
		if (n<0){
			return -1;
		} else if (n==0 || n == 1) {
			return n;
		} else
			return fibo(n-1) + fibo(n-2);
	}
}
