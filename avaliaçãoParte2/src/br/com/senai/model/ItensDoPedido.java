package br.com.senai.model;

public class ItensDoPedido {
    private Produto produto;
    private int qtd;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "\n\nproduto:" + produto +
                "\nqtd:" + qtd;
    }
}
