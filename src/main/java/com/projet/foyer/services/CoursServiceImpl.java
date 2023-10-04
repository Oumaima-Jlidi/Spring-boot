package com.projet.foyer.services;

import java.util.List;

import com.projet.foyer.entities.Cours;

public interface CoursServiceImpl {
	Cours saveCour(Cours c);
	Cours updateCour(Cours c);
	void deleteCourById(Long id);
	Cours getCour(Long id);
	List<Cours> getAllCours();
}
