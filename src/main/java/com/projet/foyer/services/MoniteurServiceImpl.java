package com.projet.foyer.services;

import java.util.List;

import com.projet.foyer.entities.Moniteur;

public interface MoniteurServiceImpl {
	Moniteur saveMoniteur(Moniteur m);
	Moniteur updateMoniteur(Moniteur m);
	void deleteMoniteurById(Long id);
	Moniteur getMoniteur(Long id);
	List<Moniteur> getAllMoniteurs();
}
