
public class Heroina extends Humano{

	protected MochilaHeroina[] mochilaHeroina;
	
	public Heroina (MochilaHeroina[] mochilaHeroina){
		super();
		this.mochilaHeroina= new MochilaHeroina[4];		
	}
	
	public void setMochilaHeroina(MochilaHeroina[] habilidades){
		this.mochilaHeroina= mochilaHeroina;
	}
	
	public MochilaMochilaHeroina[] getMochilaHeroina(){
		return mochilaHeroina;
	}

}