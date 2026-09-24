import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String moedas[] = { "Dolar", "Euro", "Libras", "Iene" };
        double cotacao[] = { 5.18, 5.89, 6.85, 0.033 };

        for(int i=0; i < moedas.length; i++) {
            System.out.println("["+i+"] - MOEDA "+moedas[i]+"");
        }

        System.out.println("Qual moeda quer converter?");
        int op = sc.nextInt();
        System.out.println("Qual o valor em Real?");
        double valor = sc.nextDouble();
        double convercao = valor / cotacao[op];
        System.out.println("Valor convertido: R$ "+convercao);


    }
}
