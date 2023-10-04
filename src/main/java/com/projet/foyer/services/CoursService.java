package com.projet.foyer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.foyer.Repositories.CoursRepository;
import com.projet.foyer.entities.Cours;

@Service
public class CoursService implements CoursServiceImpl{
	@Autowired
    private CoursRepository coursRepository;
	@Override
	public Cours saveCour(Cours c) {
        return coursRepository.save(c);

	}

	@Override
	public Cours updateCour(Cours c) {
        return coursRepository.save(c);
	}

	

	@Override
	public void deleteCourById(Long id) {
		coursRepository.deleteById(id);
		
	}

	@Override
	public Cours getCour(Long id) {
		return coursRepository.findById(id).get();
	}

	@Override
	public List<Cours> getAllCours() {
        return coursRepository.findAll();

	}

}
