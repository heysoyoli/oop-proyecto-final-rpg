public class Habilidad
{
	protected int respuestaJugador;
	protected int gainPuntosAtaque;
	protected PoolPreguntas poolPreguntas;
	protected ImajeIcon mostrarImagen;
	
	public Habilidad(int respuestaJugador, int gainPuntosAtaque, PoolPreguntas poolPreguntas, ImageIcon mostrarImagen)
	{
		this.respuestaJugador=respuestaJugador;
		this.gainPuntosAtaque=gainPuntosAtaque;
		this.poolPreguntas=poolPreguntas;
		this.mostrarImagen=mostrarImagen;
	}
	
	public int getRespuestaJugador()
	{
		return respuestaJugador;
	}
	
	public void setRespuestaJugador(int respuestaJugador)
	{
		this.respuestaJugador=respuestaJugador;
	}
	
	public int getGainPuntosAtaque()
	{
		return gainPuntosAtaque;
	}
	
	public void setGainPuntosAtaque(int gainPuntosAtaque)
	{
		this.gainPuntosAtaque=gainPuntosAtaque;
	}
	
	public PoolPreguntas getPoolPreguntas()
	{
		return poolPreguntas;
	}
	
	public void setPoolPreguntas(PoolPreguntas poolPreguntas)
	{
		this.poolPreguntas=poolPreguntas;
	}
	
	public void setMostrarImagen(ImageIcon mostrarImagen){
		this.mostrarImagen= mostrarImagen;
	}
	
	public ImageIcon getMostrarImagen(){
		return mostrarImagen;
	}
	
	
}