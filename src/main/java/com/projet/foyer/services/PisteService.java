package com.projet.foyer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.projet.foyer.Repositories.PisteRepository;
import com.projet.foyer.entities.Piste;

public class PisteService  implements PisteServiceImpl{
	@Autowired
    private PisteRepository pisteRepository;
	@Override
	public Piste savePiste(Piste p) {
       return pisteRepository.save(p);		
}

	@Override
	public Piste updatePiste(Piste p) {
		return pisteRepository.save(p);
	}

	

	@Override
	public void deletePisteById(Long id) {
		pisteRepository.deleteById(id);		
	}

	@Override
	public Piste getPiste(Long id) {
		// TODO Auto-generated method stub
      return pisteRepository.findById(id).get()	;
      }

	@Override
	public List<Piste> getAllPistes() {
		// TODO Auto-generated method stub
        return pisteRepository.findAll();
}

}
