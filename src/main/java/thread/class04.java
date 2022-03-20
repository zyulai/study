package thread;

/**
 * 卖票
 */
public class class04 {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3("t1");
        MyThread3 t2 = new MyThread3("t2");
        MyThread3 t3 = new MyThread3("t3");

        t1.start();
        t2.start();
        t3.start();
    }
}
