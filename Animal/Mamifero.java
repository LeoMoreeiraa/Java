public class Mamifero extends Animal{
  String alimento;

  public Mamifero(){
    super();
    alimento = "sem dados";
  }
  public Mamifero(String nome, float comp, int numeroPatas, String cor, String ambiente, float vm, String alimento){
    super(nome, comp, numeroPatas, cor, ambiente, vm);
    setAlimento(alimento);
  }
  public String getAlimento(){
    return alimento;
  }
  public void setAlimento(String alimento){
    this.alimento = alimento;
  }

  public void dadosMamifero(){
    super.dados();
    System.out.println("Alimento: "+ alimento);
  }
}