package superMarket;

import java.util.Scanner;

public class MenuPrincipal {
    
    public MenuPrincipal() {

    }

    public void mostrar() {
        Screen.clear();
        System.out.println("***************************");
        System.out.println("* SUPER MARKET VERSÃO 1.0 *");
        System.out.println("***************************");
        System.out.println("0) SAIR");
        System.out.println("1) CADASTRO DE CLIENTES");
        System.out.println("2) CADASTRO DE PRODUTOS");
        System.out.println("3) ");
        System.out.println("4) ");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        if(op == 0) {
            return;
        }
        if(op == 1) {
            CadCliente cadCliente = new CadCliente();
            cadCliente.menu();
        }
        if(op == 2) {
            CadProduto cadProduto = new CadProduto();
            cadProduto.menu();
        }
        if(op == 3) {

        }
        mostrar();
    }
}
