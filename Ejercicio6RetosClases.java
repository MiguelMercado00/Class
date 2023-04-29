public class Ejercicio6RetosClases {
    public static void main(String[] args) {
        Circulo obj = new Circulo(5);
        System.out.println("El área del círculo es: " + obj.calcularArea(0));
        System.out.println("El perímetro del círculo es: " + obj.calcularPerimetro(0));
    }
}

class Circulo {
    int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public double calcularArea(double area) {

        area = Math.PI * this.radio * this.radio;

        return area;
    }

    public double calcularPerimetro(double perimetro) {

        perimetro = 2 * Math.PI * this.radio;

        return perimetro;
    }

}



//Crea una clase "Circulo" con el atributo "radio".
// Agrega métodos para calcular el área y el perímetro del círculo.