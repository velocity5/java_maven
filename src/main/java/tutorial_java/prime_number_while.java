package tutorial_java;

import java.util.Scanner;
public class prime_number_while {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();
        int count = 0, i = 1;
        while(i <= n){
            if (n%i == 0){
                count++;
            }
            i++;
        }
        if(count == 2) {
            System.out.println("Number " +n+ " is Prime");
        } else
            System.out.println("Number " +n+ " is not Prime");
    }
}
