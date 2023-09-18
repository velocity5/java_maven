package tutorial_java.OOP;

public class SinhVien implements HoatDong {
    // thuoc tinh - global (instance) variable
    private String hoTen;
    private Double diem;

    public SinhVien() {
        hoTen = "no name";
        diem = 0.0;
    }

    // constructor co doi so - ALt+insert

    public SinhVien(String hoTen, Double diemNN) {
        this.hoTen = hoTen;
        this.diem = diemNN;
    }

    /* Method:
	La khoi lenh thuc hien 1 cong viec hoan chinh
	Co 2 phuong thuc:
	- Co return
	- Ko return (void)
	 */
    // phuong thuc void: ko co return, ko the gan bien
    public void hienThiThongTin() {
        System.out.println(hoTen + ": " + diem);
    }

    // phuong thuc co kieu tra ve
    public double diemTB(double diemToan, double diemVan) {
        return (diemToan + diemVan) / 2;
    }

    /* get, set - chi muon 1 nhom nguoi dc quyen thay doi cac gia tri bien private
    get: xem thong tin
    set: sua thong tin
     */
    public Double getDiem() {
        return diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    /*
    Tham chieu this
    instance variable: cac thuoc tinh, bien khai bao ngoai lop. Toan bo cac ham deu truy xuat dc
    local variable: khai bao trong doi so cua ham hoac noi dung ham. Chi ham nay moi truy xuat dc. Neu
    trung ten, muon su dung bien instance phai dung keyword: this.
     */
    public void setHoTen(String hoTen) { // String hoTen: local variable
        this.hoTen = hoTen;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }
    // toString

    @Override
    /*
    toString: Ho tro xuat truc tiep ket qua
     */
    public String toString() {
        return hoTen + " " + diem;
    }

    /* SupportMethod vs ServiceMethod
    Support method: Chi su dung trong class => keyword: private
    Service method: Truy xuat dc ra ben ngoai => keyword: public
     */
    private boolean checkScore() {
        return this.diem <= 10;
    }

    public void checkScoreValid() {
        if (checkScore())
            System.out.println("Diem hop le");
        else System.out.println("Kiem tra lai diem dau vao cua sinh vien nay");
    }

    /* Core - 30.5:
    Overloading method: Cho phep cac method khac nhau co cung ten nhung khac nhau ve Signature
    1. Signature goi la khac nhau neu chung khac nhau ve:
    - So luong cac doi so
    - Kieu du lieu cac doi so
    - Thu tu doi so
    2. Constructor: La truong hop dac biet cua overloading method
    3. Parameter List Method: Su dung khi ko nam dc so luong dau vao cua doi so,
     hoac so luong qua lon
     */
    public double diemTB(double diemToan, double diemVan, double diemAnh) {
        return (diemToan + diemVan + diemAnh) / 3;
    }

    // parameter list
    public double tongDiem(double ...arr){
        double tong = 0;
        for (double x:arr){
            tong+=x;
        }
        return tong;
    }
    // overriding
    public void quanHe(){
        System.out.println("Quan he tinh ban");
    }
}
