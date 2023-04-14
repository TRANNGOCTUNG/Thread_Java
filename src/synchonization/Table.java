package synchonization;

public class Table {
    void printable(int n){
        for (int i = 1; i < 5 ; i++) {
            System.out.println(n * i);
        }
        try{
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
