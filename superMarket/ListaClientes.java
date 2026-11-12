package superMarket;

import java.util.Scanner;

public class ListaClientes {
    public Cliente lista[];
    public int qtde;

    public ListaClientes() {
        lista = new Cliente[100];
        qtde = 0;
    }

    public void cadastrar() {
        System.out.println("Cadastro de Cliente");
        System.out.println("===================");
        Cliente c = new Cliente();
        c.lerDados();
        adiciona(c);
        salvar();
    }

    public void adiciona(Cliente c) {
        lista[qtde] = c;
        qtde++;
    }

    public void remover() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Remover Cliente");
        System.out.println("===================");
        System.out.println("Qual o código do Cliente?");
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
        Cliente clientes[] = new Cliente[qtde];
        for (int i = 0; i < qtde; i++) {
            clientes[i] = lista[i];
        }
        CsvUtil.salvar(clientes, "./superMarket/clientes.csv");
    }

    public void carregarDados() {
        Cliente[] clientes = CsvUtil.ler("./superMarket/clientes.csv", Cliente.class);
        for (int i = 0; i < clientes.length; i++) {
            lista[i] = clientes[i];
        }
        qtde = clientes.length;
    }

}
