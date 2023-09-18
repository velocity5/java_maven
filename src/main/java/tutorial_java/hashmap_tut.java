/*
HashMap: cho phep luu tru cac cap (key - value) va tim kiem cac gia tri bang key
HashMap<typekey, typeValue> Name = new HashMap<>(); Type: su dung Wrapper Class

 */
package tutorial_java;

import java.util.HashMap;

public class hashmap_tut {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		HashMap<Integer, Float> map1 = new HashMap<>();
		map.put(12,"abx");
		map.put(13,"cdb");
		map.put(14,"abc");

		map1.put(1,12f);
		map1.put(2, 20f);
		// Lay gia tri phan tu trong hashmap
		String value = map.get(13);
		System.out.println(value);
		// xoa gia tri phan tu trong hashmap
		map.remove(12);
		System.out.println(map.get(12));
		// check co phan tu ton tai trong hashmap ko?
		boolean check = map.containsKey(13);
		System.out.println(check);
		// check co gia tri ton tai trong hashmap ko?
		boolean checkVl = map.containsValue("cdb");
		System.out.println(checkVl);
		// check hashmap co rong ko?
		boolean empty = map.isEmpty();
		System.out.println(empty);
		// lay so luong phan tu
		int soLuongpt = map.size();
		System.out.println(soLuongpt);
		// duyet hashmap
		for (Integer key:map.keySet()){
			String vl = map.get(key);
			System.out.println(key + ":" + vl);
		}
	}
}
