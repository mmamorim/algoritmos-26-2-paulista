<img src="/assets/teste.svg" width="100%">

# Aula 10 - 05/05/2026

# Classes Simples em Java (Estilo "Struct")

Quando começamos a programar em Java, é comum pensar que **classes são algo complexo**.  
Mas, neste momento, vamos usá-las de forma **simples e prática**, como se fossem **structs** (estruturas de dados).

---

## O que é uma classe (neste contexto)?

Uma **classe simples** é apenas uma forma de **agrupar dados relacionados**.

👉 Pense assim:
> “Uma classe é um tipo que guarda várias informações juntas.”

---

## Exemplo básico

~~~java
class Produto {
    public int id;
    public String nome;
    public double preco;
    public int estoque;
}
~~~

Aqui temos uma classe `Produto` com **4 atributos**.

## 🔍 O que são atributos?

Atributos são **variáveis dentro da classe**.

No exemplo:

- `id` → número do produto  
- `nome` → nome do produto  
- `preco` → valor  
- `estoque` → quantidade disponível  

👉 Ou seja: **cada objeto `Produto` terá esses dados**

---

## Criando e usando um objeto

~~~java
Produto p = new Produto();

p.id = 1;
p.nome = "Coca-Cola";
p.preco = 5.50;
p.estoque = 10;
~~~

## Classe como “molde”

A classe é o molde
O objeto é o produto criado a partir do molde
Produto p1 = new Produto();
Produto p2 = new Produto();

👉 Você pode ter vários objetos com os mesmos atributos, mas valores diferentes

## Construtor (forma prática de criar)

~~~java
class Produto {
    public int id;
    public String nome;
    public double preco;
    public int estoque;

    public Produto(int id, String nome, double preco, int estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }
}
~~~

Uso:

~~~java
Produto p = new Produto(1, "Coca-Cola", 5.50, 10);
~~~


# Utilizando a Classe CsvUtil

A classe `CsvUtil` permite salvar e carregar objetos utilizando arquivos `.csv`.

Ela funciona de forma genérica, permitindo trabalhar com diferentes tipos de classes, como `Produto` e `Cliente`.

---

# Salvando Dados

Para salvar um vetor de objetos em um arquivo CSV:

```java
Produto[] produtos = new Produto[10];

CsvUtil.salvar(produtos, "produtos.csv");
```

O método irá:

- criar o arquivo CSV
- salvar os atributos da classe
- salvar os dados dos objetos

---

# Lendo Dados

Para carregar os dados do arquivo:

```java
Produto[] produtos = CsvUtil.ler("produtos.csv", Produto.class);
```

O método irá:

- abrir o arquivo CSV
- ler os dados
- criar os objetos automaticamente
- retornar um vetor do tipo informado

---

# Importante

As classes utilizadas devem possuir:

- atributos simples (`int`, `double`, `boolean`, `String`)
- construtor vazio

Exemplo:

```java
public class Produto {

    public int codigo;
    public String nome;
    public double preco;
    public int estoque;

    public Produto() {

    }

}
```

---

# Exemplo de Arquivo CSV Gerado

```csv
codigo;nome;preco;estoque
1;Coca-Cola;5.50;10
2;Chocolate;3.00;20
```

---

# Observações

- O arquivo CSV será criado na pasta raiz do projeto.
- O separador utilizado é `;`
- Os nomes dos atributos da classe serão utilizados como cabeçalho do arquivo.