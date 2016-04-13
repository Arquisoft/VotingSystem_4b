package es.uniovi.asw.dbupdate.modelo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Partido {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String nombre;
	private String candidato;
	private String sigla;
	
	@ManyToOne 
	private Elecciones elecciones;
	
	@OneToMany(mappedBy ="partidoPolitico")
	private Set<Voto> votos;
	

	 protected Partido(){
	 }

	public Partido(String nombre, String candidato, String sigla,
			Elecciones elecciones, Set<Voto> votos) {
		super();
		this.nombre = nombre;
		this.candidato = candidato;
		this.sigla = sigla;
		this.elecciones = elecciones;
		this.votos = votos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getCandidato() {
		return candidato;
	}

	public Elecciones getElecciones() {
		return elecciones;
	}

	public Set<Voto> getVotos() {
		return votos;
	}

	@Override
	public String toString() {
		return "Partido [nombre=" + nombre + ", candidato="
				+ candidato + ", sigla=" + sigla + ", elecciones=" + elecciones
				+ ", votos=" + votos + "]";
	}
	 
	 
	 
	

}
