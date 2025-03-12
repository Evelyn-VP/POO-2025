import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;

    public Universidad(String nombre) {
        setNombre(nombre);
        profesores = new ArrayList<>();
    }

    public void agregarProfesor(Profesor profesor) {
        if (profesor != null) {
            profesores.add(profesor);
            profesor.asignarUniversidad(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor(int pos) {
        if (pos >= 0 && pos < profesores.size()) {
            return profesores.get(pos);
        }
        return null;
    }

    public List<Profesor> getProfesores() {
        return new ArrayList<>(profesores); 
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Universidad: ").append(nombre).append("\r\nProfesores:\r\n");
        for (Profesor profesor : profesores) {
            sb.append(profesor).append("\r\n");
        }
        return sb.toString();
    }
}
