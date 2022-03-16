package br.senai.model;

public class Cliente {
    private String nome;
    private String CPF;
    private String telefone;
    private String email;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
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

    @Override
    public String toString() {
        return  "\n" + nome +
                "\nCPF: " + CPF + '\'' +
                "\nTelefone: " + telefone +
                "\nEmail: " + email;
    }
}


