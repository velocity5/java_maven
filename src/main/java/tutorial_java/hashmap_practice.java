package tutorial_java;


import java.util.HashMap;

import java.util.Scanner;

public class hashmap_practice {
	public static void main(String[] args) {
		HashMap<String, String> dict = new HashMap<>();
		dict.put("user1", "1234");
		dict.put("user2", "12345");
		dict.put("user3", "2134");
		dict.put("user4", "54321");
		dict.put("user5", "23456");
		dict.put("user6", "98765");
		dict.put("user7", "123465");
		dict.put("user8", "1234");
		dict.put("user9", "98765");
		dict.put("user10", "123");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter username: ");
		String userName = sc.next();
		System.out.println("Please enter password: ");
		String passWord = sc.next();
		if (!dict.containsKey(userName)){
			System.out.println("Username ko ton tai");
		} else if (!dict.get(userName).equals(passWord)) {
			System.out.println("Password sai. Vui long nhap lai: ");
			String rightPass = sc.next();
			if (dict.get(userName).equals(rightPass))
				System.out.println("Login thanh cong");
			else
				System.out.println("Password sai - Thoat chuong trinh");
		} else
			System.out.println("Login thanh cong");
	}
}

