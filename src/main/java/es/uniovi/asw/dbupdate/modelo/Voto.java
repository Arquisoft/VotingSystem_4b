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
    
    @ManyToOne
    private Partido partidoPolitico;
    
    @ManyToOne
    private ColegioElectoral colegio;
    
    protected Voto(){}
    
    
    
	public Voto(ColegioElectoral colegio, Partido partido,
			boolean contabilizado) {
		super();
		this.colegio = colegio;
		this.partidoPolitico = partido;
		this.contabilizado = contabilizado;
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
		return "Voto [partido=" + partidoPolitico + ", contabilizado=" + contabilizado
				+ ", colegio=" + colegio + "]";
	}




	
	

    
    

}
