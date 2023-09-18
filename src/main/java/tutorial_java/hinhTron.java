package tutorial_java;

public class hinhTron {
	public static int dem = 0;
	public int bKinh;
	public hinhTron(int bKinh){
		this.bKinh = bKinh;
		dem++;
	}

	public static void main(String[] args) {
		hinhTron hT = new hinhTron(2);
		hinhTron hT1= new hinhTron(3);
		System.out.println(hinhTron.dem);
	}
}
