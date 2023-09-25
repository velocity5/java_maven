package tutorial_java.jav_excercise.lab_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListSV {
	public static void main(String[] args) {
		ArrayList<String> nameSV = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int ans;
		do {
			System.out.println("====================================");
			System.out.println("Moi chon chuc nang tu 1-6:");
			System.out.println("1. Nhap sinh vien");
			System.out.println("2. Sap xep random");
			System.out.println("3. Dao nguoc phan tu");
			System.out.println("4. Xuat ra");
			System.out.println("5. Xoa");
			System.out.println("6. Ket thuc");
			System.out.println("====================================");
			ans = sc.nextInt();
			switch (ans) {
				case 1:
					nameSV = inputSV(sc);
					break;
				case 2:
					sapXepRandom(nameSV);
					break;
				case 3:
					daoNguocPhanTuSapXep(nameSV);
					break;
				case 4:
					printName(nameSV);
					break;
				case 5:
					delete(nameSV);
					break;
				case 6:
					System.exit(0);
					break;
			}
		} while (true);
	}
		public static ArrayList<String> inputSV(Scanner sc){
			ArrayList<String> nameSV = new ArrayList<>();
			System.out.println("Moi nhap ten sinh vien (nhap x de thoat): ");
			while (true){
				String input = sc.nextLine();

				if (input.equalsIgnoreCase("x"))
					break;
				nameSV.add(input);
			}
			return nameSV;
		}
		static void sapXepRandom(ArrayList<String> nameSV){
			Collections.shuffle(nameSV);
		}
		static void daoNguocPhanTuSapXep(ArrayList<String> nameSV){
			Collections.sort(nameSV);
			Collections.reverse(nameSV);
		}
		static void delete(ArrayList<String> nameSV){
			nameSV.remove(2);
		}
		public static void printName(ArrayList<String> nameSV){
			System.out.println("The names are: ");
			for (String name : nameSV){
					System.out.println(name);
				}
		}
	}
