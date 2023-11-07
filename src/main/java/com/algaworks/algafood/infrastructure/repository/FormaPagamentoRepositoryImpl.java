package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.FormaPagamento;
import com.algaworks.algafood.domain.repository.FormaPagamentoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FormaPagamentoRepositoryImpl implements FormaPagamentoRepository {
    @Override
    public List<FormaPagamento> todas() {
        return null;
    }

    @Override
    public FormaPagamento porId(Long id) {
        return null;
    }

    @Override
    public FormaPagamento adicionar(FormaPagamento formaPagamento) {
        return null;
    }

    @Override
    public void remover(FormaPagamento formaPagamento) {

    }
}
