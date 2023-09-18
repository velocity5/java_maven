package tutorial_java.Dahinh;

public class test {
	public static void main(String[] args) {
		NhanSu ns1 = new phoPhong("Minh","Ha Noi","1234567");
		System.out.println(ns1.tinhLuong(22));
		System.out.println("Khi dang lam PP: ");
		System.out.println(ns1.getTen() + " " + ns1.getCccd() + " " + ns1.getQue());
		System.out.println("Khi dang lam TP: ");
		System.out.println(ns1.getTen() + " " + ns1.getCccd() + " " + ns1.getQue());
		ns1 = new truongPhong(ns1.getTen(), ns1.getCccd(), ns1.getQue());
		System.out.println(ns1.tinhLuong(22));
	}
}
