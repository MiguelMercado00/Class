public class Ejercicio2RetosClases {
    public static void main(String[] args) {
        Rectangulo obj = new Rectangulo(5, 7);
        System.out.println("El largo del rectangulo es: " + obj.largo);
        System.out.println("El ancho del rectangulo es: " + obj.ancho);
        System.out.println("El área del rectangulo es: " + obj.Area(0));
        System.out.println("El perímetro del rectangulo es: " + obj.Perimetro(0));
    }
}

class Rectangulo {
    int largo;
    int ancho;
    
    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

public double Area(double area) {
    
        area = this.largo * this.ancho;
    
        return area;
        }

public double Perimetro(double perimetro) {
    
        perimetro = this.largo * 2 + this.ancho * 2;
    
        return perimetro;
        }
    
    }
