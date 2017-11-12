public class Pregunta
{
	protected String respuestas;
	protected String pregunta;
	protected ImageIcon mostrarImagen;
	
	public Pregunta(String respuestas, String pregunta, ImageIcon mostrarImagen)
	{
		this.respuestas=respuestas;
		this.pregunta=pregunta;
		this.mostrarImagen=mostrarImagen;
	}
	
	public void setRespuestas(String respuestas)
	{
		this.respuestas = respuestas;
	}

	public String getRespuestas()
	{
		return respuestas;
	}
	
	public void setPregunta(String pregunta)
	{
		this.pregunta = pregunta;
	}

	public String getPregunta()
	{
		return pregunta;
	}
	
	public void setMostrarImagen(ImageIcon mostrarImagen)
	{
		this.mostrarImagen= mostrarImagen;
	}
	
	public ImageIcon getMostrarImagen()
	{
		return mostrarImagen;
	}
}