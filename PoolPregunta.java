public class PoolPregunta
{
	private PreguntaConceptual[] preguntaConceptual;
	private PreguntaCorreccion[] preguntaCorreccion;
	private PreguntaEscritura[] preguntaEscritura;
	
	public PoolPreguntas(PreguntaConceptual[] preguntaConceptual, PreguntaCorreccion[] preguntaCorreccion, preguntaEscritura[] preguntaEscritura)
	{
		this.preguntaConceptual=new PreguntaConceptual[];
		this.preguntaCorreccion=new PreguntaCorreccion[];
		this.preguntaEscritura=new PreguntaEscritura[];	
	}
	
	
	public void setPreguntaConceptual(PreguntaConceptual[] preguntaConceptual)
	{
		this.preguntaConceptual = preguntaConceptual;
	}

	public PreguntaConceptual[] getPreguntaConceptual()
	{
		return preguntaConceptual;
	}
	
	public void setPreguntaCorreccion(PreguntaCorreccion[] preguntaCorreccion)
	{
		this.preguntaCorreccion = preguntaCorreccion;
	}

	public PreguntaCorreccion[] getPreguntaCorreccion()
	{
		return preguntaCorreccion;
	}
	
	public void setPreguntaEscritura(PreguntaEscritura[] preguntaEscritura)
	{
		this.preguntaEscritura = preguntaEscritura;
	}

	public PreguntaEscritura[] getPreguntaEscritura()
	{
		return preguntaEscritura;
	}
  
  
}