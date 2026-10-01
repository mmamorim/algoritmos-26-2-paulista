package aula06;

public class Conversa {

    public static void bomDia(String nome) {
        System.out.println("Bom dia " + nome);
    }

    public static void tchau(String nome) {
        System.out.println("Tchau " + nome + " Até logo!");
    }

    public static void encontro(String nome1, String nome2) {
        bomDia(nome1);
        tchau(nome2);
    }
}
