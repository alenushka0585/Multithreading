package concurent.executors;

public class SimpleThread implements Runnable {
    public int count = 0;
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            count++;
        }
        System.out.println(count);
    }
}
