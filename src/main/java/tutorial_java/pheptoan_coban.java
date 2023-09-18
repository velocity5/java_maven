package tutorial_java;

public class pheptoan_coban {
    public static void main(String[] args) {
//        int a =11;
//        int b=5;
//        int kq = a + b;
//        System.out.println("a = "+a);
//        System.out.println("b = "+b);
//
//        // phep cong
//        System.out.println("a + b= " + kq);
//        System.out.println("a / b= " + ((double)a / b));
        int i1 = 2;
        int i2 = 5;
        int i3 = -3;
        double d1 = 5.0;
        double d2 = 2.0;
        double d3 = -0.5;
        int a = i1+(i2*i3);
        int b = i1*(i2+i3);
        int c = i1/i2+i3;
        int g = 3+4+5/3;
        int i = (3+4+5)/3;

        double k = d1+(d2*d3);
        double q = d1+d2+(d3/3);
        System.out.println("i1+(i2*i3) = " + a);
        System.out.println("i1*(i2+i3) = " + b);
        System.out.println("i1/i2+i3 = " + c);
        System.out.println(g);
        System.out.println(i);
        System.out.println("d1+(d2*d3) = " + k);
        System.out.println("d1+d2+(d3/3) = " + q);
    }
}
