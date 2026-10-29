package aula08;

import aula06.Screen;

public class ProgAula08 {
    
    public static void main(String[] args) {
        Screen.clear();

        ListaProdutos listaProd = new ListaProdutos();

        listaProd.adiciona(new Produto("Feijão",23.0));
        listaProd.adiciona(new Produto("Arroz",23.0));
        listaProd.adiciona(new Produto("Batata",23.0));
        listaProd.adiciona(new Produto("Alface",14.0));

        listaProd.imprime();
    }
}
