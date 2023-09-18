package tutorial_java.Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class test {
	public static void main(String[] args) {
		// tao list
		ArrayList<Product> lst = new ArrayList<>();
		// khoi tao doi tuong
		Product p1 = new Product(1,"Samsung",1050);
		Product p2 = new Product(2,"iPhone",550);
		Product p3 = new Product(3,"OPPO",450);
		// add san pham vao lst
		lst.add(p1);
		lst.add(p2);
		lst.add(p3);
		// xem ds san pham co trong lst
		for (Product p : lst){
			System.out.println(p);
		}
		// goi pt sap xep
		Collections.sort(lst);
		System.out.println("Danh sach sau sap xep la: ");
		for (Product p : lst){
			System.out.println(p);
		}
	}
}
