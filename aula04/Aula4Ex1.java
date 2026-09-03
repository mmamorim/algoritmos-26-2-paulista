package aula04;

import java.util.Scanner;

public class Aula4Ex1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double salario;

        System.out.println("Digite o salário:");
        salario = leitor.nextDouble();

        // if(salario < 2000) {
        // salario = salario * 1.5;
        // }
        // if(salario >= 2000 && salario < 5000) {
        // salario = salario * 1.2;
        // }
        // if(salario >= 5000) {
        // salario = salario * 1.1;
        // }

        if (salario < 2000) {
            salario = salario * 1.5;
        } else {
            if (salario < 5000) {
                salario = salario * 1.2;
            } else {
                salario = salario * 1.1;
            }
        }

        System.out.println("Seu salário reakustado é: R$ " + salario);
    }
}
