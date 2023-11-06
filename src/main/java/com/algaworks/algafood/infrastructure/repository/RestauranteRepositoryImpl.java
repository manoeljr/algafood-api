package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.RestauranteRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RestauranteRepositoryImpl implements RestauranteRepository {
    @Override
    public List<Restaurante> todas() {
        return null;
    }

    @Override
    public Restaurante porId(Long id) {
        return null;
    }

    @Override
    public Restaurante adicionar(Restaurante restaurante) {
        return null;
    }

    @Override
    public void remover(Restaurante restaurante) {

    }
}
