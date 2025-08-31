package org.ejercicio.banco;

public class CuentaBancaria {
    private final String numero;
    private double saldo;
    private final Cliente dueno;

    public CuentaBancaria(String numero, Cliente dueno, double saldoInicial) {
        this.numero = numero;
        this.dueno = dueno;
        this.saldo = saldoInicial;
    }

    public String getNumero() { return numero; }
    public double getSaldo() { return saldo; }
    public Cliente getDueno() { return dueno; }

    public void depositar(double monto) {
        if (monto <= 0) throw new IllegalArgumentException("Monto debe ser positivo");
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= 0) throw new IllegalArgumentException("Monto debe ser positivo");
        if (monto > saldo) throw new IllegalArgumentException("Fondos insuficientes");
        saldo -= monto;
    }

    public void transferir(CuentaBancaria destino, double monto) {
        if (destino == null) throw new IllegalArgumentException("Cuenta destino inválida");
        this.retirar(monto);
        destino.depositar(monto);
    }

    @Override
    public String toString() {
        return "Cuenta{numero='" + numero + "', saldo=" + saldo + ", dueno=" + dueno.getNombre() + "}";
    }
}
