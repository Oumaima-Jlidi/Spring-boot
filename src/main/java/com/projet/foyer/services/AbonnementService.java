package com.projet.foyer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.foyer.Repositories.AbonnementRepository;
import com.projet.foyer.entities.Abonnement;
@Service
public class AbonnementService  implements AbonnementServiceImpl{
	@Autowired
    private AbonnementRepository AbonnementRepository;
	@Override
	public Abonnement saveAbonnement(Abonnement a) {
        return AbonnementRepository.save(a);

	}

	@Override
	public Abonnement updateAbonnement(Abonnement a) {
        return AbonnementRepository.save(a);

	}

	

	@Override
	public void deleteAbonnementById(Long id) {
		AbonnementRepository.deleteById(id);
		
	}

	@Override
	public Abonnement getAbonnement(Long id) {
		return AbonnementRepository.findById(id).get();

	}

	@Override
	public List<Abonnement> getAllAbonnements() {
        return AbonnementRepository.findAll();

	}

}
