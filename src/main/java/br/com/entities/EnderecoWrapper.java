package br.com.entities;

public class EnderecoWrapper {

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;


    public EnderecoWrapper() {
        // TODO Auto-generated constructor stub
    }

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return " CEP: " + this.cep + " - "+" LOGRADOURO: " + this.logradouro + this.complemento +  " - "+"  BAIRRO: " + this.bairro ;
    }


}
