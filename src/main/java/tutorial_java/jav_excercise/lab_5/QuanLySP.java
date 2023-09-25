package tutorial_java.jav_excercise.lab_5;

import tutorial_java.jav_excercise.lab_4.SanPham;

import java.util.*;

public class QuanLySP {
	private final String name;
	private final double price;

	public QuanLySP(String name,double price){
		this.name = name;
		this.price = price;
	}
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}
	public static void main(String[] args) {
		ArrayList<QuanLySP> sp = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int ans;
		do {
			System.out.println("====================================");
			System.out.println("Moi chon chuc nang tu 1-5:");
			System.out.println("1. Nhap danh sach san pham");
			System.out.println("2. Sap xep giam dan theo gia + output");
			System.out.println("3. Tim + xoa san pham theo ten");
			System.out.println("4. Xuat gia trung binh cua cac san pham");
			System.out.println("5. Ket thuc");
			System.out.println("====================================");
			ans = sc.nextInt();
			switch (ans) {
				case 1:
					sp = inputSP(sc);
					break;
				case 2:
					sortPrice(sp);
					break;
				case 3:
					delP(sp);
					break;
				case 4:
					xuatTB(sp);
					break;
				case 5:
					System.out.println("Dang ngat...");
					System.exit(0);
					break;
				default:
					System.out.println("Sai gia tri lua chon. Vui long chon lai.");
			}
		} while (true);
	}
	public static ArrayList<QuanLySP> inputSP(Scanner sc){
		ArrayList<QuanLySP> sp = new ArrayList<>();
		System.out.println("Moi nhap ten va gia san pham (Hoac nhan x de thoat): ");
		while (true){
			System.out.println("Nhap ten sp: ");
			String name = sc.next();
			System.out.println("Nhap gia sp: ");
			double price = sc.nextDouble();
			if (name.equalsIgnoreCase("x"))
				break;
			sp.add(new QuanLySP(name, price));
		}
		return sp;
	}
	 static void sortPrice(ArrayList<QuanLySP> sp){
		 sp.sort(Comparator.comparing(QuanLySP::getPrice));
		 System.out.println("San pham dc sap xep theo gia la: ");
		 for (QuanLySP spm : sp){
			 System.out.println("Ten san pham: " + spm.getName());
			 System.out.println("Gia san pham: " + spm.getPrice());
		 }
	 }
	 static void delP(ArrayList<QuanLySP> sp){
		 Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten san pham can xoa: ");
		 String tenSP = sc.next();
		 Iterator<QuanLySP> iterator = sp.iterator();
		 while (iterator.hasNext()){
			 QuanLySP spm = iterator.next();
			 if (spm.getName().equalsIgnoreCase(tenSP))
				 iterator.remove();
			 System.out.println("Xoa san pham thanh cong");
			 break;
		 }
	 }
	 static void xuatTB(ArrayList<QuanLySP> sp){
		 int sumPriceSP = 0;
		 int count = 0;
		 for (QuanLySP spm : sp) {
			 sumPriceSP += (int) spm.getPrice();
			 count++;
		 }
		 System.out.println("Gia trung binh cac san pham la: " + sumPriceSP / count);
	 }
}

