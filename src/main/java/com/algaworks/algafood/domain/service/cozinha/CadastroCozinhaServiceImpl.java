package com.algaworks.algafood.domain.service.cozinha;

import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CadastroCozinhaServiceImpl implements CadastroCozinhaService {

    @Autowired
    private CozinhaRepository cozinhaRepository;

    @Override
    public Cozinha salvar(Cozinha cozinha) {
        return cozinhaRepository.adicionar(cozinha);
    }
}
