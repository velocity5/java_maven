/*
Core 25 - Ky tu char
Dung de luu tru 1 ky tu, ky tu dat trong nhay don
char <var_name> = '<char>'
 */
package tutorial_java;


public class timhieuChar {
	public static void main(String[] args) {
		char ch = 'a';
		char ch1 = 55;
		System.out.println(ch1);
//		char cha3;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Moi nhap vao 1 ky tu: ");
//		String s = sc.nextLine();
//		char cha4 = s.charAt(0);
//		System.out.println("Ky tu vua nhap: " + cha4);
		// compare
		System.out.println(Character.compare('b','a'));
		char ch5 = '3';
		char ch6 = 'a';
		char ch7 = 'B';
		char ch8 = ' ';
		System.out.println(Character.isDigit(ch5));
		System.out.println(Character.isLowerCase(ch6));
		System.out.println(Character.isLowerCase(ch7));
		System.out.println(Character.isWhitespace(ch8));
	}
}
