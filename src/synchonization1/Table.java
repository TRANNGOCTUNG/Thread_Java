package synchonization1;

public class Table {
    synchronized void printable(int t) {
        for (int i = 1; i < 5; i++) {
            System.out.println( i * t );
        }
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
