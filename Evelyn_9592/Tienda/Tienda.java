public class Tienda {
    private String nombre;
    private String direccion;

    public Tienda(String nombre,String direccion ){
        setNombre(nombre);
        setDireccion(direccion);
    }
     public Tienda() {
        this.nombre = "Tienda";
        this.direccion = "Direccion";
    }
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
   
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            this.nombre = "Tienda";
        } else {
            this.nombre = nombre;
        }
    }

    public void setDireccion(String direccion) {
       if (direccion == null || direccion.isEmpty()) {
            this.direccion = "Direccion";
       } 
       else {
        this.direccion = direccion;
    } 
    }   
    public String toString(){
        return "Nombre: "+getNombre()+" Direccion: "+getDireccion();   
    }
    }


