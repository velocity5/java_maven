package tutorial_java.testInterface;

public class test implements vduInterface{
	/* public: kieu access modifier, static: Goi ma ko can tao doi tuong, void: ko co return
	main: ten method, String[] args: mang cac doi so dong lenh
	 */

	public static void main(String[] args) {
		test t = new test();
		t.display();
		System.out.println(a);
	}

	@Override
	public void display() {
		System.out.println("Yahoo!");
	}
}
