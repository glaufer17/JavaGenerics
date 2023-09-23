package principal;

import cadastro.CadastrarPessoa;
import util.DialogBoxUtils;
import util.Input;

public class MenuEx {
    
    public static int menu(){
        
        int op;
        
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
        
            case 1 -> cadastrarPessoa();
            
            case 2 -> atualixarPessoa();
            
            case 3 -> removerPessoa();
            
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
            case 1 -> listarPessoa();
            
            case 2 -> pesquisarPessoa();
            
            case 3 -> ordenarCrescenteP();
            
            case 4 -> ordenarDecrescenteP();
            
            case 5 -> filtrarP();
            
            case 0 -> sair();
            
            default -> erro();
        }
    }

    private static void cadastrarPessoa() {
        CadastrarPessoa cp = new CadastrarPessoa();
        cp.cadastrar();
    }

    private static void atualixarPessoa() {
        CadastrarPessoa cp = new CadastrarPessoa();
        cp.alterar();
    }

    private static void removerPessoa() {
         CadastrarPessoa cp = new CadastrarPessoa();
         cp.remover();
    }
    
    private static void listarPessoa() {
        CadastrarPessoa cp = new CadastrarPessoa();
        cp.listar();
    }

    private static void pesquisarPessoa() {
        CadastrarPessoa cp = new CadastrarPessoa();
        cp.pesquisar();
    }

    private static void ordenarCrescenteP() {
        CadastrarPessoa cp = new CadastrarPessoa();
        cp.ordenarC();
    }

    private static void ordenarDecrescenteP() {
        CadastrarPessoa cp = new CadastrarPessoa();
        cp.ordenarD();
    }

    private static void filtrarP() {
        CadastrarPessoa cp = new CadastrarPessoa();
        cp.filtrar();
    }
    
    public static void sair(){
        menu();
    }
    
    public static void sairMenu(){
        DialogBoxUtils.exibirMensagem("Saindo...", "Fechando o Sistema!");
        System.exit(0);
    }
    
    public static int erro() {
        DialogBoxUtils.exibirMensagem("Opcao invalida", "Escolha entre uma das opcoes existentes!");
        return 0;
    }
   
    
    /*public static void cadastro() {
        CadastrarPessoa.cadastro();
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
    }*/

    
    
}
