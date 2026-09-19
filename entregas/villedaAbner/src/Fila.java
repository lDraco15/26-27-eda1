public class Fila {
    private int numeroPersonas;
    final private double PROBABILIDAD_DE_PERSONA = 0.6;

    public Fila() {
        numeroPersonas = 0;
    }

    public boolean llegaPersona() {
       return Math.random() < PROBABILIDAD_DE_PERSONA;
    }

    public void recibePersona(int personaRecibida) {
        numeroPersonas = numeroPersonas + personaRecibida;
    }

    public void eliminaPersona(int personaEliminada) {
        numeroPersonas = (numeroPersonas > 0) ? numeroPersonas - personaEliminada : 0;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }
}
