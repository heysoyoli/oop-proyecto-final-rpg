public class Casilla extends Mapa{

  protected Objeto[] objetos;
  protected Personaje[] personajes;

  public Casilla(Objeto[] objetos, Personaje[] personajes){
    super();
    this.objetos =  new Objeto[];
    this.personajes = new Personaje[];
  }


  public void setObjetos(Objeto[] objetos){
    this.objetos = objetos;
  }

  public Objeto[] getObjetos(){
    return objetos;
  }

  public void setPersonajes(Personaje[] personajes){
    this.personajes = personajes;
  }

  public Personaje[] getPersonajes(){
    return personajes;
  }

}
