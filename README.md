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

---

## Nível 13 — Consumindo API com HttpClient

### Exercício 25
Usando `HttpClient`, `HttpRequest` e `HttpResponse`, faça uma requisição para a API do OMDb buscando o filme de sua escolha (você vai precisar criar uma conta gratuita no site do OMDb pra pegar sua `apikey`). Imprima `response.body()` no console e confirme que recebeu o JSON.

### Exercício 26
Repita o exercício 25, mas agora busque **3 filmes diferentes**, um de cada vez, guardando o `response.body()` de cada busca numa `List<String>`. No final, percorra a lista com foreach imprimindo cada JSON.
 
---

## Nível 14 — Record e Gson (JSON → objeto)

### Exercício 27
Crie um `record Titulo` com pelo menos os campos `titulo`, `anoLancamento` e `avaliacao` (todos `String`, pra simplificar), usando `@SerializedName` para mapear corretamente os campos do JSON da OMDb (`Title`, `Year`, `imdbRating`). Configure a biblioteca Gson no projeto.

### Exercício 28
Junte os exercícios 25 e 27: faça a requisição HTTP, pegue o `response.body()`, e use `gson.fromJson(...)` para converter direto num objeto `Titulo`. Imprima o objeto (aproveite que `record` já gera `toString()` automático).

### Exercício 29
Repita o exercício 28, mas para uma **lista de filmes** (reaproveite os títulos do exercício 26). Para cada título buscado, converta para `Titulo` e guarde numa `List<Titulo>`. No final, imprima a lista inteira.
 
---

## Nível 15 — Exceptions básicas (try/catch)

### Exercício 30
Pegue o código do exercício 28 e envolva a parte da requisição HTTP num bloco `try/catch`, capturando `IOException` e `InterruptedException` separadamente (lembre que `client.send(...)` pode lançar os dois). Em cada `catch`, imprima uma mensagem diferente explicando qual tipo de erro ocorreu.

### Exercício 31
Teste o exercício 30 propositalmente **provocando um erro** — por exemplo, desligando o wi-fi por um instante antes de rodar, ou usando uma `apikey` inválida na URL. Observe qual `catch` é acionado e o que `e.getMessage()` imprime. Depois reative a internet/chave e confirme que o fluxo normal volta a funcionar.
 
---

## Nível 16 — Exception personalizada

### Exercício 32
Crie uma classe `TituloNaoEncontradoException extends Exception`, com um construtor que recebe uma mensagem e repassa pra `super(mensagem)`.

### Exercício 33
Crie um método `buscarTitulo(String nomeFilme)` que faz a requisição à API, converte para `Titulo`, e **valida** o resultado: se o campo `titulo` do objeto vier `null` (indicando que a OMDb não achou o filme buscado), lance a `TituloNaoEncontradoException` com uma mensagem informativa. O método deve declarar `throws TituloNaoEncontradoException` na assinatura.

### Exercício 34
Na `main`, chame `buscarTitulo(...)` dentro de um `try/catch`, tratando a `TituloNaoEncontradoException` separadamente das exceptions de rede (`IOException`/`InterruptedException`). Teste buscando um filme que existe e um nome aleatório que **não existe** (tipo `"asdkjaksjdaksjd"`), pra confirmar que sua exception personalizada é lançada corretamente nesse segundo caso.
 
---

## Nível 17 — Escrevendo arquivos

### Exercício 35
Usando `FileWriter` (dentro de um `try-with-resources`), escreva um arquivo `filme.txt` contendo o título e o ano de um `Titulo` buscado da API, formatado como texto simples (ex: `"Matrix (1999)"`). Trate `IOException` no `catch`.

### Exercício 36
Modifique o exercício 35 para gravar **vários** filmes no mesmo arquivo (reaproveite a `List<Titulo>` do exercício 29), uma linha por filme. Dica: pesquise o método `write` chamado várias vezes, ou concatene tudo numa `String` antes de escrever de uma vez.
 
---

## Nível 18 — Serializando para JSON com Gson

### Exercício 37
Pegue um objeto `Titulo` (buscado da API) e use `gson.toJson(titulo)` para convertê-lo de volta em texto JSON. Grave esse texto num arquivo `titulo.json`, usando `FileWriter`.

### Exercício 38
Repita o exercício 37, mas configure o Gson com `GsonBuilder().setPrettyPrinting().create()` antes de gerar o JSON. Compare o conteúdo do arquivo antes e depois — observe a diferença de formatação (compactado x indentado).

### Exercício 39
Serialize a `List<Titulo>` inteira (não um objeto só) para um arquivo `catalogo.json`, com `setPrettyPrinting()`. Dica: o Gson consegue serializar listas do mesmo jeito que serializa objetos — `gson.toJson(minhaLista)`.
 
---

## Nível 19 — Desafio final (juntando tudo)

### Exercício 40
Monte um pequeno programa de "catálogo de filmes salvos":
1. Peça (pode ser fixo no código, sem `Scanner`, se preferir) uma lista de 3 a 5 títulos de filmes;
2. Para cada título, busque na API OMDb, convertendo a resposta em `Titulo` via Gson;
3. Se algum filme não for encontrado, capture sua `TituloNaoEncontradoException` e **continue** buscando os próximos, sem interromper o programa (dica: o `try/catch` deve ficar **dentro** do loop, não em volta dele todo);
4. Ao final, salve todos os filmes encontrados com sucesso num arquivo `catalogo.json`, formatado com `setPrettyPrinting()`;
5. Imprima no console quantos filmes foram salvos com sucesso e quantos falharam.
---