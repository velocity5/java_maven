/*

 */
package tutorial_java;

import java.util.Random;

public class ranDom {
	public static void main(String[] args) {
		Random rd = new Random();
		// lay ngau nhien so nguyen
		int soNguyen = rd.nextInt(-50,51); // chay tu -50 den < 51
		System.out.println(soNguyen);
	}
}
