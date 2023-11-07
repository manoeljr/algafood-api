package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Cidade;
import com.algaworks.algafood.domain.repository.CidadeRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CidadeRepositoryImpl implements CidadeRepository {
    @Override
    public List<Cidade> todas() {
        return null;
    }

    @Override
    public Cidade porId(Long id) {
        return null;
    }

    @Override
    public Cidade adicionar(Cidade cidade) {
        return null;
    }

    @Override
    public void remover(Cidade cidade) {

    }
}
