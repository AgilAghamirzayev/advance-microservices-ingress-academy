package sleep_wait_notify;

public class NotifyExample {
    public static void main(String[] args) {
        Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 1 started");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 resumed");
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 2 started");
                lock.notify();
                System.out.println("Thread 2 ended");
            }
        });

        t1.start();
        t2.start();
    }
}
