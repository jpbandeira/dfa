package com.automatodfa.automatodfa;

import com.automatodfa.automatodfa.pedido.Pedido;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.pender();
        pedido.realizarPagamento();
        pedido.aprovar();
        pedido.transportar();
        pedido.entregar();
        pedido.finalizar();
    }
}
