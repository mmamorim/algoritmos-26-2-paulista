<img src="/assets/teste.svg" width="100%">

# Exercícios - Aula 08 - 14/04

### Exercício 1 – Caixa de Supermercado Modular 🛒

Baseado no exercício anterior do caixa, reorganize a solução utilizando métodos.

O programa deve:

1. Exibir os produtos  
2. Ler as compras do usuário  
3. Calcular o total  
4. Exibir o resumo da compra  

---

### Requisitos de Modularização

Crie métodos como:

- `exibirProdutos()`  
- `lerOpcao()`  
- `lerQuantidade()`  
- `calcularTotal()`  
- `exibirResumo()`  

📌 O objetivo é dividir bem as responsabilidades.

---

## Exercício 2 – Jogo da Forca (Modularizado) 🎯

Implemente uma versão simples do **jogo da forca**, utilizando **métodos (`static`)** para organizar o código.

---

## Regras do Jogo

1. O programa deve definir uma palavra secreta (ex: `"java"`).  
2. O jogador deve tentar adivinhar a palavra, letra por letra.  
3. A cada tentativa:
   - se acertar a letra → ela é revelada  
   - se errar → perde uma vida  

4. O jogo termina quando:
   - o jogador acerta toda a palavra 🎉  
   - ou atinge o número máximo de erros 💀  

---

## Exibição da Forca (ASCII)

A cada erro, desenhe a forca progressivamente:

~~~text
  +---+
  |   |
  O   |  <-- Boneco completo (6 erros)
 /|\  |
 / \  |
      |
=========
~~~


---

## Objetivo

Seu programa deve:

1. Exibir o estado atual da palavra (ex: `_ _ v a`)  
2. Solicitar uma letra ao usuário  
3. Atualizar o progresso da palavra  
4. Controlar o número de erros  
5. Exibir a forca correspondente  
6. Informar vitória ou derrota  

---

## Requisitos de Modularização

Divida o programa em métodos, como por exemplo:

- `exibirForca(int erros)`  
- `exibirPalavra(char[] progresso)`  
- `lerLetra()`  
- `atualizarProgresso(...)`  
- `verificarVitoria(...)`  

📌 Você pode criar outros métodos se achar necessário.

---

## Dicas

- Utilize um array de caracteres para armazenar o progresso da palavra  
- Utilize laços para percorrer a palavra  
- Valide entradas (evitar letras repetidas, por exemplo)

---

## Desafio Extra 🚀

- Permitir que o jogador escolha a palavra  
- Exibir letras já utilizadas  
- Implementar várias rodadas  