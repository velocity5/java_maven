package tutorial_java.truutuong;

abstract class bike {
	// regular method
	void sound(){
		System.out.println("Beep Beep");
	}
	// subclass (inherit from honda)
	public abstract void horn();
}
