package com.projet.foyer.entities;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import jakarta.persistence.*;
@Entity

public class Skieur {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long numSkieur;
private String nomS;
private String prenomS;
private LocalDate dateNaissance;
private String ville;
@ManyToMany(mappedBy = "skieur")
Set<Piste> pistes;

@OneToMany(mappedBy = "skieur")
private List<Inscription> inscriptions;

@OneToOne(mappedBy = "skieur")
private Abonnement abonnement;
public Skieur(Long numSkieur, String nomS, String prenomS, LocalDate dateNaissance, String ville, Set<Piste> pistes) {
	super();
	this.numSkieur = numSkieur;
	this.nomS = nomS;
	this.prenomS = prenomS;
	this.dateNaissance = dateNaissance;
	this.ville = ville;
	this.pistes = pistes;
}

public Skieur() {
	super();
}

public Long getNumSkieur() {
	return numSkieur;
}

public String getNomS() {
	return nomS;
}
public void setNomS(String nomS) {
	this.nomS = nomS;
}
public String getPrenomS() {
	return prenomS;
}
public void setPrenomS(String prenomS) {
	this.prenomS = prenomS;
}
public LocalDate getDateNaissance() {
	return dateNaissance;
}
public void setDateNaissance(LocalDate dateNaissance) {
	this.dateNaissance = dateNaissance;
}
public String getVille() {
	return ville;
}
public void setVille(String ville) {
	this.ville = ville;
}
public Set<Piste> getPistes() {
	return pistes;
}
public void setPistes(Set<Piste> pistes) {
	this.pistes = pistes;
}

public List<Inscription> getInscriptions() {
	return inscriptions;
}

public void setInscriptions(List<Inscription> inscriptions) {
	this.inscriptions = inscriptions;
}

public Abonnement getAbonnement() {
	return abonnement;
}

public void setAbonnement(Abonnement abonnement) {
	this.abonnement = abonnement;
}




}
