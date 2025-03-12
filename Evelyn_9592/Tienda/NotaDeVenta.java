import java.util.Vector;

public class NotaDeVenta {
    private String id;
    private String fecha;
    private double total;
    private Cliente cliente;
    private Vendedor vendedor;
    private Tienda tienda;
    private Vector <Producto> productos;
    private Vector <Integer> cantidades;

    public NotaDeVenta(String id, String fecha, double total, Cliente cliente, Vendedor vendedor, Tienda tienda){
        setId(id);
        setFecha(fecha);
        this.total = 0.0;
        this.tienda = tienda;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.productos = new Vector <>();
        this.cantidades = new Vector <>();
    }

    public String getId(){ return id;}
    public String getFecha(){ return fecha;}
    public double getTotal(){return total;}
    
    public void setId(String id){
        if(id == null || id.isEmpty()){
            id = "id";
        }else{
            this.id= id;
        }
    }

    public void setFecha(String fecha) {
        if (fecha == null || fecha.isEmpty()) {
            this.fecha = "00-00-0000";
        } else {
            this.fecha= fecha;
        }
    }
    
    public void setTotal(double total){
        if(total <= 0.0){
            System.out.println("(error)");
            this.total= 0.0;
        }else{
            this.total=total;
        }
    }    
    
    public void agregarProducto(Producto producto, int cantidad){
        if(producto.getCantidad() < cantidad){
            System.out.println("Sin productos suficientes");
        }else{
        productos.add(producto);
        cantidades.add(cantidad);
        }
    }

    public void calcularTotal() {
        double total = 0;
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            int cantidad = cantidades.get(i);
            total += producto.getPrecio() * cantidad;
        }
        this.total = total;
        System.out.println("El total es: "+total);
    }
    

    public void actualizarStock(){
       for(int i = 0; i < productos.size(); i++){
        Producto producto = productos.get(i);
        int cantidadVendida = cantidades.get(i);

        producto.disminuirCantidad(cantidadVendida);
       }
    }


    public void imprimirNota() {
        System.out.println("Nota de venta");
        System.out.println("id: " + this.id);
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Cliente: " + this.cliente.getNombre());
        System.out.println("Vendedor: " + this.vendedor.getNombre());
        System.out.println("\nProductos:");
        
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            int cantidad = cantidades.get(i); 
            
            System.out.println(
                " " + producto.getNombre() + 
                "\t| Cantidad: " + cantidad + 
                "\t| Precio unitario: $" + producto.getPrecio() + 
                "\t| Subtotal: $" + (producto.getPrecio() * cantidad)
            );
        }
    }

}

