package es.uniovi.asw.dbupdate.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity

public class Voto {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private boolean contabilizado;
    
    private boolean nulo;
    private boolean blanco;
    
    @ManyToOne
    private Partido partidoPolitico;
    
    @ManyToOne
    private ColegioElectoral colegio;
    
    protected Voto(){}
    
    
    
	public Voto(ColegioElectoral colegio, Partido partido,
			boolean contabilizado, boolean nulo, boolean blanco) {
		super();
		this.colegio = colegio;
		this.partidoPolitico = partido;
		this.contabilizado = contabilizado;
		this.nulo=nulo;
		this.blanco=blanco;
	}

	
	
	
	public boolean isNulo() {
		return nulo;
	}



	public void setNulo(boolean nulo) {
		this.nulo = nulo;
	}



	public boolean isBlanco() {
		return blanco;
	}



	public void setBlanco(boolean blanco) {
		this.blanco = blanco;
	}



	public ColegioElectoral getColegio() {
		return colegio;
	} 


	public Partido getPartido() {
		return partidoPolitico;
	}


	public boolean isContabilizado() {
		return contabilizado;
	}

	public void setContabilizado(boolean contabilizado) {
		this.contabilizado = contabilizado;
	}



	@Override
	public String toString() {
		return "Voto [contabilizado=" + contabilizado + ", nulo=" + nulo
				+ ", blanco=" + blanco + ", partidoPolitico=" + partidoPolitico
				+ ", colegio=" + colegio + "]";
	}



	



	
	

    
    

}
