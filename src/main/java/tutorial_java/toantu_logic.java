/*
Core - 4
&&: x = True && y = True > True ----- x = False && y = True > False
||: x = True || y = False > True ----- x = False || y = True > True
!: x = True x! > False
Voi phep tinh don gian thi truoc hay sau nhu nhau:
++x (tang + len 1 gia tri)
x--
Voi phep tinh phuc tap:
Postfix: x++, x--
Prefix: --x, ++x
Cach tinh (Prefix - Postfix):
S1: Prefix
S2: Cac phep toan con lai
S3: Gan gia tri cho bien o ben trai dau bang
S4: Postfix
 */
package tutorial_java;

public class toantu_logic {
	public static void main(String[] args) {
		int i = 7;
		System.out.println(i > 0 || i > 10);
	}
}
