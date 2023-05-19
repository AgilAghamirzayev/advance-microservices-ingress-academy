package sleep_wait_notify;

public class WaitVsSleepExample {

    /**
     *
     * In Java, both wait() and sleep() methods are used for multithreading, but they serve different
     * purposes. The wait() method is used to make a thread wait for a particular condition to occur,
     * while the sleep() method is used to suspend a thread for a specified amount of time.
     *
     * In this example, there are two threads: t1 and t2. The lock object is used to synchronize the two threads.
     *
     * Thread 1 waits for lock object to be notified by Thread 2.
     * Thread 2 sleeps for 5 seconds before notifying Thread 1.
     *
     * When you run this example, you'll see that Thread 2 starts first and waits for 5 seconds
     * before notifying Thread 1. Meanwhile, Thread 1 waits for the lock object to be notified.
     * Once Thread 2 notifies Thread 1, Thread 1 resumes its execution.
     *
     * So, in summary, the wait() method is used for waiting on a condition to occur,
     * while the sleep() method is used for suspending a thread for a specific amount of time.
     **/
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        //Thread 1
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

        //Thread 2
        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 2 started");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.notify();
                System.out.println("Thread 2 ended");
            }
        });

        t1.start();
        t2.start();
    }
}
