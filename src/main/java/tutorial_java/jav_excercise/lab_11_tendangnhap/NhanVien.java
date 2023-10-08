package tutorial_java.jav_excercise.lab_11_tendangnhap;

import java.util.Scanner;

public class NhanVien {
	String maNV;
	String hoTen;
	int tuoi;
	float luong;

	public NhanVien(){}
	public NhanVien(String maNV, String hoTen, int tuoi, float luong) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.luong = luong;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public float getLuong() {
		return luong;
	}

	public void setLuong(float luong) {
		this.luong = luong;
	}

	@Override
	public String toString() {
		return "NhanVien {" +
				"maNV='" + maNV + '\'' +
				", hoTen='" + hoTen + '\'' +
				", tuoi=" + tuoi +
				", luong=" + luong +
				'}';
	}

	public static void main(String[] args) {
		NhanVien nv = new NhanVien();
		nv.input();
		System.out.println(nv);
	}
	public int input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap ma nhan vien: ");
		String manv = sc.nextLine();
		this.setMaNV(manv);
		System.out.println("Moi nhap ho ten: ");
		String hoten = sc.nextLine();
		this.setHoTen(hoten);
		System.out.println("Moi nhap tuoi: ");
		int tuoi = Integer.parseInt(sc.nextLine());
		this.setTuoi(tuoi);
		System.out.println("Moi nhap luong: ");
		float luong = Float.parseFloat(sc.nextLine());
		this.setLuong(luong);
		return tuoi;
	}
}
