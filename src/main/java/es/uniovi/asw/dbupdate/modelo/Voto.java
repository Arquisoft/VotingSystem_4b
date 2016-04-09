package es.uniovi.asw.dbupdate.modelo;

import javax.persistence.Column;
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
	@Column(name="colegio")
	private int codigoColegio;
	@Column(name="partido")
    private String partido;
	@Column(name="contabilizado")
    private boolean contabilizado;
    
    
	public int getColegio() {
		return codigoColegio;
	}
	public void setColegio(int colegio) {
		this.codigoColegio = colegio;
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
	
	protected Voto(){}
	
	public Voto(int colegio, String partido, boolean contabilizado) {
		super();
		this.codigoColegio = colegio;
		this.partido = partido;
		this.contabilizado = contabilizado;
	}
	@Override
	public String toString() {
		return "Voto [colegio=" + codigoColegio + ", partido=" + partido + ", contabilizado=" + contabilizado + "]";
	}
    
    
    

}
