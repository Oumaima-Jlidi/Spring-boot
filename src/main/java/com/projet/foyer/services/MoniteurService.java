package com.projet.foyer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.projet.foyer.Repositories.MoniteurRepository;
import com.projet.foyer.entities.Moniteur;

public class MoniteurService  implements MoniteurServiceImpl{
	@Autowired
    private MoniteurRepository moniteurRepository;
	@Override
	public Moniteur saveMoniteur(Moniteur m) {
	return moniteurRepository.save(m);
	}

	@Override
	public Moniteur updateMoniteur(Moniteur m) {
		return moniteurRepository.save(m);
	}

	

	@Override
	public void deleteMoniteurById(Long id) {
		moniteurRepository.deleteById(id);
		
	}

	@Override
	public Moniteur getMoniteur(Long id) {
		return moniteurRepository.findById(id).get();

	}

	@Override
	public List<Moniteur> getAllMoniteurs() {
		return moniteurRepository.findAll();

	}

}
