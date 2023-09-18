package tutorial_java.ThrowException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ngoaiLe {
	static class nullNameException extends RuntimeException{
		public nullNameException(String msg){
			super(msg);
		}
	}
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("How old are you?");
//		try{
//			int age = sc.nextInt();
//			System.out.println("Your age is: " + age);
//		} catch (InputMismatchException ime){
//			System.out.println("You need to provide a number");
//		} catch (Exception e) {
//			System.out.println("All exception");
//		} finally {
//			System.out.println("Finally block");
//		}
//		System.out.println("End of program");
//	}
//		System.out.println("Please enter a name: ");
		String name = null;
		dodaiName(name);
	}
	public static void dodaiName(String name) throws nullNameException{
		if (name == null) {
			throw new nullNameException("null is not a name");
		}
		System.out.println(name.length());
	}
}
