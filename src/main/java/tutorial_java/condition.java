package tutorial_java;

import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        // Bai 1:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Moi nhap tong 2 so: ");
//
//        double sum = sc.nextDouble();
//        System.out.println("Moi nhap hieu 2 so: ");
//
//        double minus = sc.nextDouble();
//        float x = (float) (sum+minus)/2;
//        float y = x - (float)minus;
//       System.out.println("Gia tri x la: " + x);
//       System.out.println("Gia tri y la: " + y);
        // Bai 2:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter height (m): ");
//        double height = sc.nextDouble();
//        System.out.println("Enter weight (kg): ");
//        double weight = sc.nextDouble();
//        double BMI = weight/(Math.pow(height,2));
//        System.out.println("Your BMI: " + BMI);
//        if (BMI < 15)
//            System.out.println("Too Skinny");
//        else if (BMI>=15 && BMI<16) {
//            System.out.println("Skinny");
//        } else if (BMI>=16 && BMI<18.5) {
//            System.out.println("Belly");
//        } else
//            System.out.println("Overweight");
//    }
        // Bai 3:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Moi nhap nam: ");
//        int year = sc.nextInt();
//            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
//                System.out.println("Day la nam nhuan");
//            } else
//                System.out.println("Khong phai nam nhuan");
        // Bai 4:
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap thang bat ky: ");
        int month = sc.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
           System.out.println("Thang " + month + " co 31 ngay");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Thang " + month + " co 30 ngay");
        } else if (month == 2) {
            System.out.println("Moi nhap nam: ");
            int year = sc.nextInt();
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                System.out.println("Thang " + month + " co 29 ngay");
            } else
                System.out.println("Thang " + month + " co 28 ngay");
       }
        else
          System.out.println("Khong co thang nao nhu vay");

        // Giai bang Switch-case
        switch (month) {
            case 1:
                System.out.println("Thang " + month + " co 31 ngay");
                break;
            case 2:
                System.out.println("Moi nhap nam: ");
                int year = sc.nextInt();
                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                System.out.println("Thang " + month + " co 29 ngay");
            } else
                System.out.println("Thang " + month + " co 28 ngay");
                break;
            case 3:
                System.out.println("Thang " + month + " co 31 ngay");
                break;
            case 4:
                System.out.println("Thang " + month + " co 30 ngay");
                break;
            case 5:
                System.out.println("Thang " + month + " co 31 ngay");
                break;
            case 6:
                System.out.println("Thang " + month + " co 30 ngay");
                break;
            case 7:
                System.out.println("Thang " + month + " co 31 ngay");
                break;
            case 8:
                System.out.println("Thang " + month + " co 31 ngay");
                break;
            case 9:
                System.out.println("Thang " + month + " co 30 ngay");
                break;
            case 10:
                System.out.println("Thang " + month + " co 31 ngay");
                break;
            case 11:
                System.out.println("Thang " + month + " co 30 ngay");
                break;
            case 12:
                System.out.println("Thang " + month + " co 31 ngay");
                break;
            default:
                System.out.println("Khong co thang nao nhu vay");
        } */
        //            System.out.println("Little skinny");
//        } else if (BMI>18.5 && BMI<25) {
//            System.out.println("Normal");
//        } else if (BMI >= 25 && BMI<30) {
//            System.out.println("Little belly");
//        } else if (BMI >= 30 && BMI <35) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Moi nhap so a: ");
//        double a = sc.nextDouble();
//        System.out.println("Moi nhap so b: ");
//        double b = sc.nextDouble();
//        System.out.println("Moi nhap so c: ");
//        double c = sc.nextDouble();
//        double delta = (Math.pow(b, 2)) - 4 * a * c;
//        if (a == 0) {
//            System.out.println("PT co dang bac 1: " + Math.round(-c / b));
//        } else {
//            if (delta < 0)
//                System.out.println("Phuong trinh vo nghiem ");
//            else if (delta == 0) {
//                double x = -b / (2 * a);
//                System.out.println("Phuong trinh co nghiem kep x1= x2 = " + x);
//            } else {
//                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
//                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
//                System.out.println("Phuong trinh co nghiem phan biet: ");
//                System.out.println("x1 = " + x1);
//                System.out.println("x2 = " + x2);
//            }
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap thang: ");
        int month = sc.nextInt();
        if (month == 1 || month == 2 || month == 3) {
            System.out.println("Thang " + month + " thuoc Quy I");
        } else if (month == 4 || month == 5 || month == 6) {
            System.out.println("Thang " + month + " thuoc Quy II");
        } else if (month == 7 || month == 8 || month == 9) {
            System.out.println("Thang " + month + " thuoc Quy III");
        } else if (month == 10 || month == 11 || month == 12) {
            System.out.println("Thang " + month + " thuoc Quy IV");
        } else
            System.out.println("Ko co thang nao nhu vay");
    }
}