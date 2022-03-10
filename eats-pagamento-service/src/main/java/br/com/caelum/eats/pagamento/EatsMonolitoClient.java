package br.com.caelum.eats.pagamento;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;


@FeignClient("eats-monolito")
public interface EatsMonolitoClient {
	
	@PutMapping(value="/pedidos/{pedidoId}/status")
	public void atualizaStatusDoPedido(@PathVariable Long pedidoId, PedidoMudancaDeStatusRequest pedido);

}

