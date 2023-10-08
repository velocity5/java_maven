package tutorial_java.jav_excercise.lab_11_tendangnhap;

import javax.swing.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class write_obj {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("src/main/java/tutorial_java/jav_excercise/lab_11_tendangnhap/nhanvien.bin");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		String[] nhanvien = new String[3];
		nhanvien[0] = "Tran Minh, 23, 10.000";
		nhanvien[1] = "Tran Kien, 27, 15.000";
		nhanvien[2] = "Tran Quy, 36, 30.000";
		oos.writeObject(nhanvien);
		oos.close();
	}
}
