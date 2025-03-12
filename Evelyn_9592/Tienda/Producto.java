public class Producto{
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(String nombre, int cantidad, double precio){
        setNombre(nombre);
        setCantidad(cantidad);
        setPrecio(precio);
    }
    public String getNombre(){
        return nombre;
    }
    public int getCantidad(){
        return cantidad;
    }
    public double getPrecio(){
        return precio;
    }
    
    public void setNombre(String nombre){
        if(nombre == null || nombre.isEmpty()){
            this.nombre = "Producto";
        }else{
            this.nombre = nombre;
        }
    }

    public void setCantidad (int cantidad){ 
        if(cantidad < 0){ 
            this.cantidad=0;
        }else{
            this.cantidad = cantidad;
        }
    }

    public void setPrecio(double precio){
        if(precio < 0){
            this.precio = 0;
        }else{
            this.precio = precio;
        }
    }

    public void aumentarCantidad(int cantidad){
           if (cantidad < 0) {
            this.cantidad = cantidad;
           }else{
            System.out.println("No hay suficiente productos.");
           }
    }

    public void disminuirCantidad(int cantidad){
           if (cantidad < 0) {
            this.cantidad = cantidad;
           }else{
            System.out.println("No hay suficientes productos.");
           }
    }
    
}