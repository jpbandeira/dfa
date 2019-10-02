package com.automatodfa.automatodfa.services;

import com.automatodfa.automatodfa.domain.Pedido;
import com.automatodfa.automatodfa.transicoes.Transicoes;
import lombok.Data;

@Data
public class Cancelado implements Transicoes {

    @Override
    public Pedido realizarPedido(Pedido pedido) {
        pedido.setTransicoes(new PedidoNovo());
        System.out.println("Pedido Novo iniciado");
        return null;
    }

    @Override
    public void realizarPagamento(Pedido pedido) {
        System.out.println("ERRO: Pedido cancelado");
    }

    @Override
    public void aprovar(Pedido pedido) {
        System.out.println("ERRO: Pedido cancelado");
    }

    @Override
    public void transportar(Pedido pedido) {
        System.out.println("ERRO: Pedido cancelado");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("ERRO: Pedido cancelado");
    }

    @Override
    public void finalizar(Pedido pedido) {
        System.out.println("ERRO: Pedido cancelado");
    }

    @Override
    public void pender(Pedido pedido) {
        System.out.println("ERRO: Pedido cancelado");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("ERRO: Pedido já cancelado");
    }
}
