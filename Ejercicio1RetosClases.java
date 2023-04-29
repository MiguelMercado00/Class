public class Ejercicio1RetosClases {
    public static void main(String[] args) {
        CuentaBancaria obj = new CuentaBancaria("Miguel Angel", 1200000);
        System.out.println("El titular: " + obj.titular);
        System.out.println("Tiene de saldo: " + obj.saldo);
        System.out.println("Retira dinero de la cuenta bancaria y le quedan: " + obj.Retirar(550000));
        System.out.println("Deposita dinero en la cuenta bancaria y le quedan: " + obj.Depositar(700000));
    }
}
class CuentaBancaria {
    String titular;
    int saldo;
    
    public CuentaBancaria(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

public int Depositar(int cantidaddep) {

    this.saldo = this.saldo + cantidaddep;
   
    return this.saldo;
    }

public int Retirar(int cantidadret) {

    this.saldo = this.saldo - cantidadret;

    return this.saldo;
    }

}



