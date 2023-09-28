package tutorial_java.jav_excercise.lab_7.QLSV;

public class SinhVien {
	private String masv;
	private String name;
	private String add;
	private double diemTB;
	public SinhVien(String masv, String name, String add, double diemTB){
		this.masv = masv;
		this.diemTB = diemTB;
		this.name = name;
		this.add = add;
	}

	public String getMaSv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	@Override
	public String toString(){
		return "Ho ten: " + name + " " + "MaSV: " + masv + " " + "Dia chi: " + add + "Diem TB: " + diemTB;
	}
}
