package org.ejercicio.banco;

public class Main {
    public static void main(String[] args) {
        Cliente a = new Cliente("C001", "Ana");
        Cliente b = new Cliente("C002", "Bruno");

        CuentaBancaria ca = new CuentaBancaria("A-1001", a, 1500.0);
        CuentaBancaria cb = new CuentaBancaria("B-2001", b, 800.0);

        System.out.println("== Estado inicial ==");
        System.out.println(ca);
        System.out.println(cb);

        ca.depositar(250.0);
        cb.retirar(100.0);
        ca.transferir(cb, 300.0);

        System.out.println("\n== Estado final ==");
        System.out.println(ca);
        System.out.println(cb);
    }
}
