package tutorial_java.jav_excercise.lab_7.QLSV;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<SinhVien> SV = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int ans;
		do {
			System.out.println("====================================");
			System.out.println("Moi chon chuc nang tu 1-6:");
			System.out.println("1. Nhap sinh vien");
			System.out.println("2. Sua sinh vien bang id");
			System.out.println("3. Xoa sinh vien bang id");
			System.out.println("4. Sap xep sinh vien bang diem TB");
			System.out.println("5. Xuat thong tin sinh vien");
			System.out.println("6. Thoat");
			System.out.println("====================================");
			ans = sc.nextInt();
			switch (ans){
				case 1:
					inputSV(sc);
					break;
				case 2:
					System.out.println("Moi nhap ma sinh vien de sua: ");
					break;
				case 3:
					System.out.println("Moi nhap ma sinh vien de xoa: ");
					break;
				case 4:
					System.out.println("Tien hanh sap xep...");
					SapXep(SV);
					break;
				case 5:
					System.out.println("Dang xuat...");
					XuatTT(SV);
					break;
				case 6:
					System.out.println("Thoat chuong trinh...");
					System.exit(0);
					break;
				default:
					System.out.println("Khong co chuc nang do. Vui long chon lai");
			}
		} while (true);
	}
	public static void inputSV(Scanner sc){
		ArrayList<SinhVien> tt = new ArrayList<>();
		while (true){
			System.out.println("Moi nhap thong tin sinh vien (Hoac nhan x de thoat): ");
			System.out.println("Nhap ten sv: ");
			String name = sc.next();
			if (name.equalsIgnoreCase("x")) {
				break;
			}
			System.out.println("Nhap ma sinh vien: ");
			String masv = sc.next();
			System.out.println("Nhap add: ");
			String add = sc.next();
			System.out.println("Nhap diem TB: ");
			double diemTB = sc.nextDouble();

			SinhVien sv = new SinhVien(name,masv,add,diemTB);
			sv.setName(name);
			sv.setMasv(masv);
			sv.setAdd(add);
			sv.setDiemTB(diemTB);

			tt.add(sv);
			sc.nextLine();
		}
	}
	public static void SapXep(ArrayList<SinhVien> tt){
		tt.sort(Comparator.comparing(SinhVien::getDiemTB));
		System.out.println("DS sinh vien dc sap xep theo diem la: ");
		for (SinhVien sv : tt) {
			System.out.println("Ten hoc sinh: " + sv.getName());
			System.out.println("Diem TB: " + sv.getDiemTB());
		}
	}
	static void XuatTT(ArrayList<SinhVien> tt){
		System.out.println("Thong tin sinh vien la: ");
		for (SinhVien sv : tt) {
			System.out.println("Ten sinh vien: " + sv.getName());
			System.out.println("Ma sinh vien: " + sv.getMaSv());
			System.out.println("Dc sinh vien: " + sv.getAdd());
			System.out.println("Diem TB sinh vien: " + sv.getDiemTB());
		}
	}
}
