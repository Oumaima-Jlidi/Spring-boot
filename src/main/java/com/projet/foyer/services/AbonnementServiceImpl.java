package com.projet.foyer.services;

import java.util.List;

import com.projet.foyer.entities.Abonnement;


public interface AbonnementServiceImpl {
	Abonnement saveAbonnement(Abonnement a);
	Abonnement updateAbonnement(Abonnement a);
	void deleteAbonnementById(Long id);
	Abonnement getAbonnement(Long id);
	List<Abonnement> getAllAbonnements();
}
