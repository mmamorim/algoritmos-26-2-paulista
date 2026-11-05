package aula08;

import java.util.Scanner;

import aula06.Screen;

public class CadProduto {
    ListaProdutos listaProd;

    public CadProduto() {
        listaProd = new ListaProdutos();
        listaProd.carregarDados();
    }

    public void menu() {
        Screen.clear();
        System.out.println("CADASTRO DE PRODUTOS");
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
            System.out.println("Digite [ENTER] para continuar...");
            sc.next();
        }
        if(op == 2) {
            listaProd.cadastrar();
        }
        if(op == 3) {
            listaProd.remover();
        }
        menu();
    }

    public void listar() {
        listaProd.imprime();
    }


}
