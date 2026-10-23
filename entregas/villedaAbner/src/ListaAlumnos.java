class ListaAlumnos {
    private NodoAlumno cabeza;

    public ListaAlumnos() {
        this.cabeza = null;
    }

    public void registrarLlegada(Alumno nuevoAlumno) {
        NodoAlumno nuevo = new NodoAlumno(nuevoAlumno);
        
        if (cabeza == null) {
            cabeza = nuevo;
        }
        
        NodoAlumno actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
            
        actual.siguiente = nuevo; 
    }
}