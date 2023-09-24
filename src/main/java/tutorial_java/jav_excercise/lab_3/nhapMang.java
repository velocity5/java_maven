package tutorial_java.jav_excercise.lab_3;

public class nhapMang {

	public static void main(String[] args) {
		String[] nameSV = {"Minh", "Manh", "Tuan", "Thao"};
		double[] scoreSV = {6.5, 3, 8.5, 10};
		for(int i = 0; i < scoreSV.length; i++){
			for (int j = i + 1; j < scoreSV.length;j++){
				if (scoreSV[i] > scoreSV[j]){
					double temp = scoreSV[i];
					scoreSV[i] = scoreSV[j];
					scoreSV[j] = temp;
				}
			}
			String name = nameSV[i];
			double score = scoreSV[i];
			String level = score >= 10 ? "Xuat sac" : score >= 7.5 ? "Gioi" : score >= 6.5 ? "Kha" : score > 5 ? "TB" : score >= 0 ? "Kem" : "Ko phai so";
			String result = String.format("Ho ten: %s, Diem: %s, Xep loai:  %s", name, score, level);
			System.out.println(result);
		}
	}
}

