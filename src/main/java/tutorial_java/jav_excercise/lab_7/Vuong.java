package tutorial_java.jav_excercise.lab_7;

public class Vuong extends ChuNhat{
	public double canh;

	public Vuong(double canh) {
		super(canh,canh);
		this.canh = canh;
	}

	@Override
	public double getChuVi(){
		return canh*4;
	}
	public double getDienTich(){
		return Math.pow(canh,2);
	}
	public void xuat() {
		System.out.println("Canh hinh vuong la: " + canh);
		System.out.println("Dien tich hinh vuong la: " + getDienTich());
		System.out.println("Chu vi hinh vuong la: " + getChuVi());
	}
}
