import java.util.Scanner;

public class JogoPalito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdePJ = 3, qtdePC = 3;
        int qtdePMaoJ = 0, qtdePMaoC = 0; 
        int chuteC = 0, chuteJ = 0;

        while(qtdePJ > 0 && qtdePC > 0) {

            System.out.println("----------");
            System.out.println("Jogador tem "+qtdePJ+" palitos!");
            System.out.println("Computador tem "+qtdePC+" palitos!");
            System.out.println("----------");

            System.out.println("Quantos palitos quer esconder?");
            qtdePMaoJ = sc.nextInt();

            qtdePMaoC = ((int)(Math.random()*100)) % (qtdePC+1);

            System.out.println("Qual seu chute?");
            chuteJ = sc.nextInt();
            chuteC = qtdePMaoC + ((int)(Math.random()*100)) % (qtdePJ+1);

            System.out.println("----------");
            System.out.println("Jogador chutou "+chuteJ);
            System.out.println("Computador escondeu "+qtdePMaoC+" palitos");
            System.out.println("Computador chutou "+chuteC);
            System.out.println("----------");

            if(qtdePMaoC+qtdePMaoJ == chuteJ) {
                System.out.println("Vc ACERTOU!");
                qtdePJ--;
            } else {
                if(qtdePMaoC+qtdePMaoJ == chuteC) {
                    System.out.println("COMPUTADOR ACERTOU!");
                    qtdePC--;
                } else {
                    System.out.println("NINGUÉM ACERTOU!");
                }
            }
        }

        System.out.println("TERMINOU");

    }
}