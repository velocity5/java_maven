package tutorial_java.jav_excercise.lab_7;

public class SVIT extends SVPoly {
	double JavaScore;
	double HtmlScore;
	double CssScore;

	public SVIT(String hoTen, double JavaScore, double HtmlScore, double CssScore, String nganh) {
		super(hoTen, nganh);
		this.CssScore = CssScore;
		this.JavaScore = JavaScore;
		this.HtmlScore = HtmlScore;
	}

	@Override
	public double getDiem() {
		return (2*JavaScore + HtmlScore + CssScore) / 4;
	}
}
