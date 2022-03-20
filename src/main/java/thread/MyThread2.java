package thread;

public class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2 == 1){
                System.out.println(Thread.currentThread().getName()+"\t\t"+Thread.currentThread().getPriority()+i);
            }
        }
    }
}
