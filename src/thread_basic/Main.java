package thread_basic;

public class Main {
    public static void main(String[] args) {
       NumberGenerator number = new NumberGenerator();
       try{
           while (number.getThread().isAlive()){
               System.out.println("Main thread will be alive till the child thread is live");
               Thread.sleep(700);
           }
       } catch (InterruptedException e) {
           System.out.println("Main thread interrupted");
       }
        System.out.println("Main thread run is over");
    }
}
