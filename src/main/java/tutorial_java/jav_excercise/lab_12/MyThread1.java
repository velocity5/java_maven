package tutorial_java.jav_excercise.lab_12;

public class MyThread1 implements Runnable{
	public void run(){
		for (int i = 0; i < 10; i++){
			System.out.println(i);
			try{
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				System.out.println("First thread error " +ie);
			}
		}
	}
	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1();
		Thread t1 = new Thread(thread1); // Su dung Runnable constructor
		MyThread1 thread2 = new MyThread1();
		Thread t2 = new Thread(thread2);
		t1.start();
		t2.start();
	}
}
