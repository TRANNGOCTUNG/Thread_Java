package thread_basic;

public class NumberGenerator implements Runnable{
    private Thread thread;
    public NumberGenerator() {
        thread = new Thread(this,"Creat array number: ");
        thread.start();
    }
    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Count number: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Count not successful: " + e);
        }
        System.out.println("Count successful: ");

    }
}
