package aula06;

public class Aula06 {
    
    public static void main(String[] args) {
     
        encontro("Ana","Bia");
        
    }

    public static void bomDia(String nome) {
        System.out.println("Bom dia "+nome);
    }

    public static void tchau(String nome) {
        System.out.println("Tchau "+nome+" Até logo!");
    }

    public static void encontro(String nome1, String nome2) {
        bomDia(nome1);
        tchau(nome2);
    }


}
