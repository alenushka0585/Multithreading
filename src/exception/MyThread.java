package exception;

public class MyThread implements Runnable {
    public void run() {
        throw new RuntimeException();
    }
}
