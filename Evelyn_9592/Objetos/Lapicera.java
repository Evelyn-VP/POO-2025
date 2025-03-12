public class Lapicera {
    private String color;
    private String marca;
    private boolean estado; //true: Abierto, false: Cerrado;
    private String material;

    public Lapicera (String color, String marca, boolean estado, String material){
        setColor(color);
        setMarca(marca);
        setEstado(estado);
        setMaterial (material);
    } 

    public void setColor (String color){
        this.color = (color.equals("")) ? "Rosa/Transparente" : color;
    }
    public void setMarca (String marca){
        this.marca = (marca.equals("")) ? "Beauty" : marca;
    }
    public void setEstado (boolean estado){
        this.estado = (estado) ? true : false;
    }
    public void setMaterial (String material){
        this.material = (material.equals("")) ? "Plástico" : material;
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
}