package es.uniovi.asw.dbupdate.modelo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import cucumber.api.java.it.Date;

@Entity
@Table(name = "Elecciones")
public class Elecciones {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private OpcionesDeVoto opciones;
    private Set<Voto> votantes;
    private Set<ColegioElectoral> colegiosElectorales;
    private Set<PartidosPoliticos> partidos;
    
    
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
	public OpcionesDeVoto getOpciones() {
		return opciones;
	}
	public void setOpciones(OpcionesDeVoto opciones) {
		this.opciones = opciones;
	}
	public Set<Voto> getVotantes() {
		return votantes;
	}
	public void setVotantes(Set<Voto> votantes) {
		this.votantes = votantes;
	}
	public Set<ColegioElectoral> getColegiosElectorales() {
		return colegiosElectorales;
	}
	public void setColegiosElectorales(Set<ColegioElectoral> colegiosElectorales) {
		this.colegiosElectorales = colegiosElectorales;
	}
	public Set<PartidosPoliticos> getPartidos() {
		return partidos;
	}
	public void setPartidos(Set<PartidosPoliticos> partidos) {
		this.partidos = partidos;
	}
	public Long getId() {
		return id;
	}
	public Elecciones(String nombre, Date fechaInicio, Date fechaFin, OpcionesDeVoto opciones, Set<Voto> votantes,
			Set<ColegioElectoral> colegiosElectorales, Set<PartidosPoliticos> partidos) {
		super();
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.opciones = opciones;
		this.votantes = votantes;
		this.colegiosElectorales = colegiosElectorales;
		this.partidos = partidos;
	}
	@Override
	public String toString() {
		return "Elecciones [nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ ", opciones=" + opciones + ", votantes=" + votantes + ", colegiosElectorales=" + colegiosElectorales
				+ ", partidos=" + partidos + "]";
	}
    
    
    
}
