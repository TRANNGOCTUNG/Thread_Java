package synchonization1;

public class Main {
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread1 myThread = new MyThread1(obj);

        MyThread2 myThread2 = new MyThread2(obj);
        myThread.start();
        myThread2.start();

    }
}
