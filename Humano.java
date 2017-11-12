
public class Humano extends Personaje{

	protected Habilidad[] habilidades;

	public Humano(Habilidad[] habilidades){	
		super();
		this.habilidades= new Habilidad[3];		
	}
	
	public void setHabilidades(Habilidad[] habilidades){
		this.habilidades= habilidades;
	}
	
	public Habilidad[] getHabilidades(){
		return habilidades;
	}
	
}