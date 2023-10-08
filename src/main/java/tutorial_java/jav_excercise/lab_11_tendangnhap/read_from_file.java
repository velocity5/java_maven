package tutorial_java.jav_excercise.lab_11_tendangnhap;

import java.io.FileReader;
import java.io.IOException;

public class read_from_file {
	public static void main(String[] args) {

		try{
			FileReader fr = new FileReader("src/main/java/tutorial_java/jav_excercise/lab_11_tendangnhap/nhanvien.txt");
			System.out.println("Reading from file: \n");
			int i;
			// Using read method
			while ((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e){
			System.out.println("An error occured!");
			e.printStackTrace();
		}
	}
}
