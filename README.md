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
