import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
        double peso, altura, imc;

        System.out.println("Digite seu Peso:");
        peso = leitor.nextDouble();
        System.out.println("Digite a sua Altura:");
        altura = leitor.nextDouble();

        imc = peso / (altura * altura);
        System.out.println("Seu IMC é: "+imc);

    }
}
