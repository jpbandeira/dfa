package com.automatodfa.automatodfa.transicoes;

import com.automatodfa.automatodfa.pedido.Pedido;

public interface Transicoes {
    void realizarPedido(Pedido pedido);
    void realizarPagamento(Pedido pedido);
    void aprovar(Pedido pedido);
    void transportar(Pedido pedido);
    void entregar(Pedido pedido);
    void finalizar(Pedido pedido);
    void pender(Pedido pedido);
    void cancelar(Pedido pedido);

}