public class MochilaHeroe{

  private ArmaHeroe armaHeroe;
  private ItemHeroe itemHeroe;
  private ImageIcon mostrarImagen;
  
  public MochilaHeroe (ArmaHeroe armaHeroe, ItemHeroe itemHeroe, ImageIcon mostrarImagen)
	{
		this.armaHeroe=armaHeroe;
		this.itemHeroe=itemHeroe;
		this.mostrarImagen=mostrarImagen
	}
  
  

  public void setArmaHeroe(ArmaHeroe armaHeroe){
    this.armaHeroe = armaHeroe;
  }

  public ArmaHeroe getArmaHeroe(){
    return armaHeroe;
  }

  public void setItemHeroe(ItemHeroe itemHeroe){
    this.itemHeroe = itemHeroe;
  }

  public ItemHeroe getItemHeroe(){
    return itemHeroe;
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