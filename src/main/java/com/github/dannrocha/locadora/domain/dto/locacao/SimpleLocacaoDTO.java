package com.github.dannrocha.locadora.domain.dto.locacao;

import com.github.dannrocha.locadora.domain.model.Locacao;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
public record SimpleLocacaoDTO(
    Integer id,
    LocalDate data,
    BigDecimal total
) {
    public static SimpleLocacaoDTO fromModel(Locacao locacao) {
        return SimpleLocacaoDTO
            .builder()
            .id(locacao.getId())
            .data(locacao.getData())
            .build();
    }
}
