package thread;

/**
 * 在java中有两个方法可以实现
 *  1。同步代码块
 *      synchronized(同步监视器){
 *          需要被同步的代码
 *      }
 *    操作共享数据的方法就是需要被同步的代码
 *    共享数据：被多个线程共同操作的数据
 *    同步监视器：俗称，锁
 *          任何一个对象都可以充当锁
 *          要求：多个线程公用一把锁（！大多数线程还是不安全是因为锁不是同一把）
 *    好处：解决了线程安全问题
 *    缺点：速度变慢了
 *  2。同步方法
 *
 */

class draw1 implements Runnable{
    private static int money = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while (true){
            //错误的锁，
            //所有线程没有公用同一把锁
            //Object obj = new Object();
            synchronized (obj){
                if (money > 0){

                    //提升了出现错票的概率
                    try {
                        Thread.currentThread().sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"\t"+money);
                    money--;
                }else {
                    break;
                }
            }
        }
    }
}


public class synchronizedWay {
    public static void main(String[] args) {
        draw1 d1 = new draw1();

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d1);
        Thread t3 = new Thread(d1);
        t1.start();
        t2.start();
        t3.start();
    }
}
