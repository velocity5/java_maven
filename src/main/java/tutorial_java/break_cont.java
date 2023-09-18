package tutorial_java;

public class break_cont {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i<=5;i++){
			if (i == 3)
				continue; // skip value
			 else
				sum+=i;
		}
		System.out.println("sum = " + sum);
		int n = 0;
		while(n < 100){
			System.out.println("n = " + n);
			if (n == 15)
				break; //stop excute the loop
			n++;
		}
	}
}
