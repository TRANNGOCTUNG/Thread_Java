package show_chan_le;

public class EvenThread extends  Thread{
    @Override
    public void run(){
        try {
            for (int i = 2; i < 10; i += 2) {
                System.out.println("All Eventhread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println("Count not :" + e);
        }
        System.out.println("Success EvenThread:");
    
   }
}
