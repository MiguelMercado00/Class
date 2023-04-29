public class Ejercicio7RetosClases {
    public static void main(String[] args) {
        Empleado obj = new Empleado("Miguel Mercado", "Gerente", 8000000);
        int salarioAnual = obj.calcularSalarioAnual() * 12;
        System.out.println("El salario anual del empleado es: " + salarioAnual);
    }
}
class Empleado {
    String nombre;
    String puesto;
    int salario;

    public Empleado(String nombre, String puesto, int salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;

    }

    public int calcularSalarioAnual() {
        return salario;
    }


}


// Crea una clase "Empleado" con los atributos "nombre", "puesto" y "salario".
// Agrega métodos para calcular el salario anual del empleado.