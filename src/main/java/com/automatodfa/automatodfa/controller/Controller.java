package com.automatodfa.automatodfa.controller;

import com.automatodfa.automatodfa.domain.Pedido;
import com.fasterxml.jackson.annotation.JsonGetter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pedido")
public class Controller {

    private Pedido pedido = new Pedido();

    @PostMapping(value = "/realizarPedido")
    @JsonGetter
    public ResponseEntity<Pedido> realizarPedido(){
        pedido.realizarPedido();
        return ResponseEntity.ok().body(pedido);
    }

    @PostMapping(value = "/pender")
    public void pender(){
        pedido.pender();
    }

    @PostMapping(value = "/realizarPagamento")
    public void realizarPagamento(){
        pedido.realizarPagamento();
    }

    @PostMapping(value = "/aprovar")
    public void aprovar(){
        pedido.aprovar();
    }

    @PostMapping(value = "/transportar")
    public void transportar(){
        pedido.transportar();
    }

    @PostMapping(value = "/entregar")
    public void entregar(){
        pedido.entregar();
    }

    @PostMapping(value = "/finalizar")
    public void finalizar(){
        pedido.finalizar();
    }

    @PostMapping(value = "cancelar")
    public void cancelar(){
        pedido.cancelar();
    }
}
