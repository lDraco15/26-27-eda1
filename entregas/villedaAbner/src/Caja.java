public class Caja {
    private int personasAtendidas;
    private boolean ocupada;

    public Caja() {
        personasAtendidas = 0;
        ocupada = false;
    }

    public boolean estaVacia() {
        return !ocupada;
    }

    public void recibePersona() {
        ocupada = true; 
    }

    public int getPersonasAtendidas() {
        return personasAtendidas;
    }

    public void intentarVaciar() {
        if (Math.random() < 0.4) {
            ocupada = false;
            personasAtendidas++;
        }
    }
}
