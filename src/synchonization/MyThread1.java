package synchonization;

public class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
       t.printable(5);
    }
}
