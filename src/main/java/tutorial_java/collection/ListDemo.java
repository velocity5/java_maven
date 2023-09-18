package tutorial_java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
//		lst.add("ass");
//		lst.add("hole");
//		lst.add("vulgar");
		Collections.addAll(lst,"ass","hole","vulgar");
//		lst.remove(0);
		System.out.println(lst.subList(0,2));
	}

}
