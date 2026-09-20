public class Mapa {

    // Ahora recibe el objeto Fila en lugar de un int
    public void proyectar(int minuto, Fila fila, Caja[] cajas) {
        System.out.println("Minuto: " + (minuto + 1)); 
        System.out.println("------------------------------------------------");
        
        System.out.print("Fila: ");
        
        for (int i = 0; i < fila.getNumeroPersonas(); i++) {
            // Preguntamos si el cliente en esta posición es VIP
            if (fila.getCliente(i).esPreferente()) {
                System.out.print("(V) "); // VIP
            } else {
                System.out.print("\\o/ "); // Mortal Normal
            }
        }
        System.out.println("\n(Total formados: " + fila.getNumeroPersonas() + ")"); 
        
        System.out.println("------------------------------------------------");
        
        for (int i = 0; i < cajas.length; i++) {
            System.out.print("Caja " + (i + 1) + ": ");
            if (cajas[i].estaVacia()) {
                System.out.println("[ Vacía ]");
            } else {
                System.out.println("\\o/ (Atendiendo)");
            }
        }
        System.out.println("\n");
    }

    // Nuevo método para lanzar mensajes de la matriz
    public void imprimirEvento(String mensaje) {
        System.out.println(">>> EVENTO: " + mensaje + " <<<");
    }
    
    public void pantallaFinal(int atendidos, int enFila) {
        System.out.println("================================================");
        System.out.println("--- RESULTADOS DE LA SIMULACIÓN (4 HORAS) ---");
        System.out.println("Total de personas atendidas: " + atendidos);
        System.out.println("Personas que quedaron en la fila: " + enFila);
        System.out.println("================================================");
    }
}