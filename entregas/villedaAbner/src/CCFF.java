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
        

        for(int tiempoTranscurrido = 0; tiempoTranscurrido < TIEMPO_TOTAL; tiempoTranscurrido++){
            mapa.proyectar();
            if(fila.llegaPersona()){
                fila.recibePersona(1);
            }
        }

    }

}
