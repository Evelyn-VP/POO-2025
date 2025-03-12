public class Cliente {
    //Atributos
    private String nombre;
    private String telefono;

    //Constructor
    public Cliente(String nombre, String telefono){
        setNombre(nombre);
        setTelefono(telefono);
    }
    public Cliente() {
        this.nombre = "Cliente";
        this.telefono = "Telefono";
    }

    //Metodos
    public String getNombre() { 
        return nombre; 
    }
    public String getTelefono() { 
        return telefono; 
    }

    public void setNombre(String nombre) {
        if(nombre==null|| nombre.isEmpty()){
             this.nombre = "cliente";
        }
        else{
        this.nombre = nombre;}
    }
    public void setTelefono(String telefono) {
        if(telefono == null || telefono.isEmpty()){
            this.telefono = "0000000000";
        }else{
            this.telefono = telefono;
        }
    }
}


