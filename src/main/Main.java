package main;


import issues.racecondition.Contador;
import issues.racecondition.HiloContador;



public class Main {
    public static void main(String[] args) throws InterruptedException {

        // forma Thread
        /*HiloThread hilo1 = new HiloThread();
        HiloThread hilo2 = new HiloThread();
        HiloThread hilo3 = new HiloThread();

        hilo1.start();
        hilo2.start();
        hilo3.start();*/
        //forma Runnable
        /*Thread hilo1 = new Thread(new HiloThread());
        Thread hilo2 = new Thread(new HiloThread());
        Thread hilo3 = new Thread(new HiloThread());

        hilo1.start();
        hilo2.start();
        hilo3.start();*/

        Contador contador = new Contador();
        Runnable tarea1 = new HiloContador(contador);
        Runnable tarea2 = new HiloContador(contador);

        Thread hilo1 = new Thread(tarea1);
        Thread hilo2 = new Thread(tarea2);

        hilo1.start();
        hilo2.start();

        hilo1.join();
        hilo2.join();

        System.out.println("Valor final del contador " + contador.getContador());


    }
}