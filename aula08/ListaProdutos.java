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

    public void salvar() {
        Produto prods[] = new Produto[qtde];
        for(int i=0; i<qtde; i++) {
            prods[i] = lista[i];
        }
        CsvUtil.salvar(prods, "./aula08/produtos.csv");
    }

    public void carregarDados() {
        Produto[] prods = CsvUtil.ler("produtos.csv", Produto.class);
        for(int i=0; i<prods.length; i++) {
            lista[i] = prods[i];
        }
        qtde = prods.length;
    }
}
