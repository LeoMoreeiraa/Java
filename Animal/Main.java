public class Main {
  public static void main(String[] args) {
    Mamifero camelo = new Mamifero("Camelo", 150.0f, 4, "Amarelo", "Terra",2.0f, "sem alimento");
    camelo.dadosMamifero();
    System.out.println("\n");
  Peixe tubarao = new Peixe("Tubarão", 300.0f, 0, "Cinzenta", "Mar",1.5f, "barbatana e calda");
    tubarao.dados();
  }
}