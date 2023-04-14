package test;

import synchonization1.Table;

class Main {
    public static void main(String[] args) {
        final Table1 obj = new Table1();
        Thread t1 = new Thread(){
            public void run() {
                obj.printable(5);
            }
        };
        Thread t2 = new Thread(){
            public void run() {
                obj.printable(10);
            }
        };
        t1.start();
        t2.start();
    }
}
