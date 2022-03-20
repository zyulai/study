package thread;

/**
 * 出现了线程安全问题
 * 当某个线程来操作该类的数据时，被阻塞了，然后后面--的操作没被执行
 * 也就是钱取了，但是共享数据没有及时更新
 * 导致后面的人也取到了钱，最后数据就发生了错误
 * 如何解决？
 *      加个锁
 *      当前线程在操作加锁的共享数据的时候，除非等到当前线程操作结束，不然其他线程不能操作加锁的共享数据
 *
 */

class draw implements Runnable{
    private static int money = 100;
    @Override
    public void run() {
        while (true){
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

public class drawMoney {
    public static void main(String[] args) {
        draw d1 = new draw();

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d1);
        Thread t3 = new Thread(d1);
        t1.start();
        t2.start();
        t3.start();
    }
}
