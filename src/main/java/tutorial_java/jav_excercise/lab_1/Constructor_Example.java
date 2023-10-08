package tutorial_java.jav_excercise.lab_1;

public class Constructor_Example {
	public String HoTen;
	public int tuoi;
	public double diem;
	//public Constructor_Example(){}
	public Constructor_Example(String HoTen, int tuoi, double diem){
		this.diem = diem;
		this.HoTen = HoTen;
		this.tuoi = tuoi;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}
	@Override
	public String toString(){
		return "Ho ten: " + HoTen + " " + "Tuoi: " + tuoi + " " + "Diem: " + diem;
	}
}
