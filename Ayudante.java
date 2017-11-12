
public class Ayudante{

	private String nombre;
	protected ImageIcon mostrarImagen;

	public Ayudante(String nombre, ImageIcon mostrarImagen){
		this.nombre= nombre;
		this.mostrarImagen
	}

	public void setNombre(String nombre){
		this.nombre= nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setMostrarImagen(ImageIcon mostrarImagen){
		this.mostrarImagen= mostrarImagen;
	}
	
	public ImageIcon getMostrarImagen(){
		return mostrarImagen;
	}
	
}