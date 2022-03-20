package thread;

/**
 * 继承的方式实现多线程
 */
public class class01 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();
        for (int i = 0; i < 10000; i++) {
            if (i %2 ==1){
                System.out.println(i+"main-----------");
            }
        }
    }
}
