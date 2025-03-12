public class Propietario {
    private String nombre;
    private Vehiculo carro;

    public Propietario(){
        setNombre("Juanito");
        setCarro(new Vehiculo("Nissan","rojo"));

    }
    public void setNombre(String nombre){
        this.nombre=(nombre.equals(""))?"sin definir":nombre;
    }
    public void setCarro(Vehiculo carro){
        this.carro=carro;
    }
    public String getNombre(){
        return nombre;
    }
    public Vehiculo getCarro(){
        return carro;
    }
    public String toString(){
    return "Datos del propietario" + "\n\r-Nombre:" + getNombre() + "\n\r" + getCarro().toString();
    }

    
}
