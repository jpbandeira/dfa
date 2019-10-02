package com.automatodfa.automatodfa.Estados;

import com.automatodfa.automatodfa.pedido.Pedido;
import com.automatodfa.automatodfa.transicoes.Transicoes;

public class PagamentoRealizado implements Transicoes {


    public void realizarPedido(Pedido pedido) {
        pedido.setTransicoes(new PedidoNovo());
        System.out.println("Pedido Novo iniciado");
    }


    public void realizarPagamento(Pedido pedido) {
        System.out.println("ERRO: Pagamento já realizado");
    }


    public void aprovar(Pedido pedido) {
        pedido.setTransicoes(new Aprovado());
        System.out.println("Pedido aprovado");
    }


    public void transportar(Pedido pedido) {
        System.out.println("ERRO: Pedido ainda não aprovado");
    }


    public void entregar(Pedido pedido) {
        System.out.println("ERRO: Pedido não saiu para entrega ainda");
    }


    public void finalizar(Pedido pedido) {
        System.out.println("ERRO: Pedido ainda não entregue");
    }


    public void pender(Pedido pedido) {
        System.out.println("ERRO: Não é possível deixar o pedido pendente");
    }


    public void cancelar(Pedido pedido) {
        pedido.setTransicoes(new Cancelado());
        System.out.println("Pedido cancelado");
    }
}
