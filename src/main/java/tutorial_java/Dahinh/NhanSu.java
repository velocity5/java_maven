package tutorial_java.Dahinh;

public abstract class NhanSu {
	public abstract double tinhLuong(int ngayCong);
	// Them thuoc tinh
	private String ten;
	private String que;
	private String cccd;

	public NhanSu(String ten, String que, String cccd) {
		this.ten = ten;
		this.que = que;
		this.cccd = cccd;
	}

	public String getTen() {
		return ten;
	}

	public String getQue() {
		return que;
	}

	public String getCccd() {
		return cccd;
	}
}
