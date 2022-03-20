package thread;

/**
 * 常见方法
 */
public class class02 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.setName("thread1");
        t2.setName("thread2");
        t1.start();
        t2.start();
        Thread.currentThread().setName("main");
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"\t\t"+i);
        }
    }
}
