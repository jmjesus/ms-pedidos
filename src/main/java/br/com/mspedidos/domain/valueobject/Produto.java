package br.com.mspedidos.domain.valueobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    private Integer idProduto;
    private String descricao;
    private BigDecimal valor;
    private String marca;
}
