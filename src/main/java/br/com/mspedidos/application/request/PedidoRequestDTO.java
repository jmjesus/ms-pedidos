package br.com.mspedidos.application.request;

import java.util.List;

public record PedidoRequestDTO(
    List<PedidoDTO> produtos
) {
}
