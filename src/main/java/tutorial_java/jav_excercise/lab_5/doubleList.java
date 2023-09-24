package tutorial_java.jav_excercise.lab_5;

import java.util.ArrayList;
import java.util.Scanner;

public class doubleList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> lst = new ArrayList<>();
		System.out.println("Moi nhap so phan tu mang: ");
		do {
			double x = sc.nextDouble();
			lst.add(x);

			System.out.println("Ban co muon nhap tiep (Y/N)?");
			if (sc.nextLine().equalsIgnoreCase("N"))
				break;
		} while (sc.hasNextDouble());
		sc.close();
		System.out.println(lst);
		double sum = 0;
		for (Double aDouble : lst) {
			sum += aDouble;
		}
		System.out.println(sum);
	}

}
