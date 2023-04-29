public class Ejercicio3RetosClases {
    public static void main(String[] args) {
        Estudiante obj = new Estudiante("Miguel", 3.0);
        Estudiante obj2 = new Estudiante("Juan", 4.0);
        Estudiante obj3 = new Estudiante("Pedro", 5.0);
        Estudiante obj4 = new Estudiante("Maria", 4.0);
        Estudiante obj5 = new Estudiante("Luisa", 3.0);
        double promedio = (obj.ObtenerProm() + obj2.ObtenerProm() + obj3.ObtenerProm() + obj4.ObtenerProm() + obj5.ObtenerProm()) / 5;
        System.out.println("Los estudiantes " + obj.nombre + ", " + obj2.nombre + ", " + obj3.nombre + ", " + obj4.nombre + " y " + obj5.nombre + " tienen un promedio de: " + promedio);
    }
}
class Estudiante {
    String nombre;
    Double nota;
    
    public Estudiante(String nombre, Double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public double ObtenerProm() {
        return nota;
    }
    

}
