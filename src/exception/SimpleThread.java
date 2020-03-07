package exception;

public class SimpleThread implements Runnable {
    public void run() {
        throw new RuntimeException("It is a greate exception.");
    }
}
