package aula04;

import java.util.Scanner;

public class Aula4Ex2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double peso, altura, imc;

        System.out.println("Digite seu Peso:");
        peso = leitor.nextDouble();
        System.out.println("Digite a sua Altura:");
        altura = leitor.nextDouble();

        imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);

        if (imc <= 18.5) {
            System.out.println("MAGRO");
        } else {
            if (imc <= 25) {
                System.out.println("NORMAL");
            } else {
                if (imc <= 30) {
                    System.out.println("SOBREPESO");
                } else {
                    System.out.println("OBESO");
                }
            }
        }
        
    }
}
