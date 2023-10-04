package tutorial_java.jav_excercise.lab_6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class mangSV {
	private final String fullName;
	private final String email;
	private final String mobileNum;
	private final String idNum;
	public mangSV(String fullName, String email, String mobileNum, String idNum){
		this.fullName = fullName;
		this.email = email;
		this.mobileNum = mobileNum;
		this.idNum = idNum;
	}
	@Override
	public String toString(){
		return "Ho va ten: " + fullName + " " + "Email: " + email + " " + "SDT: " + mobileNum + " " + "CCCD: " + idNum;
	}
	public static void checkValidate(ArrayList<mangSV> sv){
		Scanner sc = new Scanner(System.in);
		String regMail = "^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
		String regPhone = "/(84|0[3|5|7|8|9])+([0-9]{8})\\b/g";
		String regId = "/[0,1,2,3,4,5,6,7,8,9]";
		boolean validMail = true;
		boolean validPhone = true;
		boolean validId = true;

		Random rd = new Random();
		for (int i = 0; i < 5; i++){
			System.out.println("Moi nhap: " + "Ho ten " + (i+1));
			String name = sc.nextLine();
			System.out.println("Moi nhap: " + "Email " + (i+1));
			String email = sc.nextLine();
			if (!email.matches(regMail)) {
				System.out.println("Ko dung dinh dang mail. Vui long nhap lai: ");
				email = sc.nextLine();
			}
			else
				validMail = false;
			System.out.println("Moi nhap: " + "SDT " + (i+1));
			String mobile = sc.nextLine();
			if (!mobile.matches(regPhone))
				System.out.println("Ko dung dinh dang sdt. Vui long nhap lai: ");
			else
				validPhone = false;
			System.out.println("Moi nhap: " + "CCCD " + (i+1));
			String idNum = sc.nextLine();
			if (!idNum.matches(regId))
				System.out.println("Ko dung dinh dang cccd. Vui long nhap lai: ");
			else
				validId = false;
			mangSV msv = new mangSV(name,email,mobile,idNum);
			int rdId = rd.nextInt(sv.size() + 1);
			sv.add(rdId, msv);
		}
	}
//	String nhapMail(Scanner sc){
//		String regMail = "^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
//		boolean validMail = true;
//		String mail;
//		do {
//			mail = sc.nextLine();
//			if (!mail.matches(regMail))
//				System.out.println("Ko dung dinh dang mail. Vui long nhap lai:");
//			else
//				validMail = false;
//		} while (validMail);
//		return mail;
//	}
//	String nhapSDT(Scanner sc){
//		String regPhone = "/(84|0[3|5|7|8|9])+([0-9]{8})\\b/g";
//		boolean validPhone = false;
//		String mobile;
//		do {
//			mobile = sc.nextLine();
//			if (!mobile.matches(regPhone))
//				System.out.println("Ko dung dinh dang sdt. Vui long nhap lai:");
//			else
//				validPhone = true;
//		} while (validPhone);
//		return mobile;
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<mangSV> sv = new ArrayList<>();
		checkValidate(sv);
		outPut(sv);
		sc.close();
	}
	public static void outPut(ArrayList<mangSV> sv){
		System.out.println("DS sinh vien la: ");
		for (mangSV msv : sv){
			System.out.println(msv);
		}
	}
}
