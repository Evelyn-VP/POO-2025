public class Main {
    
   public static void main(String []args){

    Producto tomate = new Producto("tomate", 100, 25);
    Producto jamon = new Producto("Jamon", 250, 50);
    Producto charritos = new  Producto("Charritos", 250, 50);
    Producto papa = new Producto("Papa", 250, 15);

    Cliente cliente1 = new Cliente("Toñito", "485");
    Cliente cliente2 = new Cliente("Juanito", "497");

    Tienda tienda1 = new Tienda("Abarrotes", "CALLE 22c");

    Proveedor proveedor1 = new Proveedor("Adove", "Mexico", "581");

    Vendedor vendedor1 = new Vendedor("Carlos", "001", "478");


   NotaDeVenta nota = new NotaDeVenta("001", null, 5, cliente1, vendedor1, tienda1);
   nota.agregarProducto(jamon, 16);
   nota.agregarProducto(papa, 15);
   nota.agregarProducto(charritos, 10);
   nota.imprimirNota();
   nota.calcularTotal();
   }
}
