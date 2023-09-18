/*
Core 4: Toan tu gan
x = x + y > x+=y
x = x%y > x%=y
tuong tu vs cac phep toan con lai
 */
package tutorial_java;

public class toantu_gan {
    public static void main(String[] args) {
//        //gan cong
//        int x = 9;
//        x+=5;
//        System.out.println("x= " +x);
//
//        //gan tru
//        int x2 = 8;
//        x2-=5;
//        System.out.println("x2= " +x2);
//
//        //gan nhan
//        int x3 = 8;
//        x3*=5;
//        System.out.println("x3= " +x3);
//        //gan chia
//        int x4 = 8;
//        x4/=5;
//        System.out.println("x4= " +(float)x4);

//        int a = 7;
//        int b = 9;
//        System.out.println(a == b);
//        System.out.println(a != b);
//        System.out.println(a > b);
//        System.out.println(a < b);
//        System.out.println(a <= b);
//        System.out.println(a >= b);
        int a = 6;
        int a1 = 6;
        int a2 = 6;
        int a3 = 6;
        int b =7;

        System.out.println("a1 = " + (a1-=5));
        System.out.println("a2 = " + (a2*=2));
        System.out.println("a3 = " + (a3%=5));
        System.out.println("a=a-(b+3) = " + (a-=b+3));
    }
}
