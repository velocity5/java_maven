package tutorial_java.truutuong;

public class Honda extends bike implements engineSound {

	@Override
	public void horn() {
		System.out.println("The Honda bike's horn sound");
	}
	public void Esound() {
		System.out.println("Brun Brun!!!");
	}
	public void horsePower() {
		System.out.println("The horse power of this Honda car is: 1000hp");
	}

	public static void main(String[] args) {
		bike soundBike = new Honda();
		soundBike.sound();
		soundBike.horn();

		engineSound engineBike = new Honda();
		engineBike.Esound();
		engineBike.horsePower();

	}
}
