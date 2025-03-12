public class FiguraGeometrica {
    private String nombre;
    private String color;

    public FiguraGeometrica (String nombre, String color){
        setNombre(nombre);
        setColor(color);
    }
    public String getNombre() {
        return nombre;
    }
    public String getColor() {
        return color;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }
    public void setColor(String color){
        this.color = color;
    }
    public double CalcularPerimetro(){
        return 0;
    }
    public double CalcularArea(){
        return 0;
    }
    public String toString(){
        return "FiguraGeometrica" + "\n\r-nombre:" + getNombre() + "\n\r-color:" + getColor();
    }
}