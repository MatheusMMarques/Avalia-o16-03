package br.senai.model;

import br.senai.model.Cliente;

import java.util.ArrayList;

public class Evento {
    private String nome;
    private String data;
    private ArrayList<Cliente> clientes;

    public Evento()    {
        clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public void setCliente (String nome, String CPF, String telefone, String Email) {
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCPF(CPF);
        cliente.setEmail(Email);
        cliente.setTelefone(telefone);

        clientes.add(cliente);

    }

    @Override
    public String toString() {
        return "\nEvento: " + nome +
                "\nData: " + data + '\'' +
                "\nClientes: " + clientes;
    }
}
