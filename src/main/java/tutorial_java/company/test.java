package tutorial_java.company;

public class test {
	public static void main(String[] args) {
//		Employee emp1 = new Employee("Nv1","Bac Ninh",123456);
//		double luong_emp1 = emp1.tinhLuong();
//		System.out.println(luong_emp1);

		// tao doi tuong la nhan vien hanh chinh
		AdministrativeStaff emp2 = new AdministrativeStaff("Nv2", "Hai Phong",324561);
		double luong_emp2 = emp2.tinhLuong();
		System.out.println("Luong nhan vien hanh chinh la: " + luong_emp2);
		// tao doi tuong di ca
		ShiftSraff shift1 = new ShiftSraff("Nv3","Ha Noi",123657);
		double luong_shift1 = shift1.tinhLuong();
		System.out.println("Luong nhan vien di ca 1 la: " +luong_shift1);

		ShiftSraff shift2 = new ShiftSraff("Nv4","Tu Son",192832,2);
		double shift2_luong = shift2.tinhLuong();
		System.out.println("Luong nhan vien di ca 2 la: " + shift2_luong);
	}
}
