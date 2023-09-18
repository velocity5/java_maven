package tutorial_java.enumPack;

import java.util.ArrayList;

public class testEnum {
	public static void main(String[] args) {
		// kiem tra cac gia tri
		System.out.println(xepLoai.Loai.ordinal());
		System.out.println(xepLoai.TB.ordinal());
		// tao lst
		ArrayList<SV> lst = new ArrayList<>();
		// tao doi tuong
		SV sv1 = new SV(1,"Nguyen Van", 9.5);
		SV sv2 = new SV(2,"Nguyen Van Hai", 4.5);
		SV sv3 = new SV(3,"Nguyen Van Ba", 2.9);
		// add sv
		lst.add(sv1);
		lst.add(sv2);
		lst.add(sv3);
		// duyet danh sach
		for (SV ttsvien: lst) {
			System.out.println(ttsvien);
		}
	}
}
