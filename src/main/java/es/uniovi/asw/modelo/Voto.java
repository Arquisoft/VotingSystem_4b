package es.uniovi.asw.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Voto")
public class Voto {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private ColegioElectoral colegio;
    private String partido;
    private boolean contabilizado;
    
	public ColegioElectoral getColegio() {
		return colegio;
	}
	public void setColegio(ColegioElectoral colegio) {
		this.colegio = colegio;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public boolean isContabilizado() {
		return contabilizado;
	}
	public void setContabilizado(boolean contabilizado) {
		this.contabilizado = contabilizado;
	}
	public Long getId() {
		return id;
	}
	public Voto(ColegioElectoral colegio, String partido, boolean contabilizado) {
		super();
		this.colegio = colegio;
		this.partido = partido;
		this.contabilizado = contabilizado;
	}
	@Override
	public String toString() {
		return "Voto [colegio=" + colegio + ", partido=" + partido + ", contabilizado=" + contabilizado + "]";
	}
    
    
    

}
