package pkg;

public class Movimiento {
	 public enum Signo { D, H }

	    private Double importe;
	    private Signo signo;
	    private String detalle;

	    // Constructor
	    public Movimiento(Double importe, Signo signo, String detalle) {
	        this.importe = importe;
	        this.signo = signo;
	        this.detalle = detalle;
	    }

	    // Getters y Setters
	    public Double getImporte() {
	        return importe;
	    }

	    public void setImporte(Double importe) {
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

	    @Override
	    public String toString() {
	        return "Movimiento [importe=" + importe + ", signo=" + signo + ", detalle=" + detalle + "]";
	    }
}
