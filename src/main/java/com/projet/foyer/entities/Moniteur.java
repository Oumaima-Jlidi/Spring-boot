package com.projet.foyer.entities;


import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;

@Entity

public class Moniteur {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numMoniteur;
	private String nomM;
	private String prenomM;
	private LocalDate dateRecru;
	@OneToMany(mappedBy = "moniteur")
	private List<Cours> cours;
	public Moniteur() {
		super();
	}
	public Moniteur(Long numMoniteur, String nomM, String prenomM, LocalDate dateRecru, List<Cours> cours) {
		super();
		this.numMoniteur = numMoniteur;
		this.nomM = nomM;
		this.prenomM = prenomM;
		this.dateRecru = dateRecru;
		this.cours = cours;
	}
	public Long getNumMoniteur() {
		return numMoniteur;
	}
	
	public String getNomM() {
		return nomM;
	}
	public void setNomM(String nomM) {
		this.nomM = nomM;
	}
	public String getPrenomM() {
		return prenomM;
	}
	public void setPrenomM(String prenomM) {
		this.prenomM = prenomM;
	}
	public LocalDate getDateRecru() {
		return dateRecru;
	}
	public void setDateRecru(LocalDate dateRecru) {
		this.dateRecru = dateRecru;
	}
	public List<Cours> getCours() {
		return cours;
	}
	public void setCours(List<Cours> cours) {
		this.cours = cours;
	}
	
	
}
