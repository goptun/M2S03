package atividade4;

public class Contador {

  private String frase;

  public Contador(String frase) {
    this.frase = frase;
  }

  public int contarPalavras() {
    if (this.frase == null)
      return 0;
    String[] palavras = this.frase.split(" ");
    return palavras.length;
  }

}
