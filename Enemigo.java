
public class Enemigo extends Personaje{

	protected boolean enemigoDerrotado;
	protected int numEnemigosDerrotados;

	public Enemigo (boolean enemigoDerrotado, int numEnemigosDerrotados){
		super();
		this.enemigoDerrotado= enemigoDerrotado;
		this.numEnemigosDerrotados= numEnemigosDerrotados;		
	}
	
	public void isEnemigoDerrotado(boolean enemigoDerrotado){
		this.enemigoDerrotado= enemigoDerrotado;
	}
	
	public boolean isEnemigoDerrotado(){
		return enemigoDerrotado;
	
	public void setNumEnemigosDerrotados(int numEnemigosDerrotados){
		this.numEnemigosDerrotados= numEnemigosDerrotados;
	}
	
	public int getNumEnemigosDerrotados(){
		return numEnemigosDerrotados;
		
}