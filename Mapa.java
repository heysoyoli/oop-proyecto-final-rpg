public class Mapa{

  protected Casilla[25] casillas;
  protected ImageIcon mostrarImagen;

  public Mapa(Casilla[] casillas, ImageIcon mostrarImagen){
    this.casillas = new Casilla[25];
    this.mostrarImagen = mostrarImagen;
  }

  public void setCasillas(Casilla[25] casillas ) {
    this.casillas = casillas;
  }

  public Casilla[25] getCasillas(){
    return casillas;
  }

  public void setMostrarImagen(ImageIcon mostrarImagen){
		this.mostrarImagen= mostrarImagen;
	}

  public ImageIcon getMostrarImagen(){
		return mostrarImagen;
	}


}
