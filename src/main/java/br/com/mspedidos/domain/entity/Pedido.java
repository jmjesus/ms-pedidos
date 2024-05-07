package br.com.mspedidos.domain.entity;

import br.com.mspedidos.domain.enums.PagamentoEnum;
import br.com.mspedidos.domain.enums.StatusEnum;
import br.com.mspedidos.domain.valueobject.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Document(collation = "Pedido")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    @Id
    private String idPedido;
    private Integer idCliente;
    private List<Produto> produtos;
    private BigDecimal valorTotal;
    private PagamentoEnum formaPagamento;
    private StatusEnum status;

}
