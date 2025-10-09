package pkg;

public class Movimiento {

	double importe;
    public enum Signo {
        D, // Débito
        H  // Haber
    }
    Signo signo;
    String detalle;
	
    //Getter and setter
    
    public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public Signo getSigno() {
		return signo;
	}
	public void setSigno(Signo signo) {
		this.signo = signo;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
    
	
    
	
	
}
