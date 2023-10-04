package tutorial_java.jav_excercise.lab_6;

import tutorial_java.jav_excercise.lab_4.SanPham;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class mangSP {
	private final String tenSP;
	 private final double donGia;
	 private final String hang;
	public mangSP(String tenSP, double donGia, String hang){
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.hang = hang;
	}
	@Override
	public String toString(){
		return "Ten: " + tenSP + ", Gia: VND " + donGia + ", Hang: " + hang;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<mangSP> sp = new ArrayList<>();
		Random rd = new Random();

		for (int i = 0; i < 5; i++){
			System.out.println("Moi nhap: " + "Ten san pham " + (i + 1));
			String name = sc.nextLine();
			System.out.println("Moi nhap: " + "Gia san pham " + (i + 1));
			double price = sc.nextDouble();
			sc.nextLine();
			System.out.println("Moi nhap: " + "Hang " + (i + 1));
			String brand = sc.nextLine();
			mangSP msp = new mangSP(name, price, brand);
			int rdIndex = rd.nextInt(sp.size() + 1);
			sp.add(rdIndex, msp);
		}

		outPut(sp);
		sc.close();
		}

	public static void outPut(ArrayList<mangSP> sp){
		System.out.println("Cac mat hang trong san pham la: ");
		for (mangSP msp : sp){
			if (msp.hang.equals("Nokia"))
				System.out.println(msp);
		}
	}
}
