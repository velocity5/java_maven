package tutorial_java.jav_excercise;

import java.util.Arrays;

public class charString {
	public static void main(String[] args) {
		char[] ch = {'m','d','q','a'};
//		String s = new String (String.valueOf(ch));
//		System.out.println(s);
		String s = Arrays.toString(ch);
		System.out.println(s);
	}
}
