package com.projet.foyer.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projet.foyer.entities.Moniteur;
import com.projet.foyer.services.MoniteurService;

@RestController
@RequestMapping("/api")
public class MoniteurController {
	@Autowired
	private MoniteurService moniteurService;

   @RequestMapping(method=RequestMethod.GET,value="moniteurs")
   List<Moniteur> getAllMoniteurs(){
		return moniteurService.getAllMoniteurs();
	}
   
   @RequestMapping("moniteurs/{id}")
   public Moniteur getMoniteur(@PathVariable long id) {
	return moniteurService.getMoniteur(id);   
   }
   
   @RequestMapping(method= RequestMethod.DELETE,value="moniteurs/{id}")
   public  void deleteMoniteur(@PathVariable long id) {
	   moniteurService.deleteMoniteurById(id);
   }
   @RequestMapping(method=RequestMethod.POST,value="moniteurs")
   public void addMoniteur(@RequestBody Moniteur p) {
	   moniteurService.saveMoniteur(p);
   }
   @RequestMapping(method=RequestMethod.PUT,value="moniteurs")
   public void updateMoniteur(@RequestBody Moniteur p) {
	   moniteurService.updateMoniteur(p);
   }
}
