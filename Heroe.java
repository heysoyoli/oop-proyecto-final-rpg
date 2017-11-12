public class Heroe extends Humano
{
	private MochilaHeroe[] mochilaHeroes;
	
	public Heroe (MochilaHeroe[] mochilaHeroe)
	{
	super();
	this.mochilaHeroe = new mochilaHeroe[4];
	}
	
	
	public void setMochilaHeroe(MochilaHeroe[] mochilaHeroe){
		this.mochilaHeroe= mochilaHeroe;
	}
	
	public MochilaHeroe[] getMochilaHeroe(){
		return mochilaHeroe;
	}

}