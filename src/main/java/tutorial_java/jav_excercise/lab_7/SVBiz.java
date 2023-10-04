package tutorial_java.jav_excercise.lab_7;

public class SVBiz extends SVPoly{
	double MarketingScore;
	double SaleScore;
	public SVBiz(String hoTen, double MarketingScore, double SalesScore, String nganh) {
		super(hoTen, nganh);
		this.SaleScore = SalesScore;
		this.MarketingScore = MarketingScore;
	}

	@Override
	public double getDiem() {
		return (2*MarketingScore+SaleScore)/3;
	}
}
