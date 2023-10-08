package tutorial_java.inherite;

public class nhanVien {
	public String hoTen;
	protected double luong;
	public nhanVien(String hoTen,double luong){
		this.hoTen = hoTen;
		this.luong = luong;
	}
	void hienThongTin(){

	}
	private double thueTN(double tax){
		tax = 0.01;
		return thueTN(tax);
	}
}
