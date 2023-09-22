package principal;

import cadastro.CadastrarPessoa;
import util.Input;

public class Menu {
    
    public static int menu(){
        
        int op = 0;
        
        do{            
            System.out.println("_____MENU_____");
            System.out.println("1 - Cadastrar\n2 - Listar\n0 - sair");
            op = Input.nextInt();

            switch (op) {

                case 1 -> menuCadastro();

                case 2 -> menuLista();
                
                case 0 -> sairMenu();

                default -> erro();
            }
        }while(op != 0);
        return 0;
    }
    
    public static void menuCadastro(){
        
        int op;
        
        System.out.println("_____MENU CADASTRO_____");
        System.out.println("Opcoes:");
        System.out.println("1 - Cadastrar\n2 - Editar\n3 - Remover\n0 - Sair");
        op = Input.nextInt();
        
        switch (op) {
        
            case 1 -> cadastro();
            
            case 2 -> editar();
            
            case 3 -> remover();
            
            case 0 -> sair();
            
            default -> erro();
        }
        
    }
    
    public static void menuLista(){
        
        int op;
        
        System.out.println("_____MENU LISTA_____");
        System.out.println("Opcoes:");
        System.out.println("1 - Listar\n2 - Pesquisar\n3 - Ordenar Crescente\n4 - Ordenar Decrescente\n5 - Filtrar\n0 - Sair");
        op = Input.nextInt();
        
        switch(op) {
            case 1 -> listar();
            
            case 2 -> pesquisar();
            
            case 3 -> ordenarCrescente();
            
            case 4 -> ordenarDecrescente();
            
            case 5 -> filtrar();
            
            case 0 -> sair();
            
            default -> erro();
        }
    }
    
    public static void cadastro() {
        System.out.print("ID: ");
        int id = Input.nextInt();
        System.out.print("Nome: ");
        String nome = Input.nextLine();
        System.out.print("Idade: ");
        int idade = Input.nextInt();

        CadastrarPessoa.cadastrar(id, nome, idade);
        System.out.println("Pessoa cadastrada!");
    }
    
    public static void editar() {
        System.out.print("ID: ");
        int id = Input.nextInt();
        System.out.print("Nome: ");
        String nome = Input.nextLine();
        System.out.print("Idade: ");
        int idade = Input.nextInt();
        CadastrarPessoa.editar(id, nome, idade);
    }
    
    public static void remover() {
        System.out.print("ID: ");
        int id = Input.nextInt();
        
        CadastrarPessoa.remover(id);
    }
    
    public static int erro() {
        System.out.println("Opcao nao existe");
        return 0;
    }
    
    public static void listar() {
        CadastrarPessoa.listar();
    }
    
    public static void pesquisar() {
        System.out.print("ID: ");
        int id = Input.nextInt();
        
        CadastrarPessoa.pesquisar(id);
    }
    
    public static void ordenarCrescente(){
        CadastrarPessoa.ordenar();
    }
    
    public static void ordenarDecrescente() {
        CadastrarPessoa.ordenarDecrescnte();
    }
    
    public static void filtrar() {
        System.out.print("Idade: ");
        int idade = Input.nextInt();
        
        CadastrarPessoa.filtrar(idade);
    }
    
    public static void sair(){
        menu();
    }
    
    public static void sairMenu(){
        System.out.println("Saindo...");
        System.exit(0);
    }
}
