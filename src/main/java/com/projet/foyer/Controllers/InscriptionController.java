package com.projet.foyer.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projet.foyer.entities.Inscription;
import com.projet.foyer.services.InscriptionService;

@RestController
@RequestMapping("/api")
public class InscriptionController {
	@Autowired
	private InscriptionService inscriptionService;

   @RequestMapping(method=RequestMethod.GET,value="inscriptions")
   List<Inscription> getAllInscriptions(){
		return inscriptionService.getAllInscriptions();
	}
   
   @RequestMapping("inscriptions/{id}")
   public Inscription getInscription(@PathVariable long id) {
	return inscriptionService.getInscription(id);   
   }
   
   @RequestMapping(method= RequestMethod.DELETE,value="inscriptions/{id}")
   public  void deleteInscription(@PathVariable long id) {
	   inscriptionService.deleteInscriptionById(id);
   }
   @RequestMapping(method=RequestMethod.POST,value="inscriptions")
   public void addInscription(@RequestBody Inscription p) {
	   inscriptionService.saveInscription(p);
   }
   @RequestMapping(method=RequestMethod.PUT,value="inscriptions")
   public void updateInscription(@RequestBody Inscription p) {
	   inscriptionService.updateInscription(p);
   }
}
