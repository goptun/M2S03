package atividade2;

public class TestaFuncionario {

  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario("Matheus");
    funcionario.setSalario(1000F);
    funcionario.aumentar(500F);
    System.out.println(funcionario.getSalario());
    funcionario.aumentar(300F, 30F);
    System.out.println(funcionario.getSalario());
  }

}
