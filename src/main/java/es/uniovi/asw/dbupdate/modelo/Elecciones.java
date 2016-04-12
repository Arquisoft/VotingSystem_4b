package es.uniovi.asw.dbupdate.modelo;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Elecciones {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private String opciones;
    private List<String> partidos;
    
    @OneToMany(mappedBy = "elecciones")
    private Set<Voter> votantes;
    
    @OneToMany(mappedBy = "elecciones")
    private Set<ColegioElectoral> colegiosElectorales;

	public Elecciones(String nombre, Date fechaInicio, Date fechaFin,
			String opciones, List<String> partidos, Set<Voter> votantes,
			Set<ColegioElectoral> colegiosElectorales) {
		super();
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.opciones = opciones;
		this.partidos = partidos;
		this.votantes = votantes;
		this.colegiosElectorales = colegiosElectorales;
	}
	
	protected Elecciones(){
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getOpciones() {
		return opciones;
	}

	public void setOpciones(String opciones) {
		this.opciones = opciones;
	}

	public List<String> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<String> partidos) {
		this.partidos = partidos;
	}

	public Set<Voter> getVotantes() {
		return votantes;
	}

	public void setVotantes(Set<Voter> votantes) {
		this.votantes = votantes;
	}

	public Set<ColegioElectoral> getColegiosElectorales() {
		return colegiosElectorales;
	}

	public void setColegiosElectorales(Set<ColegioElectoral> colegiosElectorales) {
		this.colegiosElectorales = colegiosElectorales;
	}

	@Override
	public String toString() {
		return "Elecciones [nombre=" + nombre + ", fechaInicio=" + fechaInicio
				+ ", fechaFin=" + fechaFin + ", opciones=" + opciones
				+ ", partidos=" + partidos + ", votantes=" + votantes
				+ ", colegiosElectorales=" + colegiosElectorales + "]";
	}
	
	
	

    

    
    
    
    

    
}
