package br.com.senai.model;

import java.util.ArrayList;

public class Pedido {
    private String descricao;
    private String date;
    private double total;
    private ArrayList<ItensDoPedido> itens;


    public Pedido(){
        itens = new ArrayList<>();
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setItens(Produto produto, int qtde){
        ItensDoPedido item = new ItensDoPedido();
        item.setProduto(produto);
        item.setQtd(qtde);
        itens.add(item);

        total += produto.getPreco() * qtde;
    }




    @Override
    public String toString() {
        return  "\ndescricao:" + descricao +
                "\ndate:" + date +
                "\ntotal:" + total +
                "\nitensPedido:" + itens;
    }
}
