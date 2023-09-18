/*
Core 21: Ham trong java
- La 1 khoi lenh thuc hien 1 cong viec hoan chinh (module). Ten khac: Chuong trinh con
phuong thuc, hanh vi.
- Co 2 loai:
    + Co return
    + Ko return - (procedure)
- Cong dung:
    + Chia nho project
    + Tai su dung
- Khai bao ngoai ham main. Ham main: la ham chay chinh, ko khai bao.
- Co the khai bao: static public void
 */
package tutorial_java;

import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap so b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap phep tinh: ");
        String x = new Scanner(System.in).next();
        while (!x.equals("+") && !x.equals("-") && !x.equals("*") && !x.equals("/")) {
            System.out.println("Vui long nhap lai phep tinh!");
            x = new Scanner(System.in).nextLine();
        }
        double kq = phepTinh(a, b, x);
        System.out.println("Ket qua = " + kq);
    }

    static public double phepTinh(double a, double b, String x) {
        double kq = 0;
        switch (x) {
            case ("+"):
                kq= a + b;
                break;
            case ("-"):
                kq = a - b;
                break;
            case ("*"):
                kq=  a * b;
                break;
            default:
                if (b == 0) {
                    System.out.println("Ko the tinh dc");
                } else
                    kq = a / b;
                break;
        }
        return kq;
    }
    }

