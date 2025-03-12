public class Vendedor {
     private String nombre;
     private String id;
     private String telefono;

     public Vendedor() {
        this.nombre = "Vendedor";
        this.id = "id";
        this.telefono = "Telefono"; 
    }


    public Vendedor(String nombre, String id, String telefono){
        setNombre(nombre);
        setId(id);
        setTelefono(telefono);
    }

    public String getNombre(){
        return nombre;
    }
    public String getId(){
        return id;
    }
    public String telefono(){
        return telefono;
    }

    public void setNombre(String nombre){
        if(nombre == null || nombre.isEmpty()){
            this.nombre = "Vendedor";
        }
        else{
            this.nombre = nombre;
        }
    }

    public void setId(String id){
        if(id == null || id.isEmpty()){
            this.id= "-Id";
        }
        else{
            this.id=id;
        }
    }

    public void setTelefono(String telefono){
        if(telefono == null || telefono.isEmpty()){
            this.telefono = "Telefono";
        }
        else{
            this.telefono=telefono;
        }
    }

    public void registrarVenta(){
        
    }
}
