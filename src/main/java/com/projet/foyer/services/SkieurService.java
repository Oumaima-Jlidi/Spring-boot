package com.projet.foyer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.foyer.Repositories.SkieurRepository;
import com.projet.foyer.entities.Skieur;
@Service
public class SkieurService implements SkieurServiceImpl{
	@Autowired
    private SkieurRepository skieurRepository;
	
	@Override
	public Skieur saveSkieur(Skieur s) {
		// TODO Auto-generated method stub
		return skieurRepository.save(s);
	}

	@Override
	public Skieur updateSkieur(Skieur s) {
		// TODO Auto-generated method stub
		return skieurRepository.save(s);
	}

	

	@Override
	public void deleteSkieurById(Long id) {
		skieurRepository.deleteById(id);		
	}

	@Override
	public Skieur getSkieur(Long id) {
		// TODO Auto-generated method stub
		return skieurRepository.findById(id).get();
	}

	@Override
	public List<Skieur> getAllSkieurs() {
		// TODO Auto-generated method stub
		return skieurRepository.findAll();
	}

}
