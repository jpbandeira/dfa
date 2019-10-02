package com.automatodfa.automatodfa.services;

import com.automatodfa.automatodfa.domain.Pedido;
import com.automatodfa.automatodfa.transicoes.Transicoes;

public class Entregue implements Transicoes {

    private Finalizado finalizado;

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
        pedido.setTransicoes(new Finalizado());
        System.out.println("Pedido finalizado com sucesso");
    }

    @Override
    public void pender(Pedido pedido) {
        System.out.println("ERRO: Não é possível deixar o pedido pendente");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("ERRO: Depois de entregue, não é possivel cancelar um pedido");
    }
}
