package synchonization;

public class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
       t.printable(100);
    }
}
