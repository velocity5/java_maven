package tutorial_java;

import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number to check from 10, 20, 30: ");
//        int number = sc.nextInt();
//	    switch (number) {
//		    case 10 -> System.out.println(number + " case 10");
//		    case 20 -> System.out.println(number + " case 20");
//		    case 30 -> System.out.println(number + " case 30");
//		    default -> System.out.println("Not in our case");
//	    }
//        System.out.println("Enter number to check: ");
//        int number = sc.nextInt();
//        // check so du
//        int sDu = number % 2;
//	    if (sDu == 0) {
//		    System.out.println("Number " + number + " is even");
//	    } else {
//		    System.out.println("Number " + number + " is odd");
//	    }
//        System.out.println("Check day in a month: ");
//        int month = sc.nextInt();
//	    switch (month) {
//		    case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 days in a month");
//		    case 4, 6, 9, 11 -> System.out.println("30 days in a month");
//		    case 2 -> System.out.println("28 or 29 days in a month");
//		    default -> System.out.println("Nonsense");
//	    }
        System.out.println("Please enter a number: ");
        System.out.println("1. Find by name");
        System.out.println("2. Find by author");
        System.out.println("3. Find by publisher");
        System.out.println("4. Find by title");
        int n = sc.nextInt();
        switch (n) {
            case 1 -> System.out.println("Find by name. Loading...");
            case 2 -> System.out.println("Find by author. Loading...");
            case 3 -> System.out.println("Find by publisher. Loading...");
            case 4 -> System.out.println("Find by title. Loading...");
            default -> System.out.println("Invalid");
        }
    }
}
