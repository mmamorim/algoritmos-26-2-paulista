package aula07;

import java.util.Scanner;

public class Sacola {
    static String prods[] = { "Feijão", "Batata", "Alface", "Arroz" };
    static int sacola[] = new int[1000];
    static int qtde = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Screen.clear();
        sacola[0] = 1;
        sacola[1] = 2;
        sacola[2] = 0;
        sacola[3] = 3;
        sacola[4] = 2;

        int op = imprimeMenu();
        //System.out.println("VC digitou: " + op);

        while (op > 0) {
            if(op == 1) {
                imprimeProdutos();
                System.out.println("Enter para continuar...");
                sc.nextLine();
            }
            if(op == 2) {
                imprimeSacola();
                System.out.println("Enter para continuar...");
                sc.nextLine();
            }
            if(op == 3) {
                adicionarSacola();
            }
            if(op == 4) {
                excluirSacola();
            }
            Screen.clear();
            op = imprimeMenu();
        }

        // imprimeProdutos();
        // System.out.println("Qual código adicionar na sacola? (-1 p/ sair)");
        // int codigo = sc.nextInt();
        // while (codigo >= 0) {
        // sacola[qtde] = codigo;
        // qtde++;
        // Screen.clear();
        // imprimeProdutos();
        // System.out.println("Qual código adicionar na sacola? (-1 p/ sair)");
        // codigo = sc.nextInt();
        // }
        // imprimeSacola();

    }

    public static void imprimeProdutos() {
        System.out.println("PRODUTOS");
        System.out.println("=================");
        for (int i = 0; i < prods.length; i++) {
            System.out.println(i + " - " + prods[i]);
        }
    }

    public static void imprimeSacola() {
        System.out.println("PRODUTOS NA SACOLA");
        System.out.println("=================");
        if(qtde == 0) {
            System.out.println("sacola vazia....");
            System.out.println("=================");
        }
        for (int i = 0; i < qtde; i++) {
            int codigo = sacola[i];
            System.out.println(i + " - [COD "+codigo+"] " + prods[codigo]);
        }
    }

    public static int imprimeMenu() {
        Scanner sc = new Scanner(System.in);
        int op = -1;

        while (op < 0 || op > 5) {
            System.out.println("MENU");
            System.out.println("=================");
            System.out.println("[1] - LISTAR PRODUTOS");
            System.out.println("[2] - LISTAR SACOLA");
            System.out.println("[3] - INSERIR NA SACOLA");
            System.out.println("[4] - REMOVER ITEM DA SACOLA");
            System.out.println("[5] - FINALIZAR");
            System.out.println("[0] - SAIR");
            System.out.println("DIGITE UMA OPÇÃO:");
            op = sc.nextInt();
            if(op < 0 || op > 5) {
                Screen.clear();
                System.out.println("OPÇÃO INVÁLIDA!");
            }        
        }
        return op;
    }

    public static void adicionarSacola() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual código adicionar na sacola?");
        int codigo = sc.nextInt();
        while(codigo < 0 || codigo > prods.length-1) {
            System.out.println("Codigo Inválido");
            System.out.println("Qual código adicionar na sacola?");
            codigo = sc.nextInt();
        }
        sacola[qtde] = codigo;
        qtde++;
    }

    public static void excluirSacola() {
        Scanner sc = new Scanner(System.in);
        imprimeSacola();
        System.out.println("Qual item quer excluir?");
        int pos = sc.nextInt();
        while(pos < 0 || pos > qtde-1) {
            System.out.println("Posição Inválida");
            System.out.println("Qual item quer excluir?");
            pos = sc.nextInt();
        }
        for(int i=pos; i < qtde; i++) {
            sacola[i] = sacola[i+1];
        }
        qtde--;
    }
}
