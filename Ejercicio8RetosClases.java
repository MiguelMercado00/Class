public class Ejercicio8RetosClases {
    public static void main(String[] args) {
        Libro obj = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 120000);
        obj.ImprimirDatos();
        System.out.println("El precio con descuento del libro es: " + obj.Descuento(40000));




    }
}
class Libro {
    String titulo;
    String autor;
    int precio;

    public Libro(String titulo, String autor, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;

    }


    public void ImprimirDatos() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: " + precio);
        System.out.println();
    }

    public int Descuento(int precioDescuento) {

        this.precio = this.precio - precioDescuento;

        return this.precio;
    }
}




//Crea una clase "Libro" con los atributos "título", "autor" y "precio". 
// Agrega métodos para imprimir los datos del libro y para aplicar un descuento al precio.