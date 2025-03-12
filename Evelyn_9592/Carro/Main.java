public class Main {
    public static void main(String[]args){
        Propietario Juanito=new Propietario();
        Vehiculo Carro=new Vehiculo("nissan gtr", "rojo");


        Juanito.setCarro(Carro);
        Juanito.getCarro();

        System.out.println(Juanito.toString());


        Propietario Toñito=new Propietario();
        Vehiculo Carro2=new Vehiculo("Audi", "Amarillo");
        Motor Motor2=new Motor("Audi", "Hibrido", 240);

        Toñito.setCarro(Carro2);
        Toñito.getCarro().setMotor(Motor2);

        System.out.println(Toñito.toString());

        
        Propietario Alfonso=new Propietario();
        Vehiculo Carro3=new Vehiculo("Tesla", "rosa");
        Motor Motor3=new Motor("Tesla", "Electrico", 250);

        Alfonso.setCarro(Carro3);
        Alfonso.getCarro().setMotor(Motor3);

        System.out.println(Alfonso.toString());
        
        Propietario p1 = new Propietario();
        Propietario p2 = new Propietario();
        Propietario p3 = new Propietario();
        Propietario p4 = new Propietario();
        p1.setNombre("Pancho Villa");
        p2.setNombre("Emiliano Zapata");
        p3.setNombre("Chino todo poderoso");
        p4.setNombre("El chavo del 8");

        Vehiculo v1 = new Vehiculo("Civic", "Gris");
        Motor m1 = new Motor("Honda", "Hibrido", 200);
            v1.setMotor(m1);
            p1.setCarro(v1);
            System.out.println(p1);
        Vehiculo v2 = new Vehiculo("Corolla", "Blanco");
        Motor m2 = new Motor("Toyota", "Hibrido", 180);
            v2.setMotor(m2);
            p2.setCarro(v2);
            System.out.println(p2);
        Vehiculo v3 = new Vehiculo("Toyota", "Negro");
        Motor m3 = new Motor("Toyota", "Electrico", 220);
            v3.setMotor(m3);
            p3.setCarro(v3);
            System.out.println(p3);
        Vehiculo v4 = new Vehiculo("Mustang", "Azul");
        Motor m4 = new Motor("Ford", "Gasolina", 300);
        v4.setMotor(m4);
        p4.setCarro(v4);
        System.out.println(p4);
    }
}