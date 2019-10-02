package com.automatodfa.automatodfa.domain;

import com.automatodfa.automatodfa.services.Cancelado;
import com.automatodfa.automatodfa.services.Finalizado;
import com.automatodfa.automatodfa.services.PedidoNovo;
import com.automatodfa.automatodfa.transicoes.Transicoes;
import lombok.Data;

@Data
public class Pedido {

    private Transicoes transicoes = new PedidoNovo();

    public void realizarPedido(){
        transicoes.realizarPedido(this);
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
    }

    public void cancelar(){
        transicoes.cancelar(this);
    }

}
