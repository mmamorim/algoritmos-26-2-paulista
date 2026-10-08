package aula07;

import java.util.Scanner;

public class Sacola {
    static String prods[] = { "Feijão", "Batata", "Alface", "Arroz" };
    static int sacola[] = new int[1000];
    static int qtde = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Screen.clear();

        int op = imprimeMenu();
        //System.out.println("VC digitou: " + op);

        while (op > 0) {
            if(op == 1) {
                imprimeProdutos();
                System.out.println("digite alguma tecla para continuar...");
                sc.nextLine();
            }
            if(op == 2) {
                imprimeSacola();
                System.out.println("digite alguma tecla para continuar...");
                sc.nextLine();
            }
            if(op == 3) {
                adicionarSacola();
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
            System.out.println(i + " - " + prods[codigo]);
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

    }
}
