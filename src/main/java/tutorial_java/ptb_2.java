package tutorial_java;

import java.util.Scanner;

public class ptb_2 {
    static public void main(String[] args) {
//        int kq = Cong(1,2,3);
//        int kq2 = Cong(4,5,6);
//        System.out.println("Tong cac so la: " + kq);
//        System.out.println("Tong cac so la: " + kq2);
//        // goi ham xin chao
//        xinChao("male");
//        xinChao("female");
//        String kq = Ptrinhbac2(2, 7, 5);
//        System.out.println("KQ la: " + kq);
        // cho nguoi dung nhap vao a,b,c
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so a: ");
        double a = sc.nextDouble();
        System.out.println("Moi nhap so b: ");
        double b = sc.nextDouble();
        System.out.println("Moi nhap so c: ");
        double c = sc.nextDouble();
        String kq = Ptrinhbac2(a,b,c);
        System.out.println("KQ PT bac 2 la: " + kq);
    }

    //    public static int Cong(int x,int y, int z){
//        return x + y + z;
//    }
    //ham thu tuc
//    public static void xinChao(String sex){
//        if (sex.equals("female")){
//            System.out.println("Xin chao, toi la nhan vien nu");
//        } else if (sex.equals("male"))
//            System.out.println("Xin chao, toi la nhan vien nam");
//    }
    public static String Ptrinhbac2(double a, double b, double c) {
        // check dieu kien
        if (a == 0) {
            if (b == 0 && c == 0)
                return "Phuong trinh bac 1 vo so nghiem";
            else if (b == 0 && c != 0) {
                return "Pt bac 1 vo nghiem";
            } else
                return "Pt bac 1 co nghiem: " + (-c / b);
        } else {
            // giai ptb2
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0)
                return "Pt bac 2 vo nghiem";
            else if (delta == 0) {
                double x = -b / (2 * a);
                return "Pt bac 2 co nghiem kep: " + x;
            } else {
                double x1 = ((-b + Math.sqrt(delta)) / 2 * a);
                double x2 = ((-b - Math.sqrt(delta)) / 2 * a);
                return "Pt bac 2 co 2 nghiem phan biet: x1= " +x1+"; x2= " + x2;
            }
        }
    }
}