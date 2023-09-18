package tutorial_java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class array_excercise {
    public static void main(String[] args) {
/* Viet chuong trinh tao 1 mang 1 chieu gom cac phan tu la so nguyen , co n phan tu ngau nhien
n dc input:
1. Xuat gia tri trong mang
2. Dao nguoc va xuat mang
3. Sap xep mang tang dan
4. Tinh tong cac phan tu
5. Cho user nhap so bat ky, check xem co ton tai trong mang ko, neu co thi output vi tri index trong mang
 */
        // Bai 1
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Moi nhap so n: ");
        int n = sc.nextInt();
        int[] mangNguyen = new int[n];
        for (int i = 0; i< n; i++) {
            int ngauNhien = rd.nextInt(6);
            mangNguyen[i] = ngauNhien;
        }
        System.out.println("Gia tri trong mang ngau nhien nguyen la: ");
        System.out.println(Arrays.toString(mangNguyen));
        // Bai 2
        for (int i = 0, j = n - 1; i < j; i++,j--) {
            int temp = mangNguyen[i];
            mangNguyen[i] = mangNguyen[j];
            mangNguyen[j] = temp;
        }
        System.out.println("Mang nghich dao la: ");
        System.out.println(Arrays.toString(mangNguyen));
        // Bai 3
        Arrays.sort(mangNguyen);
        System.out.println("Mang sau khi sap xep tang dan la: ");
        System.out.println(Arrays.toString(mangNguyen));
        // Bai 4
        int sum = 0;
        for (int pt : mangNguyen){
            sum += pt;
        }
        System.out.println("Tong cua mang la: " + sum);
        // Bai 5
        System.out.println("Moi nhap so bat ky: ");
        int randomN = sc.nextInt();
        boolean check = false;
        String vitri = "";
        for (int i = 0; i < n;i++){
            if (mangNguyen[i] == randomN){
                check = true;
                vitri+= (i + " ");
            }
        }
        if (check)
            System.out.println(randomN + " co ton tai trong mang voi index la: " + vitri);
        else
            System.out.println(randomN + " ko ton tai trong mang");
    }
}
