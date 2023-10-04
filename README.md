# M2S03 - Atividades em Java

### [M01S03] Ex 01 - Classes

Crie uma classe 'Funcionario' para representar um empregado de uma empresa, contendo os atributos cpf, nome completo e salário.
Implemente também um método 'promover' que recebe como parâmetro um percentual (float), devendo o salário ser aumentado pelo percentual indicado no argumento do método.
Crie e utilize um objeto desta classe para testar a implementação.

### [M02S03] Ex 02 - POO: construtores e sobrecarga

a- Crie uma classe 'Funcionario' com os atributos 'nome' (String) e 'salário' (Float).

b- Implemente um construtor que receba um argumento de nome e inicialize o atributo de 'nome' com este valor.

c- Implemente outro construtor que receba como argumentos nome e salário e inicialize os respectivos atributos.

d- Implemente um método público 'aumentar' que recebe como parâmetro um valor (Float). Na implementação, some este valor ao 'salário'.

e- Implemente outro método público 'aumentar' que recebe como parâmetros um valor (Float) e uma commissão (Float). Na implementação, some ambos os valores ao 'salário'.

### [M02S03] Ex 03 - POO: static

a- Crie uma classe 'Contador'.

b- Crie um método estático (static) 'contarPalavras' que recebe uma frase (String) como argumento.

c- Implemente o método imprimindo no console o número de palavras da frase recebida como parâmetro.

d- Crie um método main em outra classe para testar a implementação.

Dicas:

Usar método split() da String ou classe StringTokenizer.

### [M02S03] Ex 04 - POO: instâncias

a- Crie uma classe 'Contador2'.

b- Crie um atributo privado 'frase' (String) nesta classe.

c- Implemente um construtor que receba uma frase como parâmetro, e inicialize o atributo criado com esta frase.

d- Implemente um método (não static desta vez) 'contarPalavras' que retorna a quantidade de palavras da frase indicada no atributo da classe.

e- Crie um método main em outra classe para testar a implementação.

Dicas:

Usar método split() da String ou classe StringTokenizer.

### [M02S03] Ex 05 - Mega-Sena

Vamos criar uma funcionalidade de manipulação dos resultados de sorteios da mega-sena dividido em várias partes/exercícios.

A mega-sena trata-se de um sorteio de seis números de 1 a 60, e o grande ganhador é quem acertar estes seis números sorteados.

a- Primeiro crie uma classe 'Concurso' para representar um concurso/sorteio.

b- Nesta classe, crie os atributos privados abaixo e os respectivos métodos getters & setters:

private Integer numero;
private LocalDate data;
private int[] sorteados;

c- Implemente também o método 'toString()' nesta classe.

d- Adicione o construtor padrão/default, e um construtor que receba parâmetros para inicializar cada atributo desta classe.

e- Crie uma classe 'Principal' com método 'main'. Neste método, implemente a leitura do arquivo em anexo contendo o resultados de sorteios da mega-sena, e para cada linha, instancie um objeto de 'Concurso' e armazene eles em um ArrayList para manipulação posterior.

f- Imprima esta lista de concursos carregadas a partir do arquivo no console.

Dicas:

Como é um arquivo csv, usar o método split() para separar os itens, e depois instanciar um objeto concurso para cada linha do arquivo, carregando os atributos com os valores.

Para imprimir os itens de um array, pode-se usar o método utilitário 'Arrays.toString()'.
