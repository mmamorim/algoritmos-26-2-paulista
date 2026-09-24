import java.util.Scanner;

public class JogoPalito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdePJ = 3, qtdePC = 3;
        int qtdePMaoJ = 0, qtdePMaoC = 0; 

        while(qtdePJ > 0 && qtdePC > 0) {

            System.out.println("----------");
            System.out.println("Jogador tem "+qtdePJ+" palitos!");
            System.out.println("Computador tem "+qtdePC+" palitos!");
            System.out.println("----------");

            System.out.println("Quantos palitos quer esconder?");
            qtdePMaoJ = sc.nextInt();

            qtdePMaoC = ((int)(Math.random()*100)) % (qtdePC+1);
            
        }

    }
}