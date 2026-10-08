package aula06;

import java.util.Scanner;

public class Sacola {
    static String prods[] = { "Feijão", "Batata", "Alface", "Arroz" };
    static int sacola[] = new int[1000];
    static int qtde = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Screen.clear();
        imprimeProdutos();
        System.out.println("Qual código adicionar na sacola? (-1 p/ sair)");
        int codigo = sc.nextInt();
        while (codigo >= 0) {
            sacola[qtde] = codigo;
            qtde++;
            Screen.clear();
            imprimeProdutos();
            System.out.println("Qual código adicionar na sacola? (-1 p/ sair)");
            codigo = sc.nextInt();
        }
        imprimeSacola();

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
        for (int i = 0; i < qtde; i++) {
            int codigo = sacola[i];
            System.out.println(i + " - " + prods[codigo]);
        }
    }
}
