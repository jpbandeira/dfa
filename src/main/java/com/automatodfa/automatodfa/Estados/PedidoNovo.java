package com.automatodfa.automatodfa.Estados;

import com.automatodfa.automatodfa.pedido.Pedido;
import com.automatodfa.automatodfa.transicoes.Transicoes;

public class PedidoNovo implements Transicoes {

    public void realizarPedido(Pedido pedido) {
        pedido.setTransicoes(new PedidoNovo());
        System.out.println("Pedido Novo iniciado");
    }

    public void pender(Pedido pedido) {
        pedido.setTransicoes(new Pendente());
        System.out.println("Pedido pendente");
    }

    public void realizarPagamento(Pedido pedido) {
        System.out.println("ERRO: Não é possivel realizar pagamento ainda");
    }

    public void aprovar(Pedido pedido) {
        System.out.println("ERRO: Pagamento ainda não realizado");
    }

    public void transportar(Pedido pedido) {
        System.out.println("ERRO: Pedido não aprovado");
    }

    public void entregar(Pedido pedido) {
        System.out.println("ERRO: Pedido não transportado ainda");
    }

    public void finalizar(Pedido pedido) {
        System.out.println("ERRO: Pedido não aprovado e não saiu para entrega");
    }

    public void cancelar(Pedido pedido) {
        System.out.println("ERRO: Não é possivel cancelar um pedido sem antes ficar pendente");
    }
}
