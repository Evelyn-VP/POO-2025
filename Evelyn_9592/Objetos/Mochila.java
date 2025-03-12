 public class Mochila { 

    private String color; 
    private String marca; 
    private boolean  estado; //true: Abierto, false: Cerrado; 
    private String material; 
   // Constructor 

    public Mochila(String color, String marca, boolean estado, String material) { 
        setColor(color);
        setMarca(marca);
        setEstado(estado);
        setMaterial (material);
    } 

   public Mochila (String color, String marca, int estado, String material){ 
    } 
    public void setColor (String color){ 
        this.color = (color.equals("")) ? "Rosa" : color; 
    } 
   public void setMarca (String marca){ 
        this.marca = (marca.equals("")) ? "JanSport" : marca; 
    } 
    public void setEstado (boolean estado){ 
        this.estado = estado; 
    } 
    public void setMaterial (String material){ 
        this.material = (material.equals("")) ? "Poliéster" : material; 
    } 
    public String getColor(){ 
        return color; 
    } 
    public String getMarca(){ 
        return marca; 
    } 
    public boolean getEstado(){ 
        return estado; 
    } 
    public String getMaterial(){ 
        return material; 
    } 
    public String toString(){ 
        return "Color" + getColor() + "/n/r Marca" + getMarca() + "/n/r Estado" + getEstado() + "/n/r Material" + getMaterial(); 
    } 
    // Métodos de comportamiento 
    public void abrir() { 
        if (estado) { 
            estado = true; 
            System.out.println("La mochila ha sido abierta."); 
        } else { 
            System.out.println("La mochila ya está abierta."); 
        } 
    }
    public void cerrar() { 
        if (estado) { 
            estado = false; 
            System.out.println("La mochila ha sido cerrada."); 
        } else { 
            System.out.println("La mochila ya está cerrada."); 
        } 
    } 
    public void guardarObjeto(String objeto) { 
        if (estado) { 
            System.out.println("Se ha guardado el objeto: " + objeto); 
        } else { 
            System.out.println("No se puede guardar el objeto porque la mochila está cerrada."); 
        } 
    } 
    public void sacarObjeto(String objeto) { 
        if (estado) { 
            System.out.println("Se ha sacado el objeto: " + objeto); 
        } else { 
            System.out.println("No se puede sacar el objeto porque la mochila está cerrada."); 
        } 
    }
    // Métodos:  

        Método abrir(): 
            Si la mochila está cerrada (estado false), cambiar su estado a abierto (true) y mostrar un mensaje avisando que la mochila ha sido abierta.  
            Si la mochila ya está abierta, mostrar un mensaje avisando que ya está abierta. 
        Método cerrar():  
            Si la mochila está abierta (estado true), cambiar su estado a cerrado (false) y mostrar un mensaje avisando que la mochila ha sido cerrada.  
            Si la mochila ya está cerrada, mostrar un mensaje avisando que ya está cerrada.  
        Método guardarObjeto(String objeto):  
            Si la mochila está abierta, que permita guardar el objeto en la mochila y se muestre un mensaje con el nombre del objeto.  
            Si la mochila está cerrada, muestra un mensaje diciendo que no se puede guardar el objeto porque la mochila está cerrada.  
        Método sacarObjeto(String objeto):  
            Si la mochila está abierta, permite sacar el objeto y muestra un mensaje con el nombre del objeto.  
            Si la mochila está cerrada, muestra un mensaje diciendo que no se puede sacar el objeto porque la mochila está cerrada.  

public class Main { 
    public static void main(String[] args) { 
        // Crear una instancia de la clase Mochila 
        Mochila miMochila = new Mochila("Rosa", "JanSport", false, "Poliester"); 
        // Mostrar el estado inicial de la mochila 
        System.out.println(miMochila); 
        // Intentar guardar un objeto con la mochila cerrada 
        miMochila.guardarObjeto("Cuaderno"); 
        // Abrir la mochila 
        miMochila.abrir(); 
        // Guardar un objeto con la mochila abierta 
        miMochila.guardarObjeto("Cuaderno"); 
        // Sacar el objeto 
        miMochila.sacarObjeto("Cuaderno"); 
        // Cerrar la mochila 
        miMochila.cerrar(); 
        // Intentar sacar un objeto con la mochila cerrada 
        miMochila.sacarObjeto("Cuaderno"); 
        // Mostrar el estado final de la mochila 
        System.out.println(miMochila); 
        } 
    } 
} 