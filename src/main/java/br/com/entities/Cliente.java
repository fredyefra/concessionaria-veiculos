package br.com.entities;

public class Cliente {

    private String nome;
    private String telefone;
    private String email;
    private EnderecoWrapper enderecoWrapper;

    public Cliente(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEnderecoWrapper(EnderecoWrapper enderecoWrapper) {
        this.enderecoWrapper = enderecoWrapper;
    }

    public EnderecoWrapper getEnderecoWrapper() {
        return enderecoWrapper;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", enderecoWrapper=" + enderecoWrapper +
                '}';
    }
}
