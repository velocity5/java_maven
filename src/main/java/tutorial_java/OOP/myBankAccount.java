package tutorial_java.OOP;

public class myBankAccount {
	private double soDu;

	public void napTien(double soTien) throws IllegalAccessException {
		if (soTien <= 0) {
			throw new IllegalAccessException("So tien phai lon hon 0");
		}
		soDu = soDu + soTien;
	}

	public void rutTien(double soTien) throws IllegalAccessException {
		if (soTien > soDu) {
			throw new IllegalAccessException("So tien phai nho hon so du");
		}
		soDu = soDu - soTien;
	}

	public double getSoDu() {
		return soDu;
	}
}
