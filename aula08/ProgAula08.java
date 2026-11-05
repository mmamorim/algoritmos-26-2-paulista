package aula08;

import java.util.Scanner;
import aula06.Screen;

public class ProgAula08 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Screen.clear();

        CadProduto cadastro = new CadProduto();

        cadastro.menu();
    }
}
