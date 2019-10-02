package com.automatodfa.automatodfa.services;

import com.automatodfa.automatodfa.domain.Pedido;
import com.automatodfa.automatodfa.transicoes.Transicoes;

public class PagamentoRealizado implements Transicoes {

    @Override
    public Pedido realizarPedido(Pedido pedido) {
        pedido.setTransicoes(new PedidoNovo());
        System.out.println("Pedido Novo iniciado");
        return null;
    }

    @Override
    public void realizarPagamento(Pedido pedido) {
        System.out.println("ERRO: Pagamento já realizado");
    }

    @Override
    public void aprovar(Pedido pedido) {
        pedido.setTransicoes(new Aprovado());
        System.out.println("Pedido aprovado");
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
        System.out.println("ERRO: Pedido ainda não entregue");
    }

    @Override
    public void pender(Pedido pedido) {
        System.out.println("ERRO: Não é possível deixar o pedido pendente");
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setTransicoes(new Cancelado());
        System.out.println("Pedido cancelado");
    }
}
