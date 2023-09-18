package tutorial_java.jav_excercise;

public class stringChar {
	public static void main(String[] args) {
		String s = "Make love";
//		for (int i = 0 ; i < s.length(); i++){
//			char ch = s.charAt(i);
//			System.out.println("Ky tu o vi tri " + i + " la: " + ch);
//		}
//		char ch[] = {'i','l','o','v','e','u'};
//		String s2 = new String(ch); // convert array -> string
//		String s3 = new String("for example: "); // create Java string by new keyword
//		System.out.println(s.replace("!",", T.A!"));
//		System.out.println(s2.length());
//		System.out.println(s3.concat(s));
		String s1= "Make love";
		String s2= new String("make love");
		String s3= "Wearing condom";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s==s3);
		System.out.println(s2.compareTo(s3));
	}
}
