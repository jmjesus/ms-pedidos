package br.com.mspedidos.application.controller;

import br.com.mspedidos.application.request.PedidoRequestDTO;
import br.com.mspedidos.domain.service.PedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping("/{idCliente}")
    public ResponseEntity<?> criarPedido(@PathVariable Integer idCliente, @RequestBody PedidoRequestDTO pedidoRequestDTO) {
        return ResponseEntity.ok(pedidoService.criarPedido(idCliente, pedidoRequestDTO));
    }

}
