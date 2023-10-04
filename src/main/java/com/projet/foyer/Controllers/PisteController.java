package com.projet.foyer.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projet.foyer.entities.Piste;
import com.projet.foyer.services.PisteService;


import java.util.List;

@RestController
@RequestMapping("/api")
public class PisteController {

	@Autowired
	private PisteService pisteService;

   @RequestMapping(method=RequestMethod.GET,value="pistes")
   List<Piste> getAllPistes(){
		return pisteService.getAllPistes();
	}
   
   @RequestMapping("pistes/{id}")
   public Piste getPiste(@PathVariable long id) {
	return pisteService.getPiste(id);   
   }
   
   @RequestMapping(method= RequestMethod.DELETE,value="pistes/{id}")
   public  void deletePiste(@PathVariable long id) {
	   pisteService.deletePisteById(id);
   }
   @RequestMapping(method=RequestMethod.POST,value="pistes")
   public void addPiste(@RequestBody Piste p) {
	   pisteService.savePiste(p);
   }
   @RequestMapping(method=RequestMethod.PUT,value="pistes")
   public void updatePisste(@RequestBody Piste p) {
	   pisteService.updatePiste(p);
   }
}
