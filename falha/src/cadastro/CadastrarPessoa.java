package cadastro;

import generico.MinhaLista;
import modelo.Pessoa;
import util.DialogBoxUtils;
import util.Input;


public class CadastrarPessoa implements ICadastro {
    private static MinhaLista<Pessoa> listaPessoas = new MinhaLista<>();
    
    protected static void cadastrarPessoa(Pessoa p) {
        System.out.println("Nome: ");
        p.setNome(Input.nextLine());
        System.out.println("Cpf: ");
        p.setCpf(Input.nextLine());
        System.out.println("Email: ");
        p.setEmail(Input.nextLine());
        System.out.println("Data de Nacimento: ");
        p.setDataNacimento(Input.nextLocalDate());
        CadastrarEndereco.cadastrarEndereco(p.getEndereco());
    }
    @Override
    public void cadastrar() {
        try {
            Pessoa p = new Pessoa();
            cadastrarPessoa(p);
            listaPessoas.add(p);
            DialogBoxUtils.exibirMensagem("Cadastro realizado", "O cadastro realizado com sucesso!");
        } catch (Exception e) {
            DialogBoxUtils.exibirMensagemDeErro("Falha no cadastro", "Erro! falha ao cadastrar dados!\n");
        }
    }

    @Override
    public void pesquisar() {
        System.out.println("Digite o Cpf: ");
        String cpf = Input.nextLine();
        Pessoa pessoa = listaPessoas.pesquisar(cpf);
        if (pessoa != null) {
            pessoa.exibirInformacoes();
        }else {
            DialogBoxUtils.exibirMensagemDeErro("Falha na busca", "Nenhuma informação encontrada!\n");
        }
    }

    @Override
    public void alterar() {
        System.out.println("Digite o Cpf: ");
        String cpf = Input.nextLine();
        Pessoa pessoa = listaPessoas.pesquisar(cpf);
        if (pessoa != null) {
            cadastrarPessoa(pessoa);
            DialogBoxUtils.exibirMensagem("Cadastro alterado", "O cadastro foi alterado com sucesso!");
        }else {
            DialogBoxUtils.exibirMensagemDeErro("Falha ao alterar o cadastro", "Erro! falha ao alterar dados!\n");
        }
    }

    @Override
    public void remover() {
        System.out.println("Digite o Cpf: ");
        String cpf = Input.nextLine();
        Pessoa pessoa = listaPessoas.pesquisar(cpf);
        if (pessoa != null) {
            listaPessoas.remove(pessoa);
            DialogBoxUtils.exibirMensagem("Removida com sucesso", "Pessoa removide com sucesso");
        }else {
            DialogBoxUtils.exibirMensagemDeErro("Falha na busca", "Nenhuma informação encontrada!\n");
        }
    }

    @Override
    public void ordenarC() {
        listaPessoas.ordenar();
        DialogBoxUtils.exibirMensagem("Lista Ordenada","Lista ordenade de forma crescente");
    }

    @Override
    public void ordenarD() {
        listaPessoas.ordenarDecrescente();
        DialogBoxUtils.exibirMensagem("Lista Ordenada", "Lista ordenade de forma decrescente");
    }

    @Override
    public void filtrar() {
        System.out.println("Filtrar por Idade");
        System.out.println("Digite uma Idade:");
        long idade = Input.nextInt();
        MinhaLista<Pessoa> pessoasFiltradas = new MinhaLista<>();
        for (Pessoa pessoas : listaPessoas) {
            if (pessoas.getIdade() == idade){
                pessoasFiltradas.add(pessoas);
            }
        }
        
        if (pessoasFiltradas.isEmpty()) {
            System.out.println("Nenhuma informação encontrada para a idade " + idade+ "anos");
        } else {
            System.out.println("Pessoas com " + idade + " anos");
            pessoasFiltradas.exibirLista();
        }
    }

    @Override
    public void listar() {
        System.out.println("Lista de Pessoas:");
        listaPessoas.exibirLista();
    }
    

   /* public static void cadastrar(int id, String nome, int idade) {
        
        Pessoa pessoa = new Pessoa(nome, nome, LocalDate.MIN, nome);
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
    }*/

}
