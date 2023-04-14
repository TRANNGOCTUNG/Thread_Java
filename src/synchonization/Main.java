package synchonization;

public class Main {
    public static void main(String[] args) {
        Table obTable = new Table();
        MyThread1  myThread = new MyThread1(obTable);
        MyThread2 myThread2 = new MyThread2(obTable);
        myThread.start();
        myThread2.start();
    }
}
