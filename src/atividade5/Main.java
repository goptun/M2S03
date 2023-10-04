package atividade5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {

    List<Concurso> lista = new ArrayList<>();

    Path arquivo = Paths.get("src", "tech", "devinhouse", "clamedv2", "exercicios", "exercicio05", "megasena.txt");
    if (Files.notExists(arquivo))
      System.out.println("Arquivo nao encontrado!!!");

    List<String> linhas = Files.readAllLines(arquivo);

    for (String linha : linhas) {
      String[] split = linha.split(",");

      int nro = Integer.parseInt(split[0]);

      String dataStr = split[1];
      DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      LocalDate data = LocalDate.parse(dataStr, formatador);

      int[] nrosSorteados = new int[6];
      for (int i = 0; i <= 5; i++) {
        String n = split[i + 2];
        nrosSorteados[i] = Integer.parseInt(n);
      }

      Concurso concurso = new Concurso(nro, data, nrosSorteados);
      lista.add(concurso);
    }

    lista.forEach(c -> System.out.println(c));

  }

}
