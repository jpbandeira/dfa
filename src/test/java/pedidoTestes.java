import com.automatodfa.automatodfa.pedido.Pedido;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class pedidoTestes {

    private Pedido pedido;

    @Before
    public void before(){
        System.out.println("Pedido iniciado com sucesso");
        this.pedido = new Pedido();
    }

    @After
    public void after(){
        System.out.println("Teste finalizado");
    }

    @Test
    public void testeDeCadeiaCompletaSemErro(){
        pedido.pender();
        pedido.realizarPagamento();
        pedido.aprovar();
        pedido.transportar();
        pedido.entregar();
        pedido.finalizar();
    }

    @Test
    public void testeDeCadeiaVoltandoParaPedidoNovoEmPendente(){
        pedido.pender();
        pedido.realizarPedido();
        
    }

    @Test
    public void testeDeCadeiaVoltandoParaPedidoNovoEmRealizarPagamento(){
        pedido.pender();
        pedido.realizarPagamento();
        pedido.realizarPedido();
    }

    @Test
    public void testeDeCadeiaVoltandoParaPedidoNovoEmAprovado(){
        pedido.pender();
        pedido.realizarPagamento();
        pedido.aprovar();
        pedido.realizarPedido();
    }

    @Test
    public void testeDeCadeiaVoltandoParaPedidoNovoEmTransportado(){
        pedido.pender();
        pedido.realizarPagamento();
        pedido.aprovar();
        pedido.transportar();
        pedido.realizarPedido();
    }

    @Test
    public void testeDeCadeiaVoltandoParaPedidoNovoEmEntregue(){
        pedido.pender();
        pedido.realizarPagamento();
        pedido.aprovar();
        pedido.transportar();
        pedido.entregar();
        pedido.realizarPedido();
    }

    @Test
    public void testeDeCadeiaVoltandoParaPedidoNovoEmFinalizado(){
        pedido.pender();
        pedido.realizarPagamento();
        pedido.aprovar();
        pedido.transportar();
        pedido.entregar();
        pedido.finalizar();
        pedido.realizarPedido();
    }

    @Test
    public void testeDeCadeiaCanceladaEmPendente(){
        pedido.pender();
        pedido.cancelar();
    }

    @Test
    public void testeDeCadeiaCanceladaEmPagamentoRealizado(){
        pedido.pender();
        pedido.realizarPagamento();
        pedido.cancelar();
    }

    @Test
    public void testeDeCadeiaCanceladaEmAprovado(){
        pedido.pender();
        pedido.realizarPagamento();
        pedido.aprovar();
        pedido.cancelar();
    }

    @Test
    public void testeDeCadeiaCanceladoEmTransportado(){
        pedido.pender();
        pedido.realizarPagamento();
        pedido.aprovar();
        pedido.transportar();
        pedido.cancelar();
    }

    @Test
    public void testeDeCadeiaFalhandoEmPagamentoRealizado(){
        pedido.pender();
        pedido.realizarPagamento();
        pedido.pender();
    }

    @Test
    public void testeDeCadeiaFalhandoEmAprovado(){
        pedido.pender();
        pedido.realizarPagamento();
        pedido.aprovar();
        pedido.realizarPagamento();
    }

    @Test
    public void testeDeCadeiaFalhandoEmTransportado(){
        pedido.pender();
        pedido.realizarPagamento();
        pedido.aprovar();
        pedido.transportar();
        pedido.aprovar();
    }

    @Test
    public void testeDeCadeiaFalhandoEmEntregue(){
        pedido.pender();
        pedido.realizarPagamento();
        pedido.aprovar();
        pedido.transportar();
        pedido.entregar();
        pedido.transportar();
    }

    @Test
    public void testeDeCadeiaFalhandoEmFinalizado(){
        pedido.pender();
        pedido.realizarPagamento();
        pedido.aprovar();
        pedido.transportar();
        pedido.entregar();
        pedido.finalizar();
        pedido.entregar();
    }

}
