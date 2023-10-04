package com.projet.foyer.entities;


import java.util.List;

import jakarta.persistence.*;
@Entity

public class Cours {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numCours;
	private int niveau;
	@Enumerated(EnumType.STRING)
	private TypeCours typeCours;
	@Enumerated(EnumType.STRING)
	private Support support;
	private Float prix;
	private int creneau;
	@OneToMany(mappedBy = "cours")
	private List<Inscription> inscriptions;
	
	@ManyToOne
	@JoinColumn(name = "moniteur_id") // Utilisez "moniteur_id" avec une lettre minuscule
	private Moniteur moniteur;

	
	public Cours() {
		super();
	}
	public Cours(Long numCours, int niveau, TypeCours typeCours, Support support, Float prix, int creneau,
			List<Inscription> inscriptions) {
		super();
		this.numCours = numCours;
		this.niveau = niveau;
		this.typeCours = typeCours;
		this.support = support;
		this.prix = prix;
		this.creneau = creneau;
		this.inscriptions = inscriptions;
	}
	public Long getNumCours() {
		return numCours;
	}
	
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public TypeCours getTypeCours() {
		return typeCours;
	}
	public void setTypeCours(TypeCours typeCours) {
		this.typeCours = typeCours;
	}
	public Support getSupport() {
		return support;
	}
	public void setSupport(Support support) {
		this.support = support;
	}
	public Float getPrix() {
		return prix;
	}
	public void setPrix(Float prix) {
		this.prix = prix;
	}
	public int getCreneau() {
		return creneau;
	}
	public void setCreneau(int creneau) {
		this.creneau = creneau;
	}
	public List<Inscription> getInscriptions() {
		return inscriptions;
	}
	public void setInscriptions(List<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}
	public Moniteur getMoniteur() {
		return moniteur;
	}
	public void setMoniteur(Moniteur moniteur) {
		this.moniteur = moniteur;
	}
	
	

}
