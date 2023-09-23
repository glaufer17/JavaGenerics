package modelo;

import java.time.LocalDate;
import util.DateUtils;

public class Pessoa implements IExibirInformacoes, IChaveConsulta, Comparable<Pessoa> {
    private String nome;
    private String cpf;
    private LocalDate dataNacimento;
    private String email;
    private Endereco endereco;

    public Pessoa() {
        endereco = new Endereco();
    }

    public Pessoa(String nome, String cpf, LocalDate dataNacimento, String email, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNacimento = dataNacimento;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(LocalDate dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public long getIdade() {
        return DateUtils.quantidadeAnosEntreDatas(dataNacimento, LocalDate.now());
    }
    
    @Override
    public String getInformacoes() {
        return "";
    }

    @Override
    public void exibirInformacoes() {
        getInformacoes();
    }

    @Override
    public String chaveConsulta() {
        return getCpf();
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.nome.compareToIgnoreCase(o.getNome());
    }    

    
}

