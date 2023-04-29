public class Ejercicio4RetosClases {
    public static void main(String[] args) {
        Person obj = new Person("Miguel", 17, "Masculino");
        Person obj2 = new Person("Juan", 22, "Masculino");
        Person obj3 = new Person("Pedro", 19, "Masculino");
        Person obj4 = new Person("Maria", 25, "Femenino");
        Person obj5 = new Person("Luisa", 43, "Femenino");

        obj.ImprimirDatos();
        obj2.ImprimirDatos();
        obj3.ImprimirDatos();
        obj4.ImprimirDatos();
        obj5.ImprimirDatos();

    }
}
class Person {
    String nombre;
    int edad;
    String sexo;

    public Person(String nom, int ed, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;

    }

    public void ImprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println();
    }


}


//Crea una clase "Persona" con los atributos "nombre", "edad" y "sexo".
// Agrega métodos para imprimir los datos de la persona.

