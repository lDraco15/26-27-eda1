public class CCFF {

    private Caja[] cajas;
    private Fila fila;
    private Cliente[] filaClientes;
    final private int TIEMPO_TOTAL = 240;
    private int totalPersonasAtendidas;
    final private double PROBABILIDAD_DE_SALIDA = 0.4;

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

            if (tiempoTranscurrido % 5 == 0 ) {
                for(int i=0; i < fila.getNumeroPersonas(); i++){
                    if(fila.estaAburrido(i)){
                        fila.clienteSaleFila(i);
                        i--;
                    }
                }
            }

            if (fila.llegaCliente()) {
                boolean esVip = RNG() < 0.1;
                int objetos = (int) (RNG() * 20) + 1;
                Cliente nuevoCliente = new Cliente(tiempoTranscurrido, esVip, objetos);
                fila.recibePersona(nuevoCliente);

            }
            if (RNG() < PROBABILIDAD_DE_SALIDA) {
                for (int i = 0; i < cajas.length; i++) {
                    if (!cajas[i].estaVacia()) {
                        cajas[i].vaciarCaja();
                        break;
                    }
                }

            }
            for (int i = 0; i < cajas.length; i++) {
                if (cajas[i].estaVacia() && fila.getNumeroPersonas() > 0) {
                    fila.eliminaPersona(1);
                    cajas[i].recibePersona();
                }
            }

            for(int i = 0; i < fila.getNumeroPersonas(); i++){
                fila.getCliente(i).aumentarMinuto();
            }

        }
        for (int i = 0; i < cajas.length; i++) {
            totalPersonasAtendidas += cajas[i].getPersonasAtendidas();
        }
        mapa.pantallaFinal(totalPersonasAtendidas, fila.getNumeroPersonas());

    }

    private double RNG() {
        return Math.random();
    }
}
