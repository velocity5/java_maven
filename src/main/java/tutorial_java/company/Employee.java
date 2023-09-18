/*
Core-30.7
- Giup tao cac lop con ke thua cac thuoc tinh cua lop cha da co san
- Thuan tien cho viec quan ly, sua doi
Abstract Class:
- Trong lop co method abstract thi lop do cung phai la abstract
- Chi dinh nghia ten ham, doi so va ko co noi dung ham
- Ko the khoi tao bang toan tu new
- Class con ke thua tu abstract phai dinh nghia lai cac phuong thuc abstract tu cha no
-> Ep class con phai co method ma cha quy dinh, nhung xu ly the nao thi can dinh nghia lai
tren class con do.
 */
package tutorial_java.company;

public abstract class Employee {
	protected String ten;
	protected String que;
	protected int cccd;
	protected double lcb = 850;

	public Employee(String ten, String que, int cccd) {
		this.ten = ten;
		this.que = que;
		this.cccd = cccd;
	}
	public abstract double tinhLuong();
}
