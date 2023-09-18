package tutorial_java.generics;

import java.util.ArrayList;
import java.util.LinkedList;

public class Printer<T> {
	T thingtoPrint;
	public Printer(T thingtoPrint){
		this.thingtoPrint = thingtoPrint;
	}
	public void print(){
		System.out.println(thingtoPrint);
	}

	public static void main(String[] args) {
		Printer<String> p = new Printer<>("I love you");
		p.print();
		Printer<Double> p1 = new Printer<>(2.0);
		p1.print();
		Printer<Integer> p2 = new Printer<>(12);
		p2.print();
		Printer<Float> p3 = new Printer<>(12.3f);
		p3.print();
		LinkedList<String> lst = new LinkedList<>();
		lst.add("M");
		lst.add("T");
		String s = lst.get(0);
		System.out.println("The string is " + s);

	}
}
