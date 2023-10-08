package tutorial_java.jav_excercise.lab_12;

public class MyThread2 {
	static class thread1 extends Thread{
		public void run() {
			for (int i = 0; i < 10; i++) {
				if (i % 2 == 0)
					System.out.println("The even number from 1-10 is: " + i);
			}
		}
	}

	static class thread2 extends Thread {
		public void run() {
			for (int i = 0; i < 10; i++) {
				if (i % 2 != 0)
					System.out.println("The odd number from 1-10 is: " + i);
			}
		}

		public static void main(String[] args) {
			thread1 t1 = new thread1();
			thread2 t2 = new thread2();
			t1.setPriority(Thread.MAX_PRIORITY);
			t1.start();
			t2.start();
		}
	}
}
