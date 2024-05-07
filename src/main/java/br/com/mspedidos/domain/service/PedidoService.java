package br.com.mspedidos.domain.service;

import br.com.mspedidos.application.request.PedidoRequestDTO;
import br.com.mspedidos.domain.entity.Pedido;
import br.com.mspedidos.domain.enums.PagamentoEnum;
import br.com.mspedidos.domain.valueobject.Produto;
import br.com.mspedidos.infra.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<Pedido> criarPedido(Integer idCliente, PedidoRequestDTO pedidoRequestDTO) {
        List<Pedido> pedidosSalvos = new ArrayList<>();
        Produto p1 = new Produto(1, "Camisa Branca", new BigDecimal(10), "Lacoste");
        Produto p2 = new Produto(2, "Camisa Preta", new BigDecimal(20), "Hering");
        Produto p3 = new Produto(3, "Tênis Corrida", new BigDecimal(30), "Adidas");
        List<Produto> produtoList = List.of(p1, p2, p3);

        pedidoRequestDTO.produtos().forEach(produto -> {
            Pedido pedido = new Pedido();
            pedido.setFormaPagamento(PagamentoEnum.PIX);
            pedido.setIdCliente(idCliente);
            pedido.setProdutos(produtoList);
            pedido.setValorTotal(new BigDecimal(60));
            pedidosSalvos.add(pedido);
        });

        return pedidoRepository.saveAll(pedidosSalvos);
    }

}
