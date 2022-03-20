package thread;

public class MyThread3 extends Thread{
    private static int ticket= 100;
    @Override
    public void run() {
        while (ticket>0){
            System.out.println("sell:"+ticket);
            ticket--;
        }
    }

    public MyThread3(String name) {
        super(name);
    }
}
