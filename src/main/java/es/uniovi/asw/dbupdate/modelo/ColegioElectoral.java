package es.uniovi.asw.dbupdate.modelo;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


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
    
    @OneToMany(mappedBy = "colegio")
    private Set<Voto> votos = new HashSet<Voto>();
  
    protected ColegioElectoral() {}
	
	
    
    public ColegioElectoral( int codigoColegio, String circunscripcion,
			String comunidadAutonoma) {
		super();
		this.codigoColegio = codigoColegio;
		this.circunscripcion = circunscripcion;
		this.comunidadAutonoma = comunidadAutonoma;
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
	
	public Elecciones getElecciones() {
		return elecciones;
	}

	public Set<Voto> getVotos() {
		return votos;
	}



	@Override
	public String toString() {
		return "ColegioElectoral [codigoColegio=" + codigoColegio
				+ ", circunscripcion=" + circunscripcion
				+ ", comunidadAutonoma=" + comunidadAutonoma + ", elecciones="
				+ elecciones + ", votos=" + votos + "]";
	}




 
   
}
