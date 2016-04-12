package es.uniovi.asw.dbupdate.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity

public class ColegioElectoral {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private int codigoColegio;
    private String circunscripcion;
    private String comunidadAutonoma;
    @ManyToOne 
    private Elecciones elecciones;
   
    protected ColegioElectoral() {}
	
	
    
    public ColegioElectoral( int codigoColegio, String circunscripcion,
			String comunidadAutonoma, Elecciones elecciones) {
		super();
		this.codigoColegio = codigoColegio;
		this.circunscripcion = circunscripcion;
		this.comunidadAutonoma = comunidadAutonoma;
		this.elecciones = elecciones;
	}



	public Long getId() {
		return id;
	}
	public int getCodigoColegio() {
		return codigoColegio;
	}
	public void setCodigoColegio(int codigoColegio) {
		this.codigoColegio = codigoColegio;
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
	

	
	@Override
	public String toString() {
		return "ColegioElectoral [codigoColegio=" + codigoColegio + ", circunscripcion="
				+ circunscripcion + ", comunidadAutonoma=" + comunidadAutonoma + "]";
	}
 
   
}
