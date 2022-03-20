package thread;

/**
 * 创建线程的方法2：实现runnable接口
 * 相对于继承的好处：
 *      1。单继承，不能多继承，接口可以多继承
 *      2。更适合来处理多个线程共享数据的对象
 *
 *  联系：
 *      1。需要重写run方法
 */
class runnable implements Runnable{
    private static int ticket = 100;
    @Override
    public void run() {
        while (ticket>0){
            System.out.println("sell:"+ticket);
            ticket--;
        }
    }
}

public class class06 {
    public static void main(String[] args) {
        runnable r = new runnable();
        Thread t1 = new Thread(r);
        t1.setName("thread1");
        Thread t2 = new Thread(r);
        t2.setName("thread2");
        Thread t3 = new Thread(r);
        t3.setName("thread3");
        t1.start();
        t2.start();
        t3.start();
    }
}
