package runnable;

public class Main {
    public static void main(String[] args) {
        System.out.println("\"Main thread running... \"");
        MyRunnable runnable1 = new MyRunnable("Thread-1-HR-Database");
        runnable1.start();
        MyRunnable runnable2 = new MyRunnable("Thread-2-Send-Email");
        runnable2.start();
        System.out.println("Main thread stopped!!! ");

    }
}
