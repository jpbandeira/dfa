package com.automatodfa.automatodfa.services;

import com.automatodfa.automatodfa.domain.Pedido;
import com.automatodfa.automatodfa.transicoes.Transicoes;
import lombok.Data;

@Data
public class Finalizado implements Transicoes {

    @Override
    public Pedido realizarPedido(Pedido pedido) {
        pedido.setTransicoes(new PedidoNovo());
        System.out.println("Pedido novo iniciado");
        return null;
    }

    @Override
    public void realizarPagamento(Pedido pedido) {
        System.out.println("ERRO: Pagamento já realizado");
    }

    @Override
    public void aprovar(Pedido pedido) {
        System.out.println("ERRO: Pedido já aprovado");
    }

    @Override
    public void transportar(Pedido pedido) {
        System.out.println("ERRO: Pedido já transportado");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("ERRO: Pedido já entregue");
    }

    @Override
    public void finalizar(Pedido pedido) {
        System.out.println("ERRO: Pedido já finalizado");
    }

    @Override
    public void pender(Pedido pedido) {
        System.out.println("ERRO: Não é possível deixar o pedido pendente");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("ERRO: Não é possível cancelar um pedido depois de finalizado");
    }
}
