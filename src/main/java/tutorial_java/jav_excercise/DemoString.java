package tutorial_java.jav_excercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

//Ten class phai bat dau bang ki tu in hoa
class DemoString {
  public static void main(String[] args) {
    //    infoUser_Minh();
    DemoString demoString = new DemoString();
    demoString.infoUser_Minh_fix();
  }

  static void infoUser_Minh() {
    Scanner sc = new Scanner(System.in);

    String regMa = "[A-Z]{5}";
    String regPass = "^[a-zA-Z]{7}$";
    String regName = "[a-zA-Z]+";
    boolean validMaNV = false;
    boolean validPass = false;
    boolean validName = false;
    String maNV;
    String pass;
    String name;
    do {
      System.out.println("Moi nhap ma nhan vien: ");
      maNV = sc.nextLine();
      System.out.println("Moi nhap pass: ");
      pass = sc.nextLine();
      System.out.println("Moi nhap ten nhan vien: ");
      name = sc.nextLine();
      if (!maNV.matches(regMa)) {
        System.out.println("Can it nhat 5 ky tu viet hoa.");
      } else
        validMaNV = true;
      if (!pass.matches(regPass)) {
        System.out.println("Mk can it nhat 7 ky tu chi bao gom chu hoa va chu thuong.");
      } else
        validPass = true;
      if (!name.matches(regName)) {
        System.out.println("Chi dung alphabet va ky tu trang.");
      } else
        validName = true;
    } while (!validMaNV || !validPass || !validName);
    System.out.println("Ma nhan vien la: " + maNV);
    System.out.println("MK nhan vien la: " + pass);
    System.out.println("Ten nhan vien la: " + name);
  }

  String nhapMaNV(Scanner scanner) {
    String regMa = "[A-Z]{5}";
    boolean validMaNV = true;
    String maNV;
    do {
      System.out.println("Moi nhap ma nhan vien: ");
      maNV = scanner.nextLine();
      if (!maNV.matches(regMa)) {
        System.out.println("Can it nhat 5 ky tu viet hoa.");
      } else {
        validMaNV = false;
      }
    } while (validMaNV);
    return maNV;
  }

  String nhapPass(Scanner scanner) {
    String regPass = "^[a-zA-Z]{7}[a-zA-Z]*";
    boolean validPass = true;
    String pass;
    do {
      System.out.println("Moi nhap pass ");
      pass = scanner.nextLine();
      if (!pass.matches(regPass)) {
        System.out.println("Mk can it nhat 7 ky tu chi bao gom chu hoa va chu thuong.");
      } else {
        validPass = false;
      }
    } while (validPass);
    return pass;
  }

  String nhapName(Scanner scanner) {
    String regName = "[a-zA-Z]+";
    boolean validName = true;
    String name;
    do {
      System.out.println("Moi nhap ten nhan vien: ");
      name = scanner.nextLine();
      if (!name.matches(regName)) {
        System.out.println("Chi dung alphabet va ky tu trang.");
      } else {
        validName = false;
      }
    } while (validName);
    return name;
  }

  void infoUser_Minh_fix() {
    Scanner scanner = new Scanner(System.in);
    boolean flag = true;
    while (flag) {
      System.out.println("=====================================================================================");
      System.out.println("NHAP THONG TIN NHAN VIEN");
      String maNV = nhapMaNV(scanner);
      String pass = nhapPass(scanner);
      String name = nhapName(scanner);
      System.out.println("Ma nhan vien la: " + maNV);
      System.out.println("MK nhan vien la: " + pass);
      System.out.println("Ten nhan vien la: " + name);
      System.out.println("Ban co muon tiep tuc nhap thong tin nhan vien khac? Nhan N neu khong muon tiep tuc.");
      String answer = scanner.nextLine();
      flag = !answer.equalsIgnoreCase("N");
      System.out.println("=====================================================================================");
    }
    scanner.close();

  }
}