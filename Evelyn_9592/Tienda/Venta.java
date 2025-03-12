import java.util.ArrayList;

public class Venta {
    private ArrayList<Producto> productos;
    private ArrayList<Integer> cantidades;
    private double total;

    public Venta(){
        productos = new ArrayList<>();
        cantidades = new ArrayList<>();
        total = 0.0;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        if (producto.getCantidad() < cantidad) {
            System.out.println("No alcanza los productos" + producto.getNombre());
        } else {
            productos.add(producto);
            cantidades.add(cantidad);
        }
    }

    public void calcularTotal() {
     
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            int cantidad = cantidades.get(i);
            total += producto.getPrecio() * cantidad;
        }
        this.total = total;
        System.out.println("El total es: " + total);
    }

    public void mostrarDetalles() {
        System.out.println("Venta");
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            int cantidad = cantidades.get(i);
            System.out.println("Producto: " + producto.getNombre() +
                    " | Cantidad: " + cantidad +
                    " | Precio unitario: $" + producto.getPrecio() +
                    " | Subtotal: $" + (producto.getPrecio() * cantidad));
        }
    }
}
