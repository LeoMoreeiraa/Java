public class Animal {
  private String nome;
  private float comp;
  private int numeroPatas;
  private String cor;
  private String ambiente;
  private float vm;

  public Animal(){
    nome ="sem nome";
    comp = 0.0f;
    numeroPatas = 0;
    cor = "sem cor";
    ambiente= "Indetermindo";
    vm = 0.0f;
  }
  public Animal(String nome, float comp, int numeroPatas, String cor, String ambiente, float vm) {
    setNome(nome);
    setComp(comp);
    setNumeroPatas(numeroPatas);
    setCor(cor);
    setAmbiente(ambiente);
    setVm(vm);
  }
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getComp() {
    return comp;
  }
  public void setComp(float comp) {
    this.comp= comp;
  }
  public int getNumeroPatas() {
    return numeroPatas;
  }
  public void setNumeroPatas(int numeroPatas){
    this.numeroPatas=numeroPatas;
  }
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor= cor;
  }
  public String getAmbiente() {
    return ambiente;
  }
  public void setAmbiente(String ambiente) {
    this.ambiente= ambiente;
  }
  public float getVm() {
    return vm;
  }
  public void setVm(float vm) {
    this.vm= vm;
  }
  public void dados(){
    System.out.println("Nome: "+ nome);
    System.out.println("Comprimento: "+ comp + " cm");
    System.out.println("Cor: "+ cor);
    System.out.println("Ambiente: "+ ambiente);
    System.out.println("Velocidade Média: "+ vm + " m/s");
  }
}

  
