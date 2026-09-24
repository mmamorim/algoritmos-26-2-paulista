<img src="/assets/teste.svg" width="100%">

# Aula 5 - 24/09/2026

## Laços de Repetição em Java

Os **laços de repetição** (loops) são estruturas que permitem executar um bloco de código várias vezes, evitando repetição manual de instruções.

Em Java, duas das estruturas mais utilizadas são:

- `while`
- `for`

---

## Estrutura `while`

O `while` é utilizado quando a repetição depende de uma **condição**, e geralmente não sabemos exatamente quantas vezes o laço será executado.

Sua estrutura é:

~~~java
while (condicao) {
    // código a ser repetido
}
~~~

O bloco de código será executado **enquanto a condição for verdadeira**.

### Exemplo

~~~java
int contador = 1;

while (contador <= 5) {
    System.out.println(contador);
    contador++;
}
~~~

📌 O `while` é mais indicado quando:
- a repetição depende de uma condição
- não há uma contagem fixa definida previamente

---

## Estrutura `for`

O `for` é utilizado quando sabemos exatamente **quantas vezes o laço deve se repetir**, sendo muito comum em contagens.

Sua estrutura é:

~~~java
for (inicializacao; condicao; incremento) {
    // código a ser repetido
}
~~~

### Exemplo

~~~java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
~~~

📌 O `for` é mais indicado quando:
- há uma contagem definida
- queremos controlar início, fim e incremento em um único lugar

---

## Resumo

- `while` → usado para **repetições baseadas em condição (sem contagem definida)**  
- `for` → usado para **repetições com contagem definida**

Ambos podem resolver problemas semelhantes, mas escolher a estrutura correta torna o código mais claro e organizado.


## Strings em Java

Uma **String** é uma sequência de caracteres, utilizada para representar textos, como nomes, mensagens e palavras.

Em Java, Strings são muito utilizadas e possuem diversas funcionalidades prontas.

---

## Declaração de uma String

~~~java
String nome = "Maria";
~~~

---

## Tamanho da String

Podemos descobrir quantos caracteres existem em uma String usando:

~~~java
nome.length();
~~~

### Exemplo

~~~java
System.out.println(nome.length()); // saída: 5
~~~

---

## Acesso a Caracteres

Cada caractere de uma String possui uma posição (índice), que começa em **0**.

Podemos acessar um caractere específico com o método `charAt`:

~~~java
System.out.println(nome.charAt(0)); // M
System.out.println(nome.charAt(1)); // a
~~~

📌 Assim como em arrays, o índice começa em 0.

---

## Percorrendo uma String

Podemos usar um laço de repetição para acessar todos os caracteres:

~~~java
for (int i = 0; i < nome.length(); i++) {
    System.out.println(nome.charAt(i));
}
~~~

---

## Comparação de Strings

Para comparar Strings, não devemos usar `==`, mas sim o método `equals`:

~~~java
String a = "Java";
String b = "Java";

System.out.println(a.equals(b)); // true
~~~

---

## Strings são Imutáveis

Uma característica importante é que Strings não podem ser alteradas diretamente.

~~~java
String texto = "Olá";
texto = texto + " Mundo";
~~~

Na prática, uma nova String é criada.

---

## Conexão com Arrays

Observe que:

- usamos **índices (0, 1, 2...)**  
- usamos **length** para tamanho  
- percorremos com **for**  

📌 Isso acontece porque, internamente, uma String é semelhante a um conjunto de caracteres organizados em sequência.

---

## Resumo

- String representa texto  
- Possui tamanho (`length`)  
- Permite acesso por índice (`charAt`)  
- Pode ser percorrida com `for`  
- É imutável  

👉 Esses conceitos serão fundamentais para entender arrays nos próximos tópicos.