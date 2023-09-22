package cadastro;

import generico.MinhaLista;
import modelo.Pessoa;


public class CadastrarPessoa {
    private static MinhaLista<Pessoa> listaPessoas = new MinhaLista<>();;

    public static void cadastrar(int id, String nome, int idade) {
        
        Pessoa pessoa = new Pessoa(id, nome, idade);
        listaPessoas.add(pessoa);
    }

    public static void pesquisar(int id) {
        Pessoa pessoa = listaPessoas.pesquisar(id); 
        if (pessoa != null) {
            pessoa.exibirInformacoes();
        }else {
            System.out.println("Nenhuma informacao encotrada!\n");
        }
    }

    public static void editar(int id, String novoNome, int novaIdade) {
        Pessoa pessoa = listaPessoas.pesquisar(id);
        if (pessoa != null) {
            pessoa.setNome(novoNome);
            pessoa.setIdade(novaIdade);
        }
    }

    public static void remover(int id) {
        Pessoa pessoa = listaPessoas.pesquisar(id);
        if (pessoa != null) {
            listaPessoas.remove(pessoa);
        }
    }
    
    public static void ordenar() {
    listaPessoas.ordenar();
    System.out.println("Lista ordenada:");
    listaPessoas.exibirLista();
}
    
    public static void ordenarDecrescnte() {
    listaPessoas.ordenarDecrescente();
    System.out.println("Lista ordenada em ordem decrescente:");
    listaPessoas.exibirLista();
}

    public static void filtrar(int idade) {
        MinhaLista<Pessoa> pessoasFiltradas = new MinhaLista<>();
        for (Pessoa pessoa : listaPessoas) {
            if (pessoa.getIdade() == idade) {
                pessoasFiltradas.add(pessoa);
            }
        }

        if (pessoasFiltradas.isEmpty()) {
            System.out.println("Nenhuma informação encontrada para a idade " + idade);
        } else {
            System.out.println("Pessoas com idade " + idade + ":");
            pessoasFiltradas.exibirLista();
        }
    }
    
    public static void listar() {
    System.out.println("Lista de Pessoas:");
    listaPessoas.exibirLista();
    }
    
}
