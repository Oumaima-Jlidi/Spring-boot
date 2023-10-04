package com.projet.foyer.services;

import java.util.List;

import com.projet.foyer.entities.Inscription;

public interface InscriptionServiceImpl {
	Inscription saveInscription(Inscription i);
	Inscription updateInscription(Inscription i);
	void deleteInscriptionById(Long id);
	Inscription getInscription(Long id);
	List<Inscription> getAllInscriptions();
}
