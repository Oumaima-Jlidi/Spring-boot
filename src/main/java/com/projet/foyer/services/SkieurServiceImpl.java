package com.projet.foyer.services;

import java.util.List;

import com.projet.foyer.entities.Skieur;

public interface SkieurServiceImpl {
	Skieur saveSkieur(Skieur s);
	Skieur updateSkieur(Skieur s);
	void deleteSkieurById(Long id);
	Skieur getSkieur(Long id);
	List<Skieur> getAllSkieurs();
}
