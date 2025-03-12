public class Toper {
    private String color;
    private String marca;
    private boolean estado; //true: Abierto, false: Cerrado;
    private String material; 

    public Toper (String color, String marca, boolean estado, String material){
        setColor(color);
        setMarca(marca);
        setEstado(estado);
        setMaterial (material);
    }
    public String getColor(){
        return color;
    }
    public void setColor (String color){
        this.color = (color.equals("")) ? "Negro" : color;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca (String marca){
        this.marca = (marca.equals("")) ? "top Chace" : marca;
    }
    public boolean getEstado(){
        return estado;
    }
    public void setEstado (boolean estado){
        this.estado = (estado) ? true : false;
    }
    public String getMaterial(){
        return material;
    }
    public void setMaterial (String material){
        this.material = (material.equals("")) ? "Plastico" : material;
    }   
    public String toString(){
        return "Color" + getColor() + "/n/r Marca" + getMarca() + "/n/r Estado" + getEstado() + "/n/r Material" + getMaterial();
    }
}