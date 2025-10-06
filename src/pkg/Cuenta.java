package pkg;

public class Cuenta {

		public Cuenta(Double i) {
		// TODO Auto-generated constructor stub
	}
		String numero;
		String titular;
		Double saldo;
		public void ingresar(Double i) {
			saldo = 200.0;			
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
		public void retirar(Double i) {
			saldo = -200.0;
			
		}
}
