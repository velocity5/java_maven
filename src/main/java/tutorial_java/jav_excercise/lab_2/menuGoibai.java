package tutorial_java.jav_excercise.lab_2;

import java.util.Scanner;

public class menuGoibai {
	public static void main(String[] args) {
		menuGoibai mb = new menuGoibai();
		mb.menu();
		ptb1.tinhToan(4,3);
//		electricBill.tinhTien(100);
	}
	void ptb1(){
		new ptb1();
	}
	void tienDien(){
		new electricBill();
	}
	public void menu(){
		System.out.println("====================================");
		System.out.println("Moi lua chon chuc nang tu 1-3:");
		System.out.println("1. Tinh PT bac 1");
		System.out.println("2. Tinh tien dien");
		System.out.println("3. Ket thuc");
		System.out.println("====================================");
		Scanner sc = new Scanner(System.in);
		int ans = sc.nextInt();
		switch (ans){
			case 1:
				System.out.println("1. Giai PT bac 1");
				ptb1();
				break;
			case 2:
				System.out.println("2. Tinh tien dien");
				tienDien();
				break;
			case 3:
				System.out.println("3. Ket thuc");
				System.exit(0);
				break;
		}
		sc.close();
	}
}
