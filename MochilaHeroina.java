public class MochilaHeroina{

  protected ArmaHeroina armaHeroina;
  protected ItemHeorina itemHeroina;
  protected ImageIcon mostrarImagen;

  public MochilaHeroina(ArmaHeroina armaHeroina, ItemHeroina itemHeroina, ImageIcon mostrarImagen){
    this.armaHeroina = armaHeroina;
    this.itemHeroina = itemHeroina;
    this.mostrarImagen = mostrarImagen;
  }

  public void setArmaHeroina(ArmaHeorina armaHeorina){
    this.armaHeorina = armaHeorina;
  }

  public ArmaHeorina getArmaHeroina(){
    return armaHeorina;
  }

  public void setItemHeroina(ItemHeroina itemHeroina){
    this.itemHeroina = itemHeroina;
  }

  public ItemHeroina getItemHeroina(){
    return itemHeroina;
  }

  public void setMostrarImagen(ImageIcon mostrarImagen){
		this.mostrarImagen= mostrarImagen;
	}

	public ImageIcon getMostrarImagen(){
		return mostrarImagen;
	}
}
