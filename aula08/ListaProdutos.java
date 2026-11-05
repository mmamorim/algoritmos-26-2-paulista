package aula08;

import java.util.Scanner;

public class ListaProdutos {
    public Produto lista[];
    public int qtde;

    public ListaProdutos() {
        lista = new Produto[100];
        qtde = 0;
    }

    public void cadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadastro de Produto");
        System.out.println("===================");
        System.out.println("Qual o nome do Produto?");
        String nome = sc.nextLine();
        System.out.println("Qual o preço do Produto?");
        double preco = sc.nextDouble();
        Produto p = new Produto(nome, preco);
        adiciona(p);
        salvar();
    }

    public void adiciona(Produto p) {
        lista[qtde] = p;
        qtde++;
    }

    public void remover() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Remover Produto");
        System.out.println("===================");
        System.out.println("Qual o código do Produto?");
        int codigo = sc.nextInt();
        removerItem(codigo);
        salvar();        
    }

    public void removerItem(int codigo) {
        for (int i = codigo; i < qtde; i++) {
            lista[i] = lista[i + 1];
        }
        qtde--;
    }

    public void imprime() {
        for (int i = 0; i < qtde; i++) {
            lista[i].imprime(i);
        }
    }

    public void salvar() {
        Produto prods[] = new Produto[qtde];
        for (int i = 0; i < qtde; i++) {
            prods[i] = lista[i];
        }
        CsvUtil.salvar(prods, "./aula08/produtos.csv");
    }

    public void carregarDados() {
        Produto[] prods = CsvUtil.ler("./aula08/produtos.csv", Produto.class);
        for (int i = 0; i < prods.length; i++) {
            lista[i] = prods[i];
        }
        qtde = prods.length;
    }

}
