package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

    private String numero;
    private String titular;
    private Double saldo;
    private List<Movimiento> mMovimientos;

    // Constructor
    public Cuenta(double saldo, String numero) {
        this.saldo = saldo;
        this.numero = numero;
        this.mMovimientos = new ArrayList<>();
    }

    // Getters y Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public List<Movimiento> getMovimientos() {
        return mMovimientos;
    }

    // Métodos de negocio
    public void ingresar(Double importe) {
        saldo += importe;
        mMovimientos.add(new Movimiento(importe, Movimiento.Signo.H, "Ingreso de " + importe + "€"));
    }

    public void retirar(double cantidad) {
        if (saldo - cantidad >= -500) {
            saldo -= cantidad;
            mMovimientos.add(new Movimiento(cantidad, Movimiento.Signo.D, "Reintegro de " + cantidad + "€"));
        } else {
            System.out.println("Fondos insuficientes (saldo " + saldo + "€) en la cuenta " + numero + " para el retiro de " + cantidad);
        }
    }
}

