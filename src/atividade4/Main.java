package atividade4;

public class Main {

  public static void main(String[] args) {
    Contador contador = new Contador("Irineu, você não sabe nem eu!");
    int qtdPalavras = contador.contarPalavras();
    System.out.println(qtdPalavras);
  }

}