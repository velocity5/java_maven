/*
Core-2: Biến
Def: Tên gọi vùng nhớ. Dùng để lưu dữ liệu
Có 2 kiểu khai báo (khai báo: ko gán giá trị, khởi tạo: gán giá trị):
- Biến thay đổi giá trị: [data-types] name_of_var = [value];
- Biến không đổi (Constant): final [data-types] name_of_var = [value];

Quy tắc đặt tên biến:
- Chỉ chứa chữ cái (a-z, A-Z), chữ số (0-9), dấu gạch chân_ và $
- KHONG duoc bat dau bang so
- KHONG trung voi keyword trong java
- Co phan biet chu hoa / thuong
- Viet theo kieu camelCase.
 */

package tutorial_java;

public class khaibao_bien {
    // bien static: dc luu tru trong bo nho rieng, ben ngoai method, contructor va block
    public static void main(String[] args) {
        //khai bao bien
        int a; // bien local
        byte age;
        float mathScore;
        int c,d,e,f;
        //khoi tao bien
        int childAge = 10;
        childAge=15;
        System.out.println("Tuoi cua con la: " + childAge);
        float LiteratureScore = 3.5f;
        double EnglishScore = 7.7;

        // hằng số
        final int DOSOI=100;
    }
    public class sinhVien {
        // Bien instance
        public String name;
        private int tuoi;

        public sinhVien(String name, int tuoi) {
            this.name = name;
            this.tuoi = tuoi;
        }
    }

}
