import java.util.Scanner;

public class ExercicioTreino {

    public static void main(String[] args) {
     
        Scanner leitor = new Scanner(System.in); 
        int idade;
        String nome;
        
        System.out.println("Digite seu nome: ");
        nome = leitor.nextLine();
        
        System.out.println("O seu nome é "+nome);
        System.out.println("Olá "+nome+"😀 Tudo bem com vc?");
        
        System.out.println("Qual sua idade?");
        idade = leitor.nextInt();
        
        System.out.println("A sua idade é "+idade);
        
    }
}
