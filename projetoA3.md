<img src="/assets/teste.svg" width="100%">

# Projeto A3 — Sistema de Mini Mercado

## Descrição

Desenvolver, em Java, um sistema de terminal (console) para gerenciamento de um mini mercado.

O sistema deverá permitir o gerenciamento de produtos, clientes e realização de compras, simulando operações básicas de um mercado real.

O projeto deverá ser desenvolvido utilizando os conceitos estudados na disciplina até o momento.

---

# Objetivos do Projeto

O projeto tem como objetivo aplicar, na prática, os seguintes conceitos:

- variáveis e tipos de dados
- estruturas condicionais
- estruturas de repetição
- vetores
- modularização
- classes simples e objetos
- persistência de dados em arquivos CSV
- organização de código

---

# Estrutura Geral do Sistema

O sistema deverá possuir um menu principal contendo, no mínimo, as seguintes opções:

```text
1. Produtos
2. Clientes
3. Realizar Compra
4. Controle de Estoque
0. Sair
```

Cada opção deverá direcionar para um submenu específico.

- Deve-se manipular as informações implementando as Classes:
    - Cliente
    - Produto

---

# O que é CRUD?

CRUD é um termo utilizado para representar as quatro operações básicas de manipulação de dados em um sistema.

A sigla significa:

| Letra | Operação | Descrição |
|---|---|---|
| C | Create | Cadastrar / criar dados |
| R | Read | Consultar / listar dados |
| U | Update | Alterar dados |
| D | Delete | Remover dados |

No projeto do mini mercado, por exemplo:

- cadastrar um produto → Create
- listar produtos → Read
- alterar preço de um produto → Update
- remover um produto → Delete

Essas operações serão implementadas tanto para Produtos quanto para Clientes.

---

# CRUD de Produtos

O menu de produtos deverá possuir, no mínimo:

```text
1. Cadastrar Produto
2. Listar Produtos
3. Buscar Produto
4. Alterar Produto
5. Remover Produto
0. Voltar
```

---

# CRUD de Clientes

O menu de clientes deverá possuir, no mínimo:

```text
1. Cadastrar Cliente
2. Listar Clientes
3. Buscar Cliente
4. Alterar Cliente
5. Remover Cliente
0. Voltar
```

## Exemplo — Inserção de Cliente

Exemplo de interação esperada no terminal para cadastro de cliente:

```text
====================================
        CADASTRAR CLIENTE
====================================

Digite o CPF: 12345678900
Digite o Nome: João Silva
Digite o Telefone: (11)99999-9999
Digite o Email: joao@email.com

Cliente cadastrado com sucesso!

Pressione ENTER para continuar...
```

O mesmo padrão poderá ser utilizado para os demais CRUDs do sistema.

---

# Realização de Compra

Ao selecionar a opção de compra, o sistema deverá:

1. Perguntar:

```text
Sou cadastrado? (S/N)
```

2. Caso a resposta seja "S":
   - solicitar o CPF do cliente
   - localizar o cliente cadastrado

3. O sistema deverá permitir adicionar produtos à compra:
   - informar código do produto
   - informar quantidade desejada

4. O sistema deverá:
   - validar estoque
   - calcular subtotal dos itens
   - calcular total final da compra

5. Ao finalizar, o sistema deverá exibir:

```text
- lista de itens comprados
- quantidade
- valor unitário
- subtotal
- valor total da compra
```

---

# Controle de Estoque

O sistema deverá controlar automaticamente a quantidade de produtos disponíveis em estoque.

Sempre que uma compra for realizada, o sistema deverá:

- verificar se o produto existe
- verificar se há quantidade suficiente em estoque
- impedir a venda caso o estoque seja insuficiente
- reduzir a quantidade em estoque após a venda
- salvar o estoque atualizado no arquivo CSV

Exemplo:

~~~text
Produto: Coca-Cola
Estoque atual: 10
Quantidade comprada: 3
Novo estoque: 7
~~~

Caso o cliente tente comprar uma quantidade maior que o estoque disponível, o sistema deverá exibir uma mensagem de erro e não realizar a venda daquele item.

---

# Estrutura das Classes

## Produto

Cada produto deverá possuir, no mínimo:

| Atributo | Descrição |
|---|---|
| codigo | Identificador do produto |
| nome | Nome do produto |
| preco | Valor do produto |
| estoque | Quantidade disponível |

---

## Cliente

Cada cliente deverá possuir, no mínimo:

| Atributo | Descrição |
|---|---|
| cpf | CPF do cliente |
| nome | Nome do cliente |
| telefone | Telefone |
| email | Email |

---

# Persistência de Dados

Os dados deverão ser armazenados em arquivos `.csv`.

Exemplo:

```csv
codigo;nome;preco;estoque
1;Coca-Cola;5.50;10
2;Chocolate;3.00;20
```

O sistema deverá:

- salvar os dados no arquivo
- carregar os dados ao iniciar o programa

---

# Regras do Projeto

- O sistema deverá funcionar totalmente no terminal
- Não utilizar interface gráfica
- Não utilizar banco de dados
- O sistema deverá possuir tratamento básico de erros e validações
- O código deve estar organizado e indentado corretamente

---

# Entrega

A entrega deverá ser realizada por meio de um repositório no GitHub.

Regras da entrega:

- apenas um integrante deverá realizar a entrega do repositório pelo grupo
- o repositório deverá conter todo o código-fonte do projeto
- o projeto deverá estar funcionando corretamente
- o repositório deverá possuir instruções de execução no `README.md`

---

# Formação dos Grupos

- O projeto poderá ser desenvolvido individualmente ou em grupo
- Cada grupo poderá possuir no máximo 5 integrantes

---

# Critérios de Avaliação

| Critério | Pontos |
|---|---|
| Organização do código | 2,0 |
| Implementação dos CRUDs | 2,5 |
| Controle de estoque | 1,5 |
| Uso correto de classes e métodos | 1,5 |
| Persistência em CSV | 1,0 |
| Fluxo de compra e usabilidade | 1,5 |

---

# Observações

- O uso de bibliotecas externas deve ser previamente autorizado.
- O foco principal da avaliação será a aplicação correta dos conceitos estudados em sala.
