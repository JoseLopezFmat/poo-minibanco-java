package org.ejercicio.banco;

public class Main {
    public static void main(String[] args) {
     Cliente cliente1 = new Cliente("Luis Gomez", 25672946);
     CuentaBancaria cuenta1 = new CuentaBancaria(6831531,cliente1,10000);
    
    Cliente cliente2 = new Cliente("Jose Luis",333);
    
    CuentaBancaria   cuenta2 = new CuentaBancaria(123,new Cliente("Juan Perez",234),1200);

     // Cliente cliente3 = new Cliente("Luis Dominguez", 567);
    
     
    }
}
