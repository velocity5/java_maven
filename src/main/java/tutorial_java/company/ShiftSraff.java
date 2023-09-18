package tutorial_java.company;

public class ShiftSraff extends Employee{
	protected int shift;
	public ShiftSraff(String ten, String que, int cccd) {
		super(ten, que, cccd);
	}
	public ShiftSraff(String ten, String que, int cccd, int shift) {
		super(ten, que, cccd);
		this.shift = shift;
	}

	@Override
	public double tinhLuong() {
		return lcb*1.05; // cao hon so vs nhan vien hanh chinh
	}
}
