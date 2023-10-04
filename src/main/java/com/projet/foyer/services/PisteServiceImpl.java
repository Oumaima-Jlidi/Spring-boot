package com.projet.foyer.services;

import java.util.List;

import com.projet.foyer.entities.Piste;

public interface PisteServiceImpl {
	Piste savePiste(Piste p);
	Piste updatePiste(Piste p);
	void deletePisteById(Long id);
	Piste getPiste(Long id);
	List<Piste> getAllPistes();
}
