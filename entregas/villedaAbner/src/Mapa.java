public class Mapa {

    public void proyectar(int minuto, int numPersonas, Caja[] cajas) {
        System.out.println("Minuto: " + (minuto + 1)); 
        System.out.println("------------------------------------------------");
        
        System.out.print("Fila: ");
        
        for (int i = 0; i < numPersonas; i++) {
            System.out.print("\\o\\ "); 
        }
        System.out.println(); 
        
        System.out.println("------------------------------------------------");
        
        
        for (int i = 0; i < cajas.length; i++) {
            System.out.print("Caja " + (i + 1) + ": ");
            if (cajas[i].estaVacia()) {
                System.out.println("-");
            } else {
                System.out.println("\\o\\");
            }
        }
        System.out.println("\n");
    }

    
    public void pantallaFinal(int atendidos, int enFila) {
        System.out.println("================================================");
        System.out.println("--- RESULTADOS DE LA SIMULACIÓN (4 HORAS) ---");
        System.out.println("Total de personas atendidas: " + atendidos);
        System.out.println("Personas que quedaron en la fila: " + enFila);
        System.out.println("================================================");
    }
}