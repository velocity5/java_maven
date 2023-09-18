package tutorial_java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
	public static void show(){
		Collection<String> colect = new ArrayList<>();
		Collections.addAll(colect,"a","b","c");
		// Ko pass param -> object array
		Object[] objArray= colect.toArray();
		// pass param -> string array
		String[] stringArray = colect.toArray(new String[0]);
		stringArray[0].length();
		Collection<String> other = new ArrayList<>();
		other.addAll(colect);
		System.out.println(colect.equals(other));
	}
}
