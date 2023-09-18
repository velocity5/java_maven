package tutorial_java.jav_excercise;

import static com.beust.jcommander.DefaultUsageFormatter.s;

public class dupChar {
	public static void main(String[] args) {
		String s = "Toi di code dao";
		int count;
		char string[] = s.toCharArray();
		System.out.println("Duplicate char in a given String: ");
		for (int i = 0; i < string.length; i++){
			count = 1;
			for (int j = i+1 ; j < string.length; j++){
				if (string[i] == string[j] && string[i] != ' '){
					count++;
					string[j] = '0';
				}
				}
			if (count > 1 && string[i] != '0')
				System.out.println(string[i]);
			}
			}
		}
