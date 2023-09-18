package tutorial_java.enumPack;

public class SV {
	// thuoc tinh
	private int ma;
	private String ten;
	private Double diemTB;
	private xepLoai loai;
	// constructor

	public SV(int ma, String ten, Double diemTB) {
		this.ma = ma;
		this.ten = ten;
		this.diemTB = diemTB;
		this.loai = getLoai();
	}

	// method
	public xepLoai getLoai() {
		if (this.diemTB >= 8)
			loai = xepLoai.Gioi;
		else if (this.diemTB >= 6.5)
			loai = xepLoai.Kha;
		else if (this.diemTB >= 5.0)
			loai = xepLoai.TB;
		else if (this.diemTB >= 3.0)
			loai = xepLoai.Yeu;
		else
			loai = xepLoai.Loai;
		return loai;
	}
	// toString

	@Override
	public String toString() {
		return ma + "\t" + ten + "\t" + this.loai.descript();
	}
}
