package tutorial_java.jav_excercise.lab_12;

public class MyThread3 {
	static class thread1 extends Thread {
		public synchronized void export(){
			for (int i = 1; i <= 10; i++){
				System.out.println(i);
			}
			System.out.println("Export successfully");
			notify();
		}
	}
	static class thread2 extends Thread{
		public synchronized void filter(){
			System.out.println("Filtering...");
			for (int i = 1; i <= 10; i++){
				if (i%2 == 0){
					System.out.println("Even number is: " + i);
				} else{
					System.out.println("Odd number is: " + i);
				}
			}
			try{
				wait(2000);
			} catch (Exception e){
				System.out.println("Error" + e);
			}
		}
	}

	public static void main(String[] args) {
		thread1 t1 = new thread1(){
			public void run(){
				export();
			}
		};
		t1.start();
		thread2 t2 = new thread2(){
			public void run(){
				filter();
			}
		};
		t2.start();
	}
}
