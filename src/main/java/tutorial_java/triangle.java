package tutorial_java;


import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a height: ");
        int h = sc.nextInt();

        for (int i = 1; i <= h; i++){
            for (int j=h;j >= i;j--){
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++){
            System.out.print("* ");
        }
        System.out.println();
        sc.close();
        }
    }
}