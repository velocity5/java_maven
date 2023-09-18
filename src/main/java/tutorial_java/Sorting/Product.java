/*
Cau truc cua class: thuoc tinh + method
 */
package tutorial_java.Sorting;

public class Product implements Comparable<Product>{
	//thuoc tinh
	private int productCode;
	private String ProductName;
	private double price;
	// constructor - khoi tao khi doi tuong dc tao
	public Product(int productCode, String productName, double price) {
		this.productCode = productCode;
		this.ProductName = productName;
		this.price = price;
	}
	// get - set: xem, sua thong tin
	public int getProductCode() {
		return productCode;
	}

	public String getProductName() {
		return ProductName;
	}

	public double getPrice() {
		return price;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	// toString - xuat thong tin doi tuong

	@Override
	public String toString() {
		return (productCode+ "\t" + ProductName + "\t" + price);
	}

	// method
	// sx theo gia
	@Override
//	public int compareTo(Product o) {
//		if (this.price < o.price)
//			return -1;
//		else if (this.price > o.price) {
//			return 1;
//		}
//		return 0;
//	}
	// sx theo ten
	public int compareTo(Product o) {
		return this.ProductName.compareToIgnoreCase(o.ProductName);
	}
}
