package tutorial_java.jav_excercise.lab_8;

final public class XPoly {
	static public double sum(double...x){
		double s = 0;
		for (double u:x)
			s+=u;
		return s;
	}
	static public double mini(double...x){
		if (x.length == 0){
			System.out.println("No number provided");

		}
		double min = x[0];
		for (int i = 1; i < x.length; i++){
			if (x[i] < min)
				min = x[i];
		}
		return min;
	}
	static public double maxi(double...x){
		double max = x[0];
		for (int i = 1; i < x.length; i++){
			if (x[i] > max)
				max = x[i];
		}
		return max;
	}
	static public String toUpperFirstChar(String x){
		String[] w = x.split(" ");
		for (int i = 0; i < w.length; i++){
			char firstChar = w[i].charAt(0);
			String upperCase = String.valueOf(String.valueOf(firstChar).toUpperCase().charAt(0));
			w[i] = upperCase + w[i].substring(1);

		}
		return String.join(" ", w);
	}

//	public static void main(String[] args) {
//		double s1 = sum(3.3,2.1,1.3);
//		System.out.println(s1);
//		double s2 = mini(2.1,3.5,5.2,-12);
//		System.out.println(s2);
//		double s3 = maxi(3.2,9.5,2.3,8.5);
//		System.out.println(s3);
//		String s4 = toUpperFirstChar("nghiem nhu");
//		System.out.println(s4);
//	}
}
