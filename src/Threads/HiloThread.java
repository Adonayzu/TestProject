package Threads;

public class HiloThread extends Thread {

    @Override
    public void run() {
        System.out.println("Excuting Thread"+ Thread.currentThread().getName());
    }
}
