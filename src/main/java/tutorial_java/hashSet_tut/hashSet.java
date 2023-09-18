package tutorial_java.hashSet_tut;

import java.util.*;

public class hashSet {
	public static void main(String[] args) {
		List<String> tenLst = new ArrayList<>();
		tenLst.add("Luffy");
		tenLst.add("Zoro");
		tenLst.add("Ussop");
		tenLst.add("Nami");
		tenLst.add("Sanji");
		tenLst.add("Nami");
		System.out.println(tenLst);

		Set<String> tenSet = new TreeSet<>();
		tenSet.add("Luffy");
		tenSet.add("Zoro");
		tenSet.add("Ussop");
		tenSet.add("Nami");
		tenSet.add("Sanji");
		tenLst.add("Nami");
		System.out.println(tenSet);
	}
}
