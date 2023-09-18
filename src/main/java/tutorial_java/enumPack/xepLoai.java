package tutorial_java.enumPack;

public enum xepLoai {
	Gioi ("XL Giỏi"),
	Kha ("XL Khá"),
	TB ("XL Trung Bình"),
	Yeu ("XL Yếu"),
	Loai ("Đuổi học");
	private String msg;
	xepLoai(String msg){
		this.msg = msg;
	}
	public String descript(){
		return this.msg;
	}
}
