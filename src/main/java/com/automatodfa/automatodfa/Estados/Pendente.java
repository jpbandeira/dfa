package com.automatodfa.automatodfa.Estados;

import com.automatodfa.automatodfa.pedido.Pedido;
import com.automatodfa.automatodfa.transicoes.Transicoes;

public class Pendente implements Transicoes {


    public void realizarPedido(Pedido pedido) {
        pedido.setTransicoes(new PedidoNovo());
        System.out.println("Pedido Novo iniciado");
    }


    public void realizarPagamento(Pedido pedido) {
        pedido.setTransicoes(new PagamentoRealizado());
        System.out.println("Pagamento realizado");
    }


    public void aprovar(Pedido pedido) {
        System.out.println("ERRO: Pagamento não realizado ainda");
    }


    public void transportar(Pedido pedido) {
        System.out.println("ERRO: Pedido ainda não aprovado");
    }


    public void entregar(Pedido pedido) {
        System.out.println("ERRO: Pedido não saiu para entrega ainda");
    }


    public void finalizar(Pedido pedido) {
        System.out.println("ERRO: Pedido não entrege ainda");
    }


    public void pender(Pedido pedido) {
        System.out.println("ERRO: Pedido já pendente");
    }


    public void cancelar(Pedido pedido) {
        pedido.setTransicoes(new Cancelado());
        System.out.println("Pedido cancelado com sucesso");
    }
}
