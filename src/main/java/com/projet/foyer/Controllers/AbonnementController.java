package com.projet.foyer.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projet.foyer.entities.Abonnement;
import com.projet.foyer.services.AbonnementService;

@RestController
@RequestMapping("/api")
public class AbonnementController {
	@Autowired
	private AbonnementService abonnementService;

   @RequestMapping(method=RequestMethod.GET,value="abonnements")
   List<Abonnement> getAllAbonnements(){
		return abonnementService.getAllAbonnements();
	}
   
   @RequestMapping("abonnements/{id}")
   public Abonnement getAbonnement(@PathVariable long id) {
	return abonnementService.getAbonnement(id);   
   }
   
   @RequestMapping(method= RequestMethod.DELETE,value="abonnements/{id}")
   public  void deleteAbonnement(@PathVariable long id) {
	   abonnementService.deleteAbonnementById(id);
   }
   @RequestMapping(method=RequestMethod.POST,value="abonnements")
   public void addAbonnement(@RequestBody Abonnement c) {
	   abonnementService.saveAbonnement(c);
   }
   @RequestMapping(method=RequestMethod.PUT,value="abonnements")
   public void updateAbonnement(@RequestBody Abonnement c) {
	   abonnementService.updateAbonnement(c);
   }
}
