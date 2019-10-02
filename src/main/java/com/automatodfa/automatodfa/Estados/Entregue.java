package com.automatodfa.automatodfa.Estados;

import com.automatodfa.automatodfa.pedido.Pedido;
import com.automatodfa.automatodfa.transicoes.Transicoes;

public class Entregue implements Transicoes {

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
        System.out.println("ERRO: Pedido já transportado");
    }


    public void entregar(Pedido pedido) {
        System.out.println("ERRO: Pedido já entregue");
    }


    public void finalizar(Pedido pedido) {
        pedido.setTransicoes(new Finalizado());
        System.out.println("Pedido finalizado com sucesso");
    }


    public void pender(Pedido pedido) {
        System.out.println("ERRO: Não é possível deixar o pedido pendente");
    }


    public void cancelar(Pedido pedido) {
        System.out.println("ERRO: Depois de entregue, não é possivel cancelar um pedido");
    }
}
