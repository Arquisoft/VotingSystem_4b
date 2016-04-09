package es.uniovi.asw.dbupdate.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Votante")
public class Votante {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@Column(name="colegio")
	private int codigoColegio;
	@Column(name="nombre")
    private String nombre;
	@Column(name="email")
    private String email;
	@Column(name="dni")
    private String dni;
	@Column(name="contrasena")
    private String contraseña;
	
	public int getCodigoColegio() {
		return codigoColegio;
	}
	public void setCodigoColegio(int codigoColegio) {
		this.codigoColegio = codigoColegio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public Long getId() {
		return id;
	}
	public Votante(int codigoColegio, String nombre, String email, String dni, String contraseña) {
		super();
		this.codigoColegio = codigoColegio;
		this.nombre = nombre;
		this.email = email;
		this.dni = dni;
		this.contraseña = contraseña;
	}
    
    protected Votante(){}
	@Override
	public String toString() {
		return "Votante [codigoColegio=" + codigoColegio + ", nombre=" + nombre + ", email=" + email + ", dni=" + dni
				+ ", contraseña=" + contraseña + "]";
	}
    
    
	

}
