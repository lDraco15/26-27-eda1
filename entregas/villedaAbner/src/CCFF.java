public class CCFF {

    private Caja[] cajas;
    private Fila fila;
    final private int TIEMPO_TOTAL = 240;
    private int totalPersonasAtendidas;

    public CCFF() {
        cajas = new Caja[4];
        for (int i = 0; i < 4; i++) {
            cajas[i] = new Caja();
        }
        fila = new Fila();
    }

    public void simular() {
        Mapa mapa = new Mapa();

        for (int tiempoTranscurrido = 0; tiempoTranscurrido < TIEMPO_TOTAL; tiempoTranscurrido++) {
            mapa.proyectar(tiempoTranscurrido, fila.getNumeroPersonas(), cajas);
            if (fila.llegaPersona()) {
                fila.recibePersona(1);
            }
            for (int i = 0; i < 4; i++) {
                if (cajas[i].estaVacia() && fila.getNumeroPersonas() > 0) {
                    fila.eliminaPersona(1);
                    cajas[i].recibePersona();
                } else if (!cajas[i].estaVacia()) {
                    cajas[i].intentarVaciar();
                }
            }

        }
        for (int i = 0; i < 4; i++) {
                totalPersonasAtendidas += cajas[i].getPersonasAtendidas();
            }
            mapa.pantallaFinal(totalPersonasAtendidas, fila.getNumeroPersonas());

    }
}
