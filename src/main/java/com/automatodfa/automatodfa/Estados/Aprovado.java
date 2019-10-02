package com.automatodfa.automatodfa.Estados;

import com.automatodfa.automatodfa.pedido.Pedido;
import com.automatodfa.automatodfa.transicoes.Transicoes;

public class Aprovado implements Transicoes {


    public void realizarPedido(Pedido pedido) {
        pedido.setTransicoes(new PedidoNovo());
        System.out.println("Pedido Novo iniciado");
    }


    public void realizarPagamento(Pedido pedido) {
        System.out.println("ERRO: Pagamento já realizado");
    }


    public void aprovar(Pedido pedido) {
        System.out.println("ERRO: Pedido já aprovado");
    }


    public void transportar(Pedido pedido) {
        pedido.setTransicoes(new Transportado());
        System.out.println("Transportado com sucesso");
    }


    public void entregar(Pedido pedido) {
        System.out.println("ERRO: Pedido ainda não transportado");
    }


    public void finalizar(Pedido pedido) {
        System.out.println("ERRO: Pedido ainda não entregue");
    }


    public void pender(Pedido pedido) {
        System.out.println("ERRO: Não é possível deixar o pedido pendente");
    }


    public void cancelar(Pedido pedido) {
        pedido.setTransicoes(new Cancelado());
        System.out.println("Pedido cancelado com sucesso");
    }
}
