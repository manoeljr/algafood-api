package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.repository.EstadoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EstadoRepositoryImpl implements EstadoRepository {

    @Override
    public List<Estado> todas() {
        return null;
    }

    @Override
    public Estado porId(Long id) {
        return null;
    }

    @Override
    public Estado adicionar(Estado estado) {
        return null;
    }

    @Override
    public void remover(Estado estado) {

    }
}
