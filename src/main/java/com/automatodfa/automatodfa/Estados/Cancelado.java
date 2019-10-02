package com.automatodfa.automatodfa.Estados;

import com.automatodfa.automatodfa.pedido.Pedido;
import com.automatodfa.automatodfa.transicoes.Transicoes;

public class Cancelado implements Transicoes {


    public void realizarPedido(Pedido pedido) {
        pedido.setTransicoes(new PedidoNovo());
        System.out.println("Pedido Novo iniciado");
    }


    public void realizarPagamento(Pedido pedido) {
        System.out.println("ERRO: Pedido cancelado");
    }


    public void aprovar(Pedido pedido) {
        System.out.println("ERRO: Pedido cancelado");
    }


    public void transportar(Pedido pedido) {
        System.out.println("ERRO: Pedido cancelado");
    }


    public void entregar(Pedido pedido) {
        System.out.println("ERRO: Pedido cancelado");
    }


    public void finalizar(Pedido pedido) {
        System.out.println("ERRO: Pedido cancelado");
    }


    public void pender(Pedido pedido) {
        System.out.println("ERRO: Pedido cancelado");
    }


    public void cancelar(Pedido pedido) {
        System.out.println("ERRO: Pedido já cancelado");
    }
}
