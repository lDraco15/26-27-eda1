class MiListaSimulada {

    int capacidad;
    int[] lista;

    public MiListaSimulada() {
        capacidad = 10;
        lista = new int[capacidad];
    }

    public int getCabeza() {
        return lista[0];
    }

    public int getCola() {
        return lista[capacidad - 1];
    }

    public int getEnMedio() {
        int numeroMedio = capacidad / 2;

        return lista[numeroMedio];
    }

}