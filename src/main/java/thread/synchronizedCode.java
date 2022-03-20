package thread;

/**
 * 同步代码块：
 *      如果操作共享数据的代码包含在一个方法里面，可以使用同步代码块来实现线程安全
 */

class draw2 implements Runnable{
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

public class synchronizedCode {
    public static void main(String[] args) {
        
    }
}
