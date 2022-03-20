package thread;

/**
 * super（name）设置线程名字
 */
public class class03 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2 ==0 ){
                System.out.println(Thread.currentThread().getName()+"\t\t"+i);
            }

            if (i%10 == 0){
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class03(String name) {
        super(name);
    }

    public static void main(String[] args) throws Exception{
        class03 t3 = new class03("thread3");
        t3.start();
        Thread.currentThread().setName("main");
        for (int i = 1; i < 100; i++) {
            if (i%2 ==0){
                System.out.println(Thread.currentThread().getName()+"\t\t"+i);
            }
            if (i %20 == 0){
                t3.join();
            }
        }
    }
}
