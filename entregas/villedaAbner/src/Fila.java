public class Fila {
    private int cantidadActualPersonas;
    final private double PROBABILIDAD_DE_PERSONA = 0.6;
    private Cliente[] filaClientes;
    final private int MAXIMO_PERSONAS_LINEA = 30;

    public Fila() {
        filaClientes = new Cliente[35];
        cantidadActualPersonas = 0;
    }

    public boolean llegaCliente() {
        return Math.random() < PROBABILIDAD_DE_PERSONA;
    }

    public void recibePersona(Cliente clienteRecibido) {
        if (cantidadActualPersonas < MAXIMO_PERSONAS_LINEA) {
            filaClientes[cantidadActualPersonas] = clienteRecibido;
            cantidadActualPersonas++;
        }
    }

    public void eliminaPersona(int personaEliminada) {
        filaClientes[0] = null;
        for (int i = 0; i < cantidadActualPersonas - 1; i++) {
                filaClientes[i] = filaClientes[i + 1];    
        }
        filaClientes[cantidadActualPersonas] = null;
        cantidadActualPersonas--;
    }

    public int getNumeroPersonas() {
        return cantidadActualPersonas;
    }

    public Cliente getCliente() {
        return filaClientes[0];
    }
}
