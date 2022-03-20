package thread;


class my5 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2 == 0){
                System.out.println(Thread.currentThread().getName()+"\t\t"+i);
            }
        }
    }
}

public class class05 {
    public static void main(String[] args) {
        my5 t5runnable = new my5();
        Thread t5 = new Thread(t5runnable);
        t5.start();
    }
}
