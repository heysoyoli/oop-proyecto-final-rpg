
public class Personaje{

	protected String nombre;
	protected int vida;
	protected int puntosAtaque;
	protected int ptsExp;
	protected ImageIcon mostrarImagen;
	
	public Personaje (String nombre, int vida, int puntosAtaque, int ptsExp, 
		ImageIcon mostrarImagen){
		
		this.nombre= nombre;
		this.vida= vida;
		this.puntosAtaque= puntosAtaque;
		this.ptsExp= ptsExp;
		this.mostrarImagen= mostrarImagen;
	}
	
	public void setNombre(String nombre){
		this.nombre= nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setVida(int vida){
		this.vida= vida;
	}
	
	public int getVida(){
		return vida;
	}
	
	public void setPuntosAtaque(int puntosAtaque){
		this.puntosAtaque= puntosAtaque;
	}
	
	public int getPuntosAtaque(){
		return puntosAtaque;
	}
	
	public void setPtsExp(int ptsExp){
		this.ptsExp= ptsExp;
	}
	
	public int getPtsExp(){
		return ptsExp;
	}
	
	public void setMostrarImagen(ImageIcon mostrarImagen){
		this.mostrarImagen= mostrarImagen;
	}
	
	public ImageIcon getMostrarImagen(){
		return mostrarImagen;
	}

}