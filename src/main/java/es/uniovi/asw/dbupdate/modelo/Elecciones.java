package es.uniovi.asw.dbupdate.modelo;

import java.util.Date;
import java.util.HashSet;
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
    
    @OneToMany(mappedBy ="elecciones")
    private Set<Partido> partidosPoliticos;
    
    @OneToMany(mappedBy = "elecciones")
    private Set<Voter> votantes = new HashSet<Voter>();
    
    @OneToMany(mappedBy = "elecciones")
    private Set<ColegioElectoral> colegiosElectorales=new HashSet<ColegioElectoral>(); 

	public Elecciones(String nombre, Date fechaInicio, Date fechaFin,
			String opciones, Set<Voter> votantes,
			Set<ColegioElectoral> colegiosElectorales) {
		super();
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.opciones = opciones;
		//this.partidos = partidos;
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


	public Set<Voter> getVotantes() {
		return votantes;
	}


	public Set<ColegioElectoral> getColegiosElectorales() {
		return colegiosElectorales;
	}


	@Override
	public String toString() {
		return "Elecciones [nombre=" + nombre + ", fechaInicio=" + fechaInicio
				+ ", fechaFin=" + fechaFin + ", opciones=" + opciones
				+  ", votantes=" + votantes
				+ ", colegiosElectorales=" + colegiosElectorales + "]";
	}
	
	
	

    

    
    
    
    

    
}
