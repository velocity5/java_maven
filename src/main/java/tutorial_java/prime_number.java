/*
For loop: Vs so lan lap co dinh thi dung
While loop - DoWhile loop: Su dung vs so lan lap ko co dinh
 */
package tutorial_java;
import java.util.Scanner;
public class prime_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int p = sc.nextInt();
		if (isPrime(p)){
			System.out.println("Number " + p + " is not Prime");
		} else
			System.out.println("Number " + p + " is Prime");
	}
	public static boolean isPrime(int p){
		if (p<2)
			return false;
		for (int i = 2; i <= Math.sqrt(p); i++){
			if (p%i == 0) {
				return false;
			}
		}
		return true;
	}
}