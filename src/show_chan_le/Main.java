package show_chan_le;

public class Main {
    public static void main(String[] args) {
        EvenThread et = new EvenThread();
        OddThread od = new OddThread();
        et.start();
        try {
            et.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        od.start();
        System.out.println("SuccessFull:");

    }
}
