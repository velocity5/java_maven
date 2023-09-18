package tutorial_java;

public class threadImplement implements Runnable{
    public static void main(String[] args) {
        threadImplement thread = new threadImplement();
        Thread threadObject = new Thread(thread);
        threadObject.start();

        System.out.println("Outside of Thread");
    }

    @Override
    public void run() {
        System.out.println("Inside of Thread");
    }
}
