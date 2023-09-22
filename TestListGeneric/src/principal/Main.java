package principal;

import cadastro.CadastrarPessoa;

public class Main {

    public static void main(String[] args) {
        
        Menu.menu();
        
        CadastrarPessoa.cadastrar(1, "geovane", 22);
        CadastrarPessoa.cadastrar(2, "mateus", 20);
        CadastrarPessoa.cadastrar(3,"kaique",19);
               
    }
    
}
