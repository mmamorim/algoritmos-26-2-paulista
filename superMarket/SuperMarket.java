package superMarket;

import aula06.Screen;

public class SuperMarket {
    
    public static void main(String[] args) {
        Screen.clear();

        //CadProduto cadastro = new CadProduto();
        //cadastro.menu();

        //CadCliente cadastro = new CadCliente();
        //cadastro.menu();
        
        MenuPrincipal menu = new MenuPrincipal();
        menu.mostrar();
    }
}
