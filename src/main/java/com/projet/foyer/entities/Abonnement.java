package com.projet.foyer.entities;

import java.time.LocalDate;


import jakarta.persistence.*;
@Entity
public class Abonnement {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numAbon;
	private LocalDate dateDebut;
	private LocalDate datefin;
    private Float prixAbon;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;
    @OneToOne
    @JoinColumn(name = "skieur_id")
    private Skieur skieur;
	public Abonnement() {
		super();
	}
	public Abonnement(Long numAbon, LocalDate dateDebut, LocalDate datefin, Float prixAbon, TypeAbonnement typeAbon,
			Skieur skieur) {
		super();
		this.numAbon = numAbon;
		this.dateDebut = dateDebut;
		this.datefin = datefin;
		this.prixAbon = prixAbon;
		this.typeAbon = typeAbon;
		this.skieur = skieur;
	}
	public Long getNumAbon() {
		return numAbon;
	}
	
	public LocalDate getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}
	public LocalDate getDatefin() {
		return datefin;
	}
	public void setDatefin(LocalDate datefin) {
		this.datefin = datefin;
	}
	public Float getPrixAbon() {
		return prixAbon;
	}
	public void setPrixAbon(Float prixAbon) {
		this.prixAbon = prixAbon;
	}
	public TypeAbonnement getTypeAbon() {
		return typeAbon;
	}
	public void setTypeAbon(TypeAbonnement typeAbon) {
		this.typeAbon = typeAbon;
	}
	public Skieur getSkieur() {
		return skieur;
	}
	public void setSkieur(Skieur skieur) {
		this.skieur = skieur;
	}
    
    
}
