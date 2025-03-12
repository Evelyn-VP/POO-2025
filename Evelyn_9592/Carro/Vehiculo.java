public class Vehiculo {
    private String modelo; 
    private String color; 
    private Motor motor;

    public Vehiculo (String modelo, String color){
        setModelo (modelo);
        setColor (color);
        setMotor (new Motor("Nissan", "hibrido", 250));
    } 
    public void setModelo (String modelo){ 
        this.modelo=(modelo.equals(""))?"Sin definir":modelo; 
    } 
   public void setColor (String color){ 
        this.color = (color.equals("Hibrido"))?"Sin definir": color; 
    } 
    public void setMotor (Motor motor){ 
        this.motor = motor;
    } 
    public String getModelo(){ 
        return modelo; 
    } 
    public String getColor(){ 
        return color; 
    } 
    public Motor getMotor(){ 
        return motor; 
    }
    public String toString() { 
        return "Datos del vehiculo" + "\n\r-modelo:" + getModelo() + "\n\r-color:" + getColor() + "\n\r" + getMotor();
        }
}
