<img src="/assets/teste.svg" width="100%">

# Aula 8 - 14/04/2026

## Arrays (Vetores) em Java

Um **array** (ou vetor) é uma estrutura que permite armazenar **vários valores do mesmo tipo** em uma única variável.

Diferente de uma variável simples, que armazena apenas um valor, um array armazena vários valores organizados em posições.

---

## Declaração de um Array

Para declarar um array:

~~~java
int[] numeros;
~~~

---

## Criação de um Array

Após declarar, é necessário definir o tamanho:

~~~java
numeros = new int[5];
~~~

Isso cria um array com **5 posições**, indexadas de **0 a 4**.

---

## Declaração e Criação em uma Linha

~~~java
int[] numeros = new int[5];
~~~

---

## Inicialização com Valores

Também é possível já definir os valores:

~~~java
int[] numeros = {10, 20, 30, 40, 50};
~~~

---

## Acesso aos Elementos

Cada valor é acessado por meio de um índice:

~~~java
System.out.println(numeros[0]); // primeiro elemento
System.out.println(numeros[2]); // terceiro elemento
~~~

---

## Alteração de Valores

~~~java
numeros[1] = 25;
~~~

---

## Percorrendo um Array

O uso mais comum de arrays é com laços de repetição:

~~~java
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
~~~

📌 `numeros.length` indica a quantidade de elementos do array.

---

## Cuidados Importantes

- O índice sempre começa em **0**  
- O tamanho do array é **fixo** após sua criação  
- Acessar posições inválidas gera erro:

~~~java
numeros[5]; // erro
~~~

---

## Resumo

- Arrays armazenam múltiplos valores do mesmo tipo  
- Possuem tamanho fixo  
- São acessados por índice  
- São percorridos geralmente com `for`  

---

## Modularização com Métodos em Java

À medida que os programas crescem, organizar o código se torna essencial.  
Uma forma de fazer isso é utilizando **métodos**, que funcionam como “funções”.

Um método permite **separar o código em partes menores**, facilitando:

- leitura  
- reutilização  
- manutenção  

---

## Estrutura de um Método

~~~java
static tipoRetorno nomeMetodo(parametros) {
    // código
}
~~~

### Exemplo

~~~java
static void mensagem() {
    System.out.println("Olá!");
}
~~~

---

## Chamando um Método

Para executar um método, basta chamá-lo pelo nome:

~~~java
mensagem();
~~~

---

## Métodos com Parâmetros

Os métodos podem receber valores como entrada, chamados de **parâmetros**:

~~~java
static void saudacao(String nome) {
    System.out.println("Olá, " + nome);
}
~~~

Chamada:

~~~java
saudacao("Maria");
~~~

---

## Métodos com Retorno

Um método também pode **retornar um valor** utilizando a palavra-chave `return`.

~~~java
static int soma(int a, int b) {
    return a + b;
}
~~~

Chamada:

~~~java
int resultado = soma(5, 3);
System.out.println(resultado);
~~~

---

## Método `void`

Quando o método não retorna nenhum valor, utilizamos `void`:

~~~java
static void exibirMensagem() {
    System.out.println("Sem retorno");
}
~~~

---

## Exemplo Completo

~~~java
public class Main {

    public static void main(String[] args) {
        int resultado = soma(10, 5);
        System.out.println(resultado);
    }

    static int soma(int a, int b) {
        return a + b;
    }
}
~~~

---

## Resumo

- Métodos ajudam a **organizar o código**  
- Podem receber **parâmetros**  
- Podem **retornar valores** (`return`)  
- `void` indica que não há retorno  
- Devem ser declarados com `static` para serem usados dentro da `main`  

👉 A modularização torna os programas mais claros e reutilizáveis.