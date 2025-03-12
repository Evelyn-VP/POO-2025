public class Materia {
    private String nombre;
    private int creditos;

    // Constructor
    public Materia(String nombre, int creditos) {
        setNombre(nombre);
        setCreditos(creditos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return nombre + " (" + creditos + " créditos)";
    }
}
