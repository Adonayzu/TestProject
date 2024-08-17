package Threads;

public class HiloRunnable  extends TestInterface implements Runnable {

    @Override
    public void run() {
        System.out.println("Excuting Thread"+ Thread.currentThread().getName());
    }
}
