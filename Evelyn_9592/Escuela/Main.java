public class Main {
    public static void main(String[] args) {

        Universidad universidad = new Universidad("INSTITUTO ITESCAM DE CALKINI");
      
        Profesor profesor1 = new Profesor("Mtro. Juan Perez");
        Profesor profesor2 = new Profesor("Mtra. Maria Lopez");
      
        universidad.agregarProfesor(profesor1);
        universidad.agregarProfesor(profesor2);

        Materia materia1 = new Materia("Matematicas", 2);
        Materia materia2 = new Materia("Artes", 5);
        Materia materia3 = new Materia("Literatura", 4);


        profesor1.agregarMateria(materia1);
        profesor2.agregarMateria(materia2);
        profesor2.agregarMateria(materia3);

        System.out.println(universidad);
    }
}