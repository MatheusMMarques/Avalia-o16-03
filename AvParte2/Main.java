package br.com.senai;

import br.com.senai.model.ItensDoPedido;
import br.com.senai.model.Pedido;
import br.com.senai.model.Produto;

public class Main {
    public static void main(String[] args) {

        Produto p = new Produto();
        p.setNome("camisa");
        p.setPreco(20);


        Produto p1 = new Produto();
        p1.setNome("chinelo");
        p1.setPreco(25);


        Produto p2 = new Produto();
        p2.setNome("bermuda");
        p2.setPreco(50);

        Produto p3 = new Produto();
        p3.setNome("casaco");
        p3.setPreco(100);

        Produto p4 = new Produto();
        p4.setNome("corta-vento");
        p4.setPreco(120);

        Produto p5 = new Produto();
        p5.setNome("tenis");
        p5.setPreco(200);

        Produto p6 = new Produto();
        p6.setNome("luvas");
        p6.setPreco(35);

        Produto p7 = new Produto();
        p7.setNome("meias");
        p7.setPreco(15);

        Produto p8 = new Produto();
        p8.setNome("calsa");
        p8.setPreco(70);

        Produto p9 = new Produto();
        p9.setNome("boné");
        p9.setPreco(40);

        Produto p10 = new Produto();
        p10.setNome("moletom");
        p10.setPreco(150);

        Pedido pedido = new Pedido();
        pedido.setDate("24/05");
        pedido.setDescricao("Compre aqui!");
        pedido.setItens(p, 2);
        pedido.setItens(p1, 2);
        pedido.setItens(p2, 6);
        pedido.setItens(p3, 1);
        pedido.setItens(p4, 7);
        pedido.setItens(p5, 2);
        pedido.setItens(p6, 1);
        pedido.setItens(p7, 5);
        pedido.setItens(p8, 7);
        pedido.setItens(p9, 9);
        pedido.setItens(p10, 10);
        System.out.println(pedido);
    }
}
