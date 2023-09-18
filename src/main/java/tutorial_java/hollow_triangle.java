package tutorial_java;


import java.util.Scanner;

public class hollow_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter x to draw a triangle: ");
        int x = sc.nextInt();
        // left hollow triangle
//        for (int i = 1; i <= x; i++) {
//            for (int j = 1; j <= i; j++) {
//                  if (j==1 || j==i || i==x){
//                      System.out.print("* ");
//                  } else
//                      System.out.print("  ");
//            }
//            System.out.println(); // print new line
//        }
        // left reverse hollow triangle
//        for (int i = 1; i <= x; i++) {
//            for (int j = i; j <= x; j++) {
//                if (j == x || i==1 || j == i) {
//                    System.out.print("* ");
//                } else
//                    System.out.print("  ");
//            }
//            System.out.println(); // print new line
//        }
        // right hollow triangle
//        for (int i = 1; i <= x; i++) {
//            for (int j = i; j <= x; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++) {
//                if (j == 1 || j == i || i==x) {
//                    System.out.print("* ");
//                } else
//                    System.out.print("  ");
//            }
//            System.out.println(); // print new line
//        }
        // right reverse hollow triangle
//        for (int i = 1; i <= x; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = i; j <= x; j++) {
//                if (j == x || j == i || i==1) {
//                    System.out.print("* ");
//                } else
//                    System.out.print("  ");
//            }
//            System.out.println(); // print new line
//        }
        // Hill pattern
//        for (int i = 1; i <= x; i++) {
//            for (int j = i; j <= x; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j < i; j++) {
//                System.out.print("* ");
//                }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(); // print new line
//        }
        // reverse hill pattern
//        for (int i = 1; i <= x; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = i; j < x; j++) {
//                System.out.print("* ");
//            }
//            for (int j = i; j <= x; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(); // print new line
//        }
        // Diamond pattern
//        for (int i = 1; i <= x; i++) {
//            for (int j = i; j <= x; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j < i; j++) {
//                System.out.print("* ");
//                }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(); // print new line
//        }
//        for (int i = 1; i <= x; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = i; j < x; j++) {
//                System.out.print("* ");
//            }
//            for (int j = i; j <= x; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(); // print new line
//        }
        // SandClock pattern
//        for (int i = 1; i <= x; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = i; j < x; j++) {
//                System.out.print("* ");
//            }
//            for (int j = i; j <= x; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(); // print new line
//        }
//        for (int i = 1; i <= x; i++) {
//            for (int j = i; j <= x; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j < i; j++) {
//                System.out.print("* ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(); // print new line
//        }
        // Avicii pattern
        for (int i = 1; i <= x; i++) {
           for (int j = i; j <= x; j++){
               System.out.print("  ");
           } for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(); // print new line
        }
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("");
            } for (int j = i; j<=x; j++){
                System.out.print("# ");
            }
            System.out.println(); // print new line
        }
    }
}

