package issues.racecondition;

public class Contador {
    private int contador = 0;
    private SemBinario sem = new SemBinario(1);

    public void incrementarContador() {
        sem.esperar();
        contador++;
        sem.notificar();
    }

    public int getContador() {
        return contador;
    }
}

class SemBinario {
    private int valor;

    public SemBinario(int valorInicial) {
        this.valor = valorInicial;
    }

    public synchronized void esperar() {
        while (valor == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valor--;
    }

    public synchronized void notificar() {
        valor++;
        notify();
    }
}