# Exercícios de Java — Orientação a Objetos

Lista progressiva de exercícios para consolidar os conceitos de **classes, atributos, objetos, métodos, encapsulamento, herança, polimorfismo e interfaces** em Java.



---

## Nível 1 — Classe, atributos, objetos e métodos

### Exercício 1
Crie uma classe `Livro` com os atributos `titulo` (String), `autor` (String), `numeroPaginas` (int) e `disponivel` (boolean). Depois, na `main`, instancie 2 livros diferentes, preencha os atributos e imprima os dados de cada um.

### Exercício 2
Adicione um método `emprestar()` na classe `Livro`, que muda `disponivel` para `false` e imprime uma mensagem tipo `"Livro emprestado com sucesso!"`. Se o livro já estiver emprestado (`disponivel == false`), deve imprimir `"Livro indisponível."` em vez disso.

### Exercício 3
Crie uma classe `ContaBancaria` com atributos `titular` (String) e `saldo` (double). Crie métodos `depositar(double valor)` e `sacar(double valor)`. No saque, verifique se há saldo suficiente antes de permitir a operação.

---

## Nível 2 — Encapsulamento, getters, setters e `this`

### Exercício 4
Pegue a classe `ContaBancaria` do exercício 3 e **encapsule** todos os atributos (torne-os `private`). Crie os getters necessários. Para o setter de `saldo`, não permita valores negativos — ou avalie se realmente faz sentido ter um `setSaldo`, já que o saldo deveria mudar só via `depositar`/`sacar`.

### Exercício 5
Crie uma classe `Produto` com atributos privados `nome`, `preco` e `quantidadeEstoque`. Crie os getters e setters, usando corretamente a palavra-chave `this` para diferenciar atributo de parâmetro. No `setPreco`, não permita preços negativos ou zero.

### Exercício 6
Crie uma classe `Retangulo` com atributos privados `largura` e `altura`. Crie um método `calcularArea()` que retorna a área (sem precisar de parâmetros, ele usa os próprios atributos do objeto). Crie também `calcularPerimetro()`.

---

## Nível 3 — Modelando o mundo real

### Exercício 7
Pense em uma classe `Carro`. Liste (no papel ou em comentário no código) pelo menos 4 atributos e 4 métodos que fariam sentido para essa entidade. Depois implemente a classe completa, com atributos encapsulados, getters/setters e os métodos com alguma lógica simples (ex: `acelerar()` aumenta a velocidade atual, `frear()` diminui, etc). Um dos métodos deve ter uma validação (ex: não deixar a velocidade ficar negativa).

### Exercício 8
Modele uma classe `Aluno` com `nome`, `notas` (pode ser um array de `double` com 3 notas) e um método `calcularMedia()` que retorna a média das notas. Crie também um método `foiAprovado()` que retorna um `boolean` (aprovado se média >= 6).

---

## Nível 4 — Herança e sobrescrita

### Exercício 9
Crie uma superclasse `Animal` com atributos `nome` e `idade`, e um método `emitirSom()` que imprime `"Som genérico de animal"`. Crie duas subclasses, `Cachorro` e `Gato`, que **sobrescrevem** `emitirSom()` (com `@Override`) para imprimir `"Au au!"` e `"Miau!"` respectivamente.

### Exercício 10
Usando as classes do exercício 9, crie uma lista (`List<Animal>`) contendo objetos `Cachorro` e `Gato` misturados. Percorra a lista com um `for` e chame `emitirSom()` para cada um — sem usar nenhum `if`. Isso é **polimorfismo** na prática.

### Exercício 11
Crie uma superclasse `Funcionario` com `nome` e `salarioBase`, e um método `calcularSalario()` que retorna `salarioBase`. Crie uma subclasse `Gerente` que **sobrescreve** `calcularSalario()` para retornar `salarioBase + 1500` (um bônus fixo de gerência).

---

## Nível 5 — Interfaces

### Exercício 12
Crie uma interface `Desconto` com um método `aplicarDesconto(double valorOriginal)`. Crie duas classes, `ClienteVIP` e `ClienteComum`, que implementam essa interface: `ClienteVIP` dá 20% de desconto, `ClienteComum` dá 5%. Depois, crie uma lista `List<Desconto>` com os dois tipos de cliente e calcule o desconto de cada um num loop.

### Exercício 13 (desafio, juntando tudo)
Crie um pequeno sistema de "Loja":
- Uma classe `Produto` (nome, preço, encapsulados);
- Uma interface `FormaPagamento` com o método `calcularValorFinal(double valor)`;
- Duas classes implementando essa interface: `PagamentoDinheiro` (10% de desconto) e `PagamentoCartao` (acrescenta 3% de juros);
- Na `main`, crie um `Produto`, escolha uma forma de pagamento e imprima o valor final calculado.

---

## Nível 7 — ArrayList básico e `toString()`

### Exercício 14
Crie uma classe `Filme` com `titulo` (String) e `notaIMDB` (double). Sobrescreva o `toString()` para exibir algo como `"Matrix (nota: 8.7)"`. Na `main`, crie um `ArrayList<Filme>`, adicione 4 filmes usando `add()`, e depois percorra a lista com um `for` tradicional (usando `size()` e `get(i)`) imprimindo cada um.

### Exercício 15
Refaça o `for` do exercício 14, mas agora usando **foreach**. Depois, imprima a lista inteira de uma vez só com `System.out.println(listaDeFilmes)` — sem loop nenhum — e confirme que o `toString()` que você sobrescreveu aparece pra cada item automaticamente.
 
---

## Nível 8 — Construtores, construtor default e `super`

### Exercício 16
Na classe `Filme` do exercício anterior, crie **dois construtores**: um vazio (sem parâmetros) e outro recebendo `titulo` e `notaIMDB`. No construtor vazio, defina valores padrão (ex: `titulo = "Sem título"`, `notaIMDB = 0.0`). Teste os dois na `main`.

### Exercício 17
Crie uma superclasse `Midia` com `titulo` (String) e `anoLancamento` (int), com um construtor que recebe os dois. Crie uma subclasse `Serie extends Midia`, adicionando o atributo `numeroTemporadas` (int). No construtor de `Serie`, use `super(...)` para inicializar `titulo` e `anoLancamento`, e complete com `numeroTemporadas`. Sobrescreva `toString()` em `Serie` para mostrar todos os dados.
 
---

## Nível 9 — Casting e `instanceof`

### Exercício 18
Reaproveitando `Midia` e `Serie` do exercício 17, crie também uma subclasse `Filme2 extends Midia` (pode ser um nome diferente pra não confundir com o `Filme` do exercício 14), adicionando `duracaoMinutos` (int). Crie um `ArrayList<Midia>` e adicione 2 `Serie` e 2 `Filme2` misturados. Percorra a lista com foreach e, usando `instanceof`, identifique o tipo real de cada item, fazendo o casting e imprimindo um dado **específico** daquele tipo (ex: se for `Serie`, imprime `numeroTemporadas`; se for `Filme2`, imprime `duracaoMinutos`).

### Exercício 19
No mesmo cenário do exercício 18, conte quantos itens da lista são `Serie` e quantos são `Filme2`, usando `instanceof` dentro do loop (duas variáveis contadoras, incrementadas conforme o tipo).
 
---

## Nível 10 — `Comparable` e ordenação

### Exercício 20
Crie uma classe `Produto` com `nome` (String) e `preco` (double). Implemente `Comparable<Produto>`, ordenando por `preco` (do menor para o maior) usando `compareTo` com `Double.compare`. Na `main`, crie um `ArrayList<Produto>` com pelo menos 5 produtos em ordem aleatória, use `Collections.sort()` e imprima a lista antes e depois de ordenar (lembre de sobrescrever `toString()` pra facilitar a visualização).

### Exercício 21
Pegue os `Filme` do exercício 14/15 e implemente `Comparable<Filme>`, ordenando por `notaIMDB` — mas dessa vez em ordem **decrescente** (do maior para o menor). Dica: pense em como inverter o resultado de `Double.compare`.
 
---

## Nível 11 — `Comparator` (ordenação flexível)

### Exercício 22
Usando a lista de `Produto` do exercício 20, ordene a mesma lista de **duas formas diferentes**, sem alterar o `compareTo` da classe:
1. Por `nome` em ordem alfabética, usando `list.sort(Comparator.comparing(Produto::getNome))`;
2. Por `preco`, usando `list.sort(Comparator.comparingDouble(Produto::getPreco))`.
   Imprima a lista depois de cada ordenação pra ver a diferença.

### Exercício 23
No mesmo exercício, tente ordenar por `preco` em ordem **decrescente** usando `Comparator`, sem tocar na classe `Produto`. Dica: pesquise o método `.reversed()` do `Comparator`.
 
---

## Nível 12 — Programando para interface (desafio final)

### Exercício 24 (juntando tudo)
Crie um pequeno "catálogo de filmes":
- Classe `Filme` com `titulo`, `genero` (String) e `notaIMDB`, implementando `Comparable` por nota;
- Declare a lista como `List<Filme> catalogo = new ArrayList<>();` (repare: variável do tipo da **interface**, não da implementação);
- Adicione pelo menos 6 filmes;
- Implemente um menu simples (pode ser só uma sequência de `System.out.println` simulando opções, não precisa de input real) que:
    1. Ordena e exibe por nota (usando `Collections.sort`, aproveitando o `Comparable`);
    2. Ordena e exibe por título, alfabeticamente (usando `Comparator`);
    3. Filtra e exibe só os filmes de um determinado `genero` (usando foreach + `if`).
- No final, troque a linha `new ArrayList<>()` por `new LinkedList<>()` e confirme que **nada mais** no código precisou mudar.
