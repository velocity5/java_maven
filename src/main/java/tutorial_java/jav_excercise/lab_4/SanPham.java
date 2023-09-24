package tutorial_java.jav_excercise.lab_4;

import java.util.Scanner;

public class SanPham {
	private String tenSP;
	private double donGia;
	double giamGia;


	public static void main(String[] args) {
		SanPham sp1 = new SanPham("Reno 10",12.000,0.01);
		SanPham sp2 = new SanPham("Reno 9", 8.000);
		sp1.setTenSP("Reno 8");
		sp2.setTenSP("Samsung Z-Flip");
//		sp1.tenSP = "Reno 11";
//		sp1.inPut();
//		sp2.inPut();
		sp1.outPut();
		sp2.outPut();
	}
	private SanPham(String tenSP, double donGia, double giamGia){
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}

	public void setTenSP(String tenSP){
		this.tenSP = tenSP;
	}
	private SanPham(String tenSP, double donGia){
		this(tenSP,donGia,0);
	}
//	public void inPut() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Moi nhap ten san pham: ");
//		this.tenSP = sc.nextLine();
//		System.out.println("Moi nhap don gia: ");
//		this.donGia = sc.nextDouble();
//		System.out.println("Giam gia: ");
//		this.giamGia = sc.nextDouble();
//	}
	private double thueNhapKhau(){
		return this.donGia*10/100;
	}

	public void outPut(){
		System.out.println("Ten san pham: " + this.tenSP);
		System.out.println("Don gia: " + this.donGia);
		System.out.println("Giam gia: " + this.giamGia);
		System.out.println("Thue nhap khau la: " + thueNhapKhau());
	}
}
