public class Elecciones {
    
    public static void main(String[] args) {
        ListaAlumnos presentes = new ListaAlumnos();
        ListaCandidatos candidatos = new ListaCandidatos();

        Alumno juan= new Alumno("Juan");
        Alumno maria= new Alumno("Maria");
        Alumno pepe= new Alumno("Pepe");
        Alumno manuel= new Alumno("Manuel");
        Alumno p2= new Alumno("P2");
        Alumno hercules= new Alumno("Hercules");

        presentes.registrarLlegada(juan);
        presentes.registrarLlegada(maria);
        presentes.registrarLlegada(pepe);
        presentes.registrarLlegada(manuel);
        presentes.registrarLlegada(p2);
        presentes.registrarLlegada(hercules);

        



    }
}
