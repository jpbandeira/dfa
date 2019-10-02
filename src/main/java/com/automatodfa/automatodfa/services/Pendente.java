package com.automatodfa.automatodfa.services;

import com.automatodfa.automatodfa.domain.Pedido;
import com.automatodfa.automatodfa.transicoes.Transicoes;

public class Pendente implements Transicoes {

    @Override
    public Pedido realizarPedido(Pedido pedido) {
        pedido.setTransicoes(new PedidoNovo());
        System.out.println("Pedido Novo iniciado");
        return null;
    }

    @Override
    public void realizarPagamento(Pedido pedido) {
        pedido.setTransicoes(new PagamentoRealizado());
        System.out.println("Pagamento realizado");
    }

    @Override
    public void aprovar(Pedido pedido) {
        System.out.println("ERRO: Pagamento não realizado ainda");
    }

    @Override
    public void transportar(Pedido pedido) {
        System.out.println("ERRO: Pedido ainda não aprovado");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("ERRO: Pedido não saiu para entrega ainda");
    }

    @Override
    public void finalizar(Pedido pedido) {
        System.out.println("ERRO: Pedido não entrege ainda");
    }

    @Override
    public void pender(Pedido pedido) {
        System.out.println("ERRO: Pedido já pendente");
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setTransicoes(new Cancelado());
        System.out.println("Pedido cancelado com sucesso");
    }
}
