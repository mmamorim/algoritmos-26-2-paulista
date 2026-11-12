package superMarket;

import java.util.Scanner;

public class Cliente {
    String nome;
    String cpf;
    String email;
    String telefone;

    public Cliente() {

    }
    
    public Cliente(String cpf, String nome, String email, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public void imprime() {
        System.out.println(" CPF: "+cpf+" nome: "+nome+" "+"email: "+email);
    }

    public void imprime(int codigo) {
        System.out.println("COD: "+codigo+" CPF: "+cpf+" nome: "+nome+" "+"email: "+email);
    }

    public void lerDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("LER DADOS DO CLIENTE");
        System.out.println("====================");
        System.out.println("Qual o CPF?");
        this.cpf = sc.nextLine();
        System.out.println("Qual o nome?");
        this.nome = sc.nextLine();
        System.out.println("Qual o email?");
        this.email = sc.nextLine();
        System.out.println("Qual o telefone?");
        this.telefone = sc.nextLine();
    }
}
