package aula08;

public class ListaProdutos {
    public Produto lista[];
    public int qtde;

    public ListaProdutos() {
        lista = new Produto[100];
        qtde = 0;
    }

    public void adiciona(Produto p) {
        lista[qtde] = p;
        qtde++;
    }

    public void imprime() {
        for(int i=0; i<qtde; i++) {
            lista[i].imprime();
        }
    }
}
