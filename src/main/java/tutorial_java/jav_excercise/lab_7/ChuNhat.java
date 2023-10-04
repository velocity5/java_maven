package tutorial_java.jav_excercise.lab_7;

public class ChuNhat {
	private double rong;
	private double dai;

	public ChuNhat(double rong, double dai) {
		this.rong = rong;
		this.dai = dai;
	}

	public double getChuVi(){
		return (rong + dai) * 2;
	}
	public double getDienTich(){
		return rong * dai;
	}
	public void xuat(){
		System.out.println("Do dai hinh chu nhat la: " + dai);
		System.out.println("Do rong hinh chu nhat la: " + rong);
		System.out.println("Dien tich hinh chu nhat la: " + getDienTich());
		System.out.println("Chu vi hinh chu nhat la: " + getChuVi());
	}
}
