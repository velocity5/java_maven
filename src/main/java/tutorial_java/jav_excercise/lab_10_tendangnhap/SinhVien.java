package tutorial_java.jav_excercise.lab_10_tendangnhap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SinhVien {
	private String masv;
	private String hoten;
	private double diem;
	private String xeploai;

	public SinhVien(String masv, String hoten, double diem, String xeploai) {
		this.masv = masv;
		this.hoten = hoten;
		this.diem = diem;
		this.xeploai = xeploai;
	}

	public SinhVien() {}

	public String getMasv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public String getXeploai() {
		return xeploai;
	}

	public void setXeploai(String xeploai) {
		this.xeploai = xeploai;
	}
	public void setXepLoai(){
		if (diem >= 8)
			xeploai = "Gioi";
		else if (diem >= 7) {
			xeploai = "Kha";
		} else if (diem >= 5) {
			xeploai = "TB";
		} else
			xeploai = "Kem";
	}
	public void input(){
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Moi nhap ma sinh vien: ");
			String masv = sc.nextLine();
			this.setMasv(masv);
		} catch (Exception e) {
			System.out.println("Du lieu can nhap la kieu chuoi ");
		}
		try {
			System.out.println("Moi nhap ho ten: ");
			String hoten = sc.nextLine();
			Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
			Matcher matcher = pattern.matcher("fgdfgfGHGHKJ68");
			this.setHoten(hoten);
			if (!matcher.find()){
				throw new Exception("Khong phai ho ten can nhap");
			}
		} catch (Exception e) {
			System.out.println("Du lieu can nhap phai la kieu chuoi. Moi nhap lai ");
			hoten = sc.nextLine();
		}
		try {
			System.out.println("Moi nhap diem: ");
			double diem = Double.parseDouble(sc.nextLine());
			this.setDiem(diem);
		} catch (NumberFormatException nfe){
			System.out.println("Du lieu can nhap la kieu so thap phan. Moi nhap lai ");
			diem = Double.parseDouble(sc.nextLine());
		}
	}
	@Override
	public String toString() {
		return "SinhVien{" +
				"masv='" + masv + '\'' +
				", hoten='" + hoten + '\'' +
				", diem=" + diem +
				", xeploai='" + xeploai + '\'' +
				'}';
	}
}
