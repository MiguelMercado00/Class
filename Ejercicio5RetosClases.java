public class Ejercicio5RetosClases {
    public static void main(String[] args) {
        Coche obj = new Coche("Toyota", "Hilux", 120.0);
        System.out.println("El carro disminuye la velocidad a: " + obj.Frenar(40));
        System.out.println("El carro aumenta de velocidad a: " + obj.Acelerar(70));
    }
}
class Coche {
    String marca;
    String modelo;
    Double velocidad;

    public Coche(String marca, String modelo, Double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;

    }

    public Double Acelerar(int aumentoDeV) {

        this.velocidad = this.velocidad + aumentoDeV;

        return this.velocidad;
    }

    public Double Frenar(int disminucionDeV) {

        this.velocidad = this.velocidad - disminucionDeV;

        return this.velocidad;
    }

}



//Crea una clase "Coche" con los atributos "marca", "modelo" y "velocidad".
// Agrega métodos para acelerar y frenar el coche.