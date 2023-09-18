/*
Core - 30
Object: Chua thuoc tinh (Attribute) va hanh vi (method)
Object giong nhau se dc gom thanh 1 nhom -> package
Quy tac dat ten class:
- Nen viet hoa chua cai dau
- Ko dc trung vs ten keyword Java
- Ko dc bat dau bang so, co the bat dau bang ky tu $ hoac _
Access Modifier:
- Private: Chi trong class moi truy xuat dc
- Public: Cac class vs method khac deu co the truy xuat
- Protected: Chi dc truy xuat bang class thuoc chung 1 package or sub-class / thuoc cung 1 class
- Default: Chi cac thanh phan trong package moi truy xuat dc
 */
package tutorial_java.OOP;

public class OOP {
    public static void main(String[] args) {
        // khoi tao doi tuong class sinh vien
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv2.quanHe();
        giaoVien gv1 = new giaoVien();
        gv1.quanHe();
        SinhVien sv3 = new SinhVien("Tran",7.0);
        // thay doi ten sinh vien 3
        sv3.setHoTen("Thao Anh");
        sv3.setDiem(11.0);
        sv3.hienThiThongTin();
        // test phuong thuc co kieu tra ve
        double diemtbsv3 = sv3.diemTB(6.7,4.5);
        System.out.println(diemtbsv3);
        // test PT toString
        System.out.println(sv3);
        sv3.checkScoreValid();
        // Core - 30.5:Overloading
        double testDiem = sv3.diemTB(5,6,9);
        System.out.println(testDiem);
        double testDiem1 = sv3.diemTB(5,6);
        System.out.println(testDiem1);
        double tingTong = sv3.tongDiem(3,4,5.5,9.6);
        System.out.println(tingTong);

    }
}
