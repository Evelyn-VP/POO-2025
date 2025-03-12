public class Motor {
    private String marca;
    private String tipo;
    private int hp;

    public Motor(String marca, String tipo, int hp) {
        setMarca(marca);
        setTipo(tipo);
        setHp(hp);
    }

    public void setMarca(String marca) {
            this.marca = (marca.equals(""))?"Sin definir": marca;
        }
    
    public void setTipo(String tipo) {
        this.tipo= (tipo.equals(""))?"Sin definir":tipo;
    }
 
    public void setHp(int hp){
        this.hp = (hp <= 0) ? 0 : hp;
    }
    public String getMarca(){
        return marca;
    }
    public String getTipo(){
        return tipo;
    }
    public int getHp(){
        return hp;
    }
    public String toString() {
        return "Motor \r\n - Marca: " + getMarca() + "\n\r - Tipo: " + getTipo() + "\n\r - HP: " + getHp();
    }
    
}