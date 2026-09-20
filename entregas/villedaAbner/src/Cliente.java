public  class Cliente {
    private boolean prioridad;
    private int minutoDeLlegada;
    private int numeroObjetos;

    public Cliente(int minutoDeLlegada, boolean prioridad, int numeroObjetos) {
        this.minutoDeLlegada = minutoDeLlegada;
        this.prioridad = prioridad;
        this.numeroObjetos = numeroObjetos;
    }

    
    public  boolean esPreferente(){
        return prioridad;
    }

    public int getMinutoLlegada(){
        return minutoDeLlegada;
    }

    public int getNumeroObjetos(){
        return numeroObjetos;
    }


}
