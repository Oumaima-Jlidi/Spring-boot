package com.projet.foyer.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projet.foyer.entities.Skieur;
import com.projet.foyer.services.SkieurService;

@RestController
@RequestMapping("/api")
public class SkieurController {

	@Autowired
	private SkieurService skieurService;

   @RequestMapping(method=RequestMethod.GET,value="skieurs")
   List<Skieur> getAllSkieurs(){
		return skieurService.getAllSkieurs();
	}
   
   @RequestMapping("skieurs/{id}")
   public Skieur getSkieur(@PathVariable long id) {
	return skieurService.getSkieur(id);   
   }
   
   @RequestMapping(method= RequestMethod.DELETE,value="skieurs/{id}")
   public  void deleteSkieur(@PathVariable long id) {
	   skieurService.deleteSkieurById(id);
   }
   @RequestMapping(method=RequestMethod.POST,value="skieurs")
   public void addSkieur(@RequestBody Skieur p) {
	   skieurService.saveSkieur(p);
   }
   @RequestMapping(method=RequestMethod.PUT,value="skieurs")
   public void updateSkieur(@RequestBody Skieur p) {
	   skieurService.updateSkieur(p);
   }}