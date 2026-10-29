package aula08;

public class Produto {
    String nome;
    double preco;

    public Produto() {

    }
    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void imprime() {
        System.out.println("nome: "+nome+" "+"preço: "+preco);
    }
}
