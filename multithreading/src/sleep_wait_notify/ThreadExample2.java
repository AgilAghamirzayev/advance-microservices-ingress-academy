package sleep_wait_notify;

public class ThreadExample2 {

  public static void main(String[] args) {
    Runnable runnable = () -> {
      String name = Thread.currentThread().getName();
      System.out.println(name + " running");

      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      System.out.println(name + " finished");
    };

    Thread thread1 = new Thread(runnable, "Thread 1");
    thread1.start();
    Thread thread2 = new Thread(runnable, "Thread 2");
    thread2.start();
  }

}
