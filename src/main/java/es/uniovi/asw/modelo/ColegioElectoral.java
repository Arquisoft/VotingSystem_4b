package es.uniovi.asw.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ColegioElectoral")
public class ColegioElectoral {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private int codigoColegio;
    private String tipo;
    private String circunscripcion;
    private String comunidadAutonoma;
    
    public Long getId() {
		return id;
	}
	public int getCodigoColegio() {
		return codigoColegio;
	}
	public void setCodigoColegio(int codigoColegio) {
		this.codigoColegio = codigoColegio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCircunscripcion() {
		return circunscripcion;
	}
	public void setCircunscripcion(String circunscripcion) {
		this.circunscripcion = circunscripcion;
	}
	public String getComunidadAutonoma() {
		return comunidadAutonoma;
	}
	public void setComunidadAutonoma(String comunidadAutonoma) {
		this.comunidadAutonoma = comunidadAutonoma;
	}
	
	protected ColegioElectoral() {}
	public ColegioElectoral(int codigoColegio, String tipo, String circunscripcion, String comunidadAutonoma) {
		super();
		this.codigoColegio = codigoColegio;
		this.tipo = tipo;
		this.circunscripcion = circunscripcion;
		this.comunidadAutonoma = comunidadAutonoma;
	}
	@Override
	public String toString() {
		return "ColegioElectoral [codigoColegio=" + codigoColegio + ", tipo=" + tipo + ", circunscripcion="
				+ circunscripcion + ", comunidadAutonoma=" + comunidadAutonoma + "]";
	}
 
   
}
