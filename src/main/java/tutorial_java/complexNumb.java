package tutorial_java;

public class complexNumb {
	double re, img; // giu phan thuc va ao
// constructor de khoi tao so phuc
	public complexNumb(double re, double img) {
		this.re = re;
		this.img = img;
	}
	public static complexNumb sum(complexNumb c1, complexNumb c2){
		// so phuc tam thoi de giu tong 2 so
		complexNumb temp = new complexNumb(0,0);
		temp.re = c1.re + c2.re;
		temp.img = c1.img + c2.img;
		return temp;
	}

	public static void main(String[] args) {
		complexNumb c1 = new complexNumb(3.4,1.2);
		complexNumb c2 = new complexNumb(3.9,2.2);
		complexNumb temp = sum(c1,c2);
		System.out.println("KQ la: " + temp.re + " + " + temp.img + "i");
	}
}
