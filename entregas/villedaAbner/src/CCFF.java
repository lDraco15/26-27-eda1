public class CCFF {

    private Caja[] cajas;
    private Fila fila;
    final private int TIEMPO_TOTAL = 240;

    public CCFF() {
        cajas = new Caja[3];
        fila = new Fila();
    }

    public void simular() {
        Mapa mapa = new Mapa();

        for (int tiempoTranscurrido = 0; tiempoTranscurrido < TIEMPO_TOTAL; tiempoTranscurrido++) {
            mapa.proyectar();
            if (fila.llegaPersona()) {
                fila.recibePersona(1);
            }
            for (int i = 0; i < 3; i++) {
                if(cajas[i].estaVacia()){
                    fila.eliminaPersona(1);
                    cajas[i].recibePersona(1);
                }else{
                    cajas[i].intentarVaciar();
                }
            }
        }

    }

}
