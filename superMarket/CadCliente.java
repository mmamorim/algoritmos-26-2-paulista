package superMarket;

import java.util.Scanner;

public class CadCliente {
    ListaClientes lista;

    public CadCliente() {
        lista = new ListaClientes();
        lista.carregarDados();
    }

    public void menu() {
        Screen.clear();
        System.out.println("CADASTRO DE CLIENTES");
        System.out.println("====================");
        System.out.println("0) VOLTAR/SAIR");
        System.out.println("1) LISTAR");
        System.out.println("2) CADASTRAR");
        System.out.println("3) REMOVER");
        System.out.println("4) ALTERAR");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        if(op == 0) {
            return;
        }
        if(op == 1) {
            listar();
            Screen.pressEnterToContinue();
        }
        if(op == 2) {
            lista.cadastrar();
        }
        if(op == 3) {
            lista.remover();
        }
        menu();
    }

    public void listar() {
        lista.imprime();
    }


}
