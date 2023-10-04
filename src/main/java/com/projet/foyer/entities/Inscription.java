package com.projet.foyer.entities;

import jakarta.persistence.*;

@Entity
public class Inscription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numInscription;
	private   int numSemaine;
	
	 @ManyToOne
	    @JoinColumn(name = "skieur_id")
	    private Skieur skieur;
	 @ManyToOne
	    @JoinColumn(name = "cours_id")
	    private Cours cours;

	public Cours getCours() {
		return cours;
	}

	public void setCours(Cours cours) {
		this.cours = cours;
	}

	public Inscription() {
		super();
	}

	public Inscription(Long numInscription, int numSemaine, Skieur skieur) {
		super();
		this.numInscription = numInscription;
		this.numSemaine = numSemaine;
		this.skieur = skieur;
	}

	public Long getNumInscription() {
		return numInscription;
	}

	
	public int getNumSemaine() {
		return numSemaine;
	}

	public void setNumSemaine(int numSemaine) {
		this.numSemaine = numSemaine;
	}

	public Skieur getSkieur() {
		return skieur;
	}

	public void setSkieur(Skieur skieur) {
		this.skieur = skieur;
	}
	 
	 
}
