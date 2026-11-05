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

    public void imprime(int codigo) {
        System.out.println("COD: "+codigo+" nome: "+nome+" "+"preço: "+preco);
    }
}
