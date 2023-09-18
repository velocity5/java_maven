package tutorial_java;

public class threadExtend extends Thread{
    public static void main(String[] args) {
        threadExtend thread = new threadExtend();
        thread.start();

        System.out.println("Outside of Thread");
    }
    public void run(){
        System.out.println("Inside of Thread");
    }
}
