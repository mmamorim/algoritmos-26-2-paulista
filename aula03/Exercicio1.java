import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
        int notaA1, notaA2, notaA3;
        int media;

        System.out.println("Digite a nota A1:");
        notaA1 = leitor.nextInt();
        System.out.println("Digite a nota A2:");
        notaA2 = leitor.nextInt();
        System.out.println("Digite a nota A3:");
        notaA3 = leitor.nextInt();

        media = ((notaA1*30) + (notaA2*30) + (notaA3*40)) / 100;
        System.out.println("Sua média é: "+media);

    }
}
