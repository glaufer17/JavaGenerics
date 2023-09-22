package modelo;

public class Pessoa implements IExibirInformacoes, IChaveConsulta, Comparable<Pessoa> {
    private int id;
    private String nome;
    private int idade;

    public Pessoa(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void exibirInformacoes() {
        
        System.out.print( "\nID: " + id + "\nNome: " + nome + "\nIdade: " + idade + "\n");
    }

    @Override
    public Integer chaveConsulta() {
        return getId();
    }

    @Override
    public int compareTo(Pessoa o) {
        int comparacaoIdade = Integer.compare(this.idade, o.idade);

        if (comparacaoIdade != 0) {
            // Se as idades forem diferentes, retorne a comparação das idades
            return comparacaoIdade;
        } else {
            // Se as idades forem iguais, compare pelo nome
            return this.nome.compareTo(o.nome);
        }
    }    
    
}

