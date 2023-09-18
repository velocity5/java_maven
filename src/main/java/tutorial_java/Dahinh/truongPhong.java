package tutorial_java.Dahinh;

public class truongPhong extends NhanSu{

	public truongPhong(String ten, String que, String cccd) {
		super(ten, que, cccd);
	}

	@Override
	public double tinhLuong(int ngayCong) {
		return 50*ngayCong;
	}
}
