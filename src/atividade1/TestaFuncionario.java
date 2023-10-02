package atividade1;

public class TestaFuncionario {
  public static void main(String[] args) {

    Funcionario funcionario1 = new Funcionario("12345678901", "João Silva", 3000.00);

    System.out.println("Informações do Funcionário:");
    System.out.println("CPF: " + funcionario1.getCpf());
    System.out.println("Nome: " + funcionario1.getNomeCompleto());
    System.out.println("Salário: R$" + funcionario1.getSalario());

    funcionario1.promover(10);

    System.out.println("\nInformações do Funcionário após o aumento:");
    System.out.println("CPF: " + funcionario1.getCpf());
    System.out.println("Nome: " + funcionario1.getNomeCompleto());
    System.out.println("Salário: R$" + funcionario1.getSalario());
  }
}
