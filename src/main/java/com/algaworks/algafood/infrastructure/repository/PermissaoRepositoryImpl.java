package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Permissao;
import com.algaworks.algafood.domain.repository.PermissaoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PermissaoRepositoryImpl implements PermissaoRepository {
    @Override
    public List<Permissao> todas() {
        return null;
    }

    @Override
    public Permissao porId(Long id) {
        return null;
    }

    @Override
    public Permissao adicionar(Permissao permissao) {
        return null;
    }

    @Override
    public void remover(Permissao permissao) {

    }
}
