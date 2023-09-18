package tutorial_java.collection;

import java.util.LinkedList;

public class linkList {
	public static void main(String[] args) {
		LinkedList<String> lst = new LinkedList<>();
		lst.add("A");
		lst.add("B");
		lst.addLast("C");
		lst.addFirst("S");
		System.out.println(lst);
		lst.removeFirst();
		lst.removeLast();
		System.out.println(lst);
	}
}
