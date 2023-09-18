package tutorial_java.company;

public class AdministrativeStaff extends Employee{
	public AdministrativeStaff(String ten, String que, int cccd) {
		super(ten, que, cccd);
	}

	@Override
	public double tinhLuong() {
		return lcb;
	}
}
