/*
1. Viet chuong trinh tao lst co n phan tu nhap tu ban phim, co so ngau nhien tu 1->100
2. Viet chuong trinh nhap vao 1 lst co n phan tu nhap tu ban phim:
- Tao 1 lst moi la binh phuong cua n phan tu
- Xac dinh co bn phan tu lon hon 50
3. Viet chuong trinh tra loi kq cua phep tinh
quest = ("2 + 5 + 7 =","5*10=","sqrt(16)=","12%2=")
4. Viet chuong trinh nhap vao 1 lst co n phan tu ngau nhien dc nhap tu ban phim
n la int:
- In ra co bao nhieu so < 80
- In ra vi tri index cua cac so do
5. Cho lst={1,9,3,14,5,2,7,8}
- Viet chuong trinh in so lon thu 2 va so nho thu 2 trng lst
- In ra index
 */
package tutorial_java;

import java.util.*;

public class arrayLst_Excercise {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Random rd = new Random();
//		System.out.println("Pls enter n: ");
//		int n = sc.nextInt();
//		ArrayList<Integer> lstN = new ArrayList<>();
//		for (int i=0; i<n;i++) {
//			int x = rd.nextInt(1,101);
//			lstN.add(x);
//		}
//		System.out.println("Lst tao tu n phan tu random la: " + lstN);
//		System.out.println("Pls enter n: ");
//		int n = sc.nextInt();
//		ArrayList<Integer> newLst = new ArrayList<>(n);
//		for (int i = 0; i < n; i++) {
//			System.out.println("Moi nhap so phan tu thu: " + (i + 1) + ":");
//			int soNhap = sc.nextInt();
//			newLst.add(soNhap);
//		}
//		System.out.println(newLst);
//		ArrayList<Integer> powLst = new ArrayList<>();
//		for (int x : newLst) {
//			powLst.add((int) Math.pow(x, 2));
//		}
//		System.out.println("Danh sach binh phuong vs n phan tu la: " + powLst);
//		int count = 0;
//		for (int x : powLst) {
//			if (x > 50)
//				count++;
//		}
//		if (count != 0)
//			System.out.println("Cac phan tu lon hon 50 trong lst 1 la: " + count);
//		else
//			System.out.println("Ko co phan tu lon hon 50 trong lst 1");
//		ArrayList<String> quest = new ArrayList<>(List.of(
//				"2 + 5 + 7 = ",
//				"5*10 = ",
//				"sqrt(16)= ",
//				"12%2 = "
//		));
//		ArrayList<Float> reply = new ArrayList<>(List.of(14f,50f,4f,0f));
//		// duyet list cau hoi
//		for (int i = 0; i< quest.size();i++){
//			System.out.println(quest.get(i));
//			// nhap kq
//			System.out.println(" ");
//			Float kq = sc.nextFloat();
//			// check dap an
//			if (kq.equals(reply.get(i))){
//				System.out.println("Chinh xac");
//			} else
//				System.out.println("Sai. Dap an la: " + reply.get(i));
//		}
//		ArrayList<Integer> myLst = new ArrayList<>();
//		for (int i = 0; i < n; i++) {
//			int x = rd.nextInt(101);
//			myLst.add(x);
//		}
//		System.out.println("Ds cac phan tu la: " + myLst);
//		int count = 0;
//		String loc = "";
//		for (int i = 0; i < myLst.size(); i++) {
//			if (myLst.get(i) < 100) {
//				count++;
//				loc += i + " ";
//			}
//		}
//		if (count == 0)
//			System.out.println("Ko co so nao < 80");
//		else {
//			System.out.println("So cac so < 80 trong lst la: " + count);
//			System.out.println("Vi tri index cua cac so do: " + loc);
//		}
		ArrayList<Integer> lst = new ArrayList<>(List.of(1,9,3,14,5,2,7,8));
		//ArrayList<Integer> copy = new ArrayList<>(List.of(1,9,3,14,5,2,7,8));
		Collections.sort(lst);
		System.out.println("lst sau sap xep la: " + lst);
		// in ra so lon thu 2 va so nho thu 2 trong lst
		int soLonthu2 = lst.get(lst.size()-2); // lay vi tri sat cuoi: size()-2
		int soNhothu2 = lst.get(1);
		System.out.println("So lon thu 2 la: " + soLonthu2);
		System.out.println("So nho thu 2 la: " + soNhothu2);
		System.out.println("Vi tri index cua so lon thu 2: " + lst.indexOf(soLonthu2));
		System.out.println("Vi tri index cua so nho thu 2: " + lst.indexOf(soNhothu2));
		}
	}