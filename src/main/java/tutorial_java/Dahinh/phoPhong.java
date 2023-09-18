package tutorial_java.Dahinh;

public class phoPhong extends NhanSu{

	public phoPhong(String ten, String que, String cccd) {
		super(ten, que, cccd);
	}

	@Override
	public double tinhLuong(int ngayCong) {
		return 40*ngayCong;
	}
}
