public class Arma extends Objeto{

  protected int expMinima;
  protected int gainPuntosAtaque;

  public Arma (int expMinima, int gainPuntosAtaque){
    super();
    this.expMinima = expMinima;
    this.gainPuntosAtaque = gainPuntosAtaque;
  }
  public void setExpMinima (int expMinima){
    this.expMinima = expMinima;
  }

  public int getExpMinima (){
    return expMinima;
  }

  public void setGainPuntosAtaque (int gainPuntosAtaque){
    this.gainPuntosAtaque = gainPuntosAtaque;
  }

  public int getGainPuntosAtaque (){
    return gainPuntosAtaque;
  }


}
