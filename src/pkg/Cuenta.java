package pkg;

public class Cuenta {

		String numero;
		String titular;
		Double saldo;
	
		//Constructor
		public Cuenta(double saldo, String numero) {
			this.saldo=saldo;
			this.numero=numero;
		}
		
		
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
		
		
		public void ingresar(Double i) {
			saldo +=i ;			
		}
		
		public void retirar(double cantidad) {
		    if (saldo - cantidad >= -500)
		        saldo -= cantidad;
		    else
		        System.out.println("Fondos insuficientes (saldo " + saldo + "€) en la cuenta " + numero + " para el retiro de " + cantidad);
		}
}
