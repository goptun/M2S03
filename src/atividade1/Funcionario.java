package atividade1;

public class Funcionario {
  private String cpf;
  private String nomeCompleto;
  private double salario;

  public Funcionario(String cpf, String nomeCompleto, double salario) {
    this.cpf = cpf;
    this.nomeCompleto = nomeCompleto;
    this.salario = salario;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNomeCompleto() {
    return nomeCompleto;
  }

  public void setNomeCompleto(String nomeCompleto) {
    this.nomeCompleto = nomeCompleto;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public void promover(float percentualAumento) {
    if (percentualAumento > 0) {
      double aumento = salario * (percentualAumento / 100);
      salario += aumento;
      System.out.println("O salário foi aumentado em " + percentualAumento + "%.");
    } else {
      System.out.println("O percentual de aumento deve ser maior que zero.");
    }
  }

}
