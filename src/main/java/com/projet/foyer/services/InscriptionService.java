package com.projet.foyer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.foyer.Repositories.InscriptionRepository;
import com.projet.foyer.entities.Inscription;
@Service

public class InscriptionService implements InscriptionServiceImpl {
	@Autowired
    private InscriptionRepository InscriptionRepository;
	@Override
	public Inscription saveInscription(Inscription i) {
        return InscriptionRepository.save(i);

	}

	@Override
	public Inscription updateInscription(Inscription i) {
        return InscriptionRepository.save(i);

	}


	@Override
	public void deleteInscriptionById(Long id) {
		InscriptionRepository.deleteById(id);
		
	}

	@Override
	public Inscription getInscription(Long id) {
		return InscriptionRepository.findById(id).get();

	}

	@Override
	public List<Inscription> getAllInscriptions() {
        return InscriptionRepository.findAll();

	}

}
