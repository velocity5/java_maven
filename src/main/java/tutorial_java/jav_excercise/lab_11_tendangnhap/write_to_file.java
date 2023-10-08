package tutorial_java.jav_excercise.lab_11_tendangnhap;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class write_to_file {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[3];
		int[] age = new int[3];
		double[] salary = new double[3];

		for (int i = 0; i< 3; i++){
			System.out.println("Enter the name of employee " + (i + 1) + ": ");
			name[i] = sc.nextLine();
			System.out.println("Enter the age of employee " + (i + 1) + ": ");
			age[i] = sc.nextInt();
			System.out.println("Enter the salary of employee " + (i + 1) + ": ");
			salary[i] = sc.nextDouble();
			sc.nextLine();
		}
		try{
			FileWriter fw = new FileWriter("src/main/java/tutorial_java/jav_excercise/lab_11_tendangnhap/nhanvien.txt");
			for (int i = 0; i < 3; i++) {
				fw.write("Name: " + name[i] + ", Age: " + age[i] + ", Salary: " + salary[i] + "\n");
			}
			fw.close();
			System.out.println("Recorded successfully");
		} catch (IOException e){
			System.out.println("An error occured!");
			e.printStackTrace();
		}
	}
}
