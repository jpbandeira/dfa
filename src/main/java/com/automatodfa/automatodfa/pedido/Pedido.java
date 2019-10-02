package com.automatodfa.automatodfa.pedido;

import com.automatodfa.automatodfa.Estados.PedidoNovo;
import com.automatodfa.automatodfa.transicoes.Transicoes;


public class Pedido {

    private Transicoes transicoes = new PedidoNovo();
    //private boolean estadoFinal;

    public void realizarPedido(){
        transicoes.realizarPedido(this);
        //setEstadoFinal(false);
    }

    public void pender(){
        transicoes.pender(this);
    }

    public void realizarPagamento(){
        transicoes.realizarPagamento(this);
    }

    public void aprovar(){
        transicoes.aprovar(this);
    }

    public void transportar(){
        transicoes.transportar(this);
    }

    public void entregar(){
        transicoes.entregar(this);
    }

    public void finalizar(){
        transicoes.finalizar(this);
        //setEstadoFinal(true);
    }

    public void cancelar(){
        transicoes.cancelar(this);
        //setEstadoFinal(true);
    }

    public Transicoes getTransicoes() {
        return transicoes;
    }

    public void setTransicoes(Transicoes transicoes) {
        this.transicoes = transicoes;
    }

}
