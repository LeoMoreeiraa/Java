public class Peixe extends Animal{
  String caracteristica;

  public Peixe(){
    super();
    caracteristica = "sem caracteristica";
  }
  public Peixe(String nome, float comp, int numeroPatas, String cor, String ambiente, float vm, String caracteristica){
    super(nome, comp, numeroPatas, cor, ambiente, vm);
    setCaracteristica(caracteristica);
  }
  public String getCaracteristica(){
    return caracteristica;
  }
  public void setCaracteristica(String caracteristica){
    this.caracteristica = caracteristica;
  }
  public void dadosPeixe(){
    super.dados();
    System.out.println("Caracteristica: "+ caracteristica);
    
  }
}