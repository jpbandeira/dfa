package com.automatodfa.automatodfa.services;

import com.automatodfa.automatodfa.domain.Pedido;
import com.automatodfa.automatodfa.transicoes.Transicoes;
import lombok.Data;

@Data
public class PedidoNovo implements Transicoes {

    private String printEstado;

    public Pedido realizarPedido(Pedido pedido) {
        pedido.setTransicoes(new PedidoNovo());
        setPrintEstado("Pedido iniciado com sucesso");
        System.out.println("Pedido Novo iniciado");
        return pedido;
    }

    public void pender(Pedido pedido) {
        System.out.println("Pedido pendente");
        pedido.setTransicoes(new Pendente());
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

    @Override
    public String toString() {
        return "PedidoNovo{" +
                "printEstado='" + printEstado + '\'' +
                '}';
    }
}
