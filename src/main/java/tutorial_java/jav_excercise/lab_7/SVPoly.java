package tutorial_java.jav_excercise.lab_7;

public abstract class SVPoly {
	String hoTen;
	String nganh;
	public SVPoly(String hoTen, String nganh){
		this.hoTen = hoTen;
		this.nganh = nganh;
	}
	public abstract double getDiem();
	public String getHocLuc(){
		return (getDiem() < 5) ? "Yeu" : (getDiem() >= 5 && getDiem() < 6.5) ? "TB" : (getDiem() >= 6.5 && getDiem() < 7.5) ?
				"Kha" : (getDiem() >= 7.5 && getDiem() < 9) ? "Gioi" : (getDiem() >= 9) ? "Xuat sac" : "Ko phai diem";
	}
	public void outPut(){
		System.out.println("Ho ten sinh vien: " + hoTen);
		System.out.println("Nganh hoc: " + nganh);
		System.out.println("Diem: " + getDiem());
		System.out.println("Hoc luc: " + getHocLuc());
	}
}
