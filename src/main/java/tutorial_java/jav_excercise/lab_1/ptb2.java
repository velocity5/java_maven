package tutorial_java.jav_excercise.lab_1;

import java.util.Scanner;

public class ptb2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap so a (a khac 0): ");
		double a = sc.nextDouble();
		System.out.println("Moi nhap so b: ");
		double b = sc.nextDouble();
		System.out.println("Moi nhap so c: ");
		double c = sc.nextDouble();
		String kq = Ptbac2(a,b,c);
		System.out.println("KQ ptb 2: " + kq);
		}
	public static String Ptbac2(double a, double b, double c){
		double delta = Math.pow(b,2) - 4*a*c;
		if (delta > 0){
			double x1 = (-b+Math.sqrt(delta)/ 2*a);
			double x2 = (-b-Math.sqrt(delta)/ 2*a);
			return "PT co 2 nghiem phan biet: x1= " + x1 + " x2=" + x2;
		} else if (delta == 0) {
			double x = (-b/(2*a));
			return "PT co nghiem kep: " + x;
		} else
			return "PT vo nghiem";
		}
	}
