package tutorial_java;

import java.util.Scanner;
public class prime_number_dowhile {
    public static void main(String[] args) {
        // tong cac so tu 1-5
//        int a = 1;
//        int tong = 0;
//        do {
//           tong+=a;
//           a++;
//        } while (a<=5);
//            System.out.println("Tong = " + tong);
//    }
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();
        int count = 0, i = 1;
        do {
            if (n%i==0) {
                count++;
            } i++;
        } while (i <= n);
        if (count == 2){
            System.out.println("Number " + n + " is Prime");
        } else
            System.out.println("Number " + n + " is not Prime");
    }
}