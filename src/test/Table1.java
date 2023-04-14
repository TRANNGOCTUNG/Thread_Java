package test;

public class Table1 {
    synchronized void printable(int t) {
        for (int i = 1; i < 5; i++) {
            System.out.println(t * i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
