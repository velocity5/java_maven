/* Core 28:
Do han che cua Array (Ko the them, xoa phan tu) => dung collection de them, sua, xoa phan tu
Co 2 lop collection:
 - ArrayList: Giong array, nhung cac phan tu co the thay doi kich thuoc
 - HashMap: Cho phep luu tru cac cap (key,value) va tim kiem gia tri bang key.
 - Khai bao: ArrayList<Type>listName = new ArrayList<>(); Type: Dung Wrapper Class
 */
package tutorial_java.Array;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> gioHangArray = new ArrayList<>();
        gioHangArray.add("Banana");
        gioHangArray.add("Meat");
        gioHangArray.add("Orange");
        gioHangArray.set(2,"Onion");
        for (int i = 0; i < gioHangArray.size(); i++){
            System.out.println(gioHangArray.get(i));
        }
        System.out.println(gioHangArray.contains("Tomato"));
        gioHangArray.clear();
        System.out.println("Gio hang sau khi clear con: " + gioHangArray);
//        ArrayList<Integer> lst = new ArrayList<>();
//        // khai bao vs so luong phan tu ban dau
//        ArrayList<Integer> lst1 = new ArrayList<>(5);
//        // khoi tao lst vs cac phan tu ban dau
//        ArrayList<Double> lst3 = new ArrayList<>(List.of(1.4,2.2,3.4,4.1));
//        // xuat list
//        System.out.println(lst);
//        System.out.println(lst1);
//        System.out.println(lst3);
//        // add phan tu
//        ArrayList<Integer> lst4 = new ArrayList<>();
//        lst4.add(7);
//        lst4.add(8);
//        lst4.add(9);
//        System.out.println("lst4 la: ");
//        System.out.println(lst4);
//        // add phan tu: add(index, element)
//        lst4.add(1,12);
//        System.out.println(lst4);
//        // size: so phan tu cua lst
//        System.out.println("so pt cua lst 4 la: " + lst4.size());
//        // get(int index)
//        System.out.println(lst4.get(2));
//        // remove (index)
//        lst4.remove(2);
//        System.out.println("lst4 sau khi xoa gia tri tai index 2 la: ");
//        System.out.println(lst4);
//        // remove (1 phan tu dc chi dinh)
//        ArrayList<Integer> lst5 = new ArrayList<>(List.of(1,2,3,4,5,6));
//        System.out.println("lst5 = " +lst5);
//        lst5.remove(Integer.valueOf(3));
//        System.out.println("lst5 = " + lst5);
//        // set(index element): thay doi thong tin
//        ArrayList<Integer> lst6 = new ArrayList<>(List.of(6,3,5,1,2,7,9));
//        System.out.println("lst6 = " + lst6);
//        lst6.set(2,12);
//        System.out.println("lst6 = " + lst6);
//        lst6.remove(Integer.valueOf(5));
//        System.out.println("lst6 = " + lst6);
//        Collections.sort(lst6);
//        System.out.println("lst6 = " + lst6);
//        Collections.reverse(lst5);
//        System.out.println("lst5 = " + lst5);
//        lst5.clear();
//        System.out.println(lst5.isEmpty());
//        System.out.println(lst6.indexOf(12));
//        ArrayList<Integer> lst7 = new ArrayList<>(List.of(6,3,5,1,2,7,9,10));
//        // contains() - check xem co phan tu ton tai trong list ko?
//        boolean check = lst7.contains(4);
//        System.out.println(check);
//        // Duyet mang: C1 - Dung for
//        System.out.println("lst7 dung duyet for: ");
//        for (int vl : lst7){
//            System.out.print(vl);
//        }
//        // Duyet mang: C2 - Dung chi so index
//        ArrayList<Integer> lst8 = new ArrayList<>(List.of(6,3,5,1,2,7,9,10,11));
//        for (int i = 0; i < lst8.size(); i++){
//            int vl = lst8.get(i);
//            System.out.println(vl);
//        }
        }
    }

