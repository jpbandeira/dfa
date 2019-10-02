package com.automatodfa.automatodfa.Estados;

import com.automatodfa.automatodfa.pedido.Pedido;
import com.automatodfa.automatodfa.transicoes.Transicoes;


public class Finalizado implements Transicoes {


    public void realizarPedido(Pedido pedido) {
        pedido.setTransicoes(new PedidoNovo());
        System.out.println("Pedido novo iniciado");
    }


    public void realizarPagamento(Pedido pedido) {
        System.out.println("ERRO: Pagamento já realizado");
    }


    public void aprovar(Pedido pedido) {
        System.out.println("ERRO: Pedido já aprovado");
    }


    public void transportar(Pedido pedido) {
        System.out.println("ERRO: Pedido já transportado");
    }


    public void entregar(Pedido pedido) {
        System.out.println("ERRO: Pedido já entregue");
    }


    public void finalizar(Pedido pedido) {
        System.out.println("ERRO: Pedido já finalizado");
    }


    public void pender(Pedido pedido) {
        System.out.println("ERRO: Não é possível deixar o pedido pendente");
    }


    public void cancelar(Pedido pedido) {
        System.out.println("ERRO: Não é possível cancelar um pedido depois de finalizado");
    }
}
