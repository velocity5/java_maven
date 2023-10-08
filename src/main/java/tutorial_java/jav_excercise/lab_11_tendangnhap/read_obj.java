package tutorial_java.jav_excercise.lab_11_tendangnhap;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class read_obj {
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("src/main/java/tutorial_java/jav_excercise/lab_11_tendangnhap/nhanvien.bin");
			ObjectInputStream ois = new ObjectInputStream(fis);
			String[] nhanvien = (String[]) ois.readObject();
			System.out.println("Reading from file: ");
			for (String nv : nhanvien){
				System.out.println(nv);
			}
			ois.close();
			fis.close();
		} catch (Exception e){
			System.out.println("Error occurred " + e);
		}
	}
}
