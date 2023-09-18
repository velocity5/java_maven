/*
Core-1: Kiểu dữ liệu
Giong nhu container cho cac function lien quan
Kiểu dữ liệu nguyen thuy (primitive: luu tru cac gia tri don gian):
- Kiểu luận lý (true-false)
- Kiểu ký tự (char)
- Kiểu số
    + Số nguyên: byte (8-bit), short (16-bit), int (32-bit), long (64-bit)
    + Số thực: double (64-bit), float (32-bit)
Kieu du lieu tham chieu (reference: luu tru obj phuc tap):
- Class
- Array
- String
- Enum
- Interface
- Annotation

 */

package tutorial_java;

import java.util.Date;

public class Java_class_type {
	public static void main(String[] args) {
		// check int
		System.out.println("Min cua integer " + Integer.MIN_VALUE);
		System.out.println("Max cua integer " + Integer.MAX_VALUE);

		System.out.println("Min cua integer " + Byte.MIN_VALUE);
		System.out.println("Max cua integer " + Byte.MAX_VALUE);
		Date now = new Date(); // allocate memory
		System.out.println(now);
	}
}
