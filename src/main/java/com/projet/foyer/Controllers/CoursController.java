package com.projet.foyer.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projet.foyer.entities.Cours;
import com.projet.foyer.services.CoursService;

@RestController
@RequestMapping("/api")
public class CoursController {
	@Autowired
	private CoursService coursService;

   @RequestMapping(method=RequestMethod.GET,value="cours")
   List<Cours> getAllCours(){
		return coursService.getAllCours();
	}
   
   @RequestMapping("cours/{id}")
   public Cours getCours(@PathVariable long id) {
	return coursService.getCour(id);   
   }
   
   @RequestMapping(method= RequestMethod.DELETE,value="cours/{id}")
   public  void deleteCours(@PathVariable long id) {
	   coursService.deleteCourById(id);
   }
   @RequestMapping(method=RequestMethod.POST,value="cours")
   public void addCours(@RequestBody Cours c) {
	   coursService.saveCour(c);
   }
   @RequestMapping(method=RequestMethod.PUT,value="cours")
   public void updateCours(@RequestBody Cours c) {
	   coursService.updateCour(c);
   }
}
