package com.projet.foyer.entities;



import java.util.Set;

import jakarta.persistence.*;
@Entity
public class Piste {
@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long numPiste;
private String nomPiste;
@Enumerated(EnumType.STRING)
private Couleur couleur;
private int longeur;
private int pente;
@ManyToMany
Set<Skieur> skieur;



public Piste(Long numPiste, String nomPiste, Couleur couleur, int longeur, int pente) {
	super();
	this.numPiste = numPiste;
	this.nomPiste = nomPiste;
	this.couleur = couleur;
	this.longeur = longeur;
	this.pente = pente;
}
public Piste() {
	super();
}
public Long getNumPiste() {
	return numPiste;
}

public String getNomPiste() {
	return nomPiste;
}
public void setNomPiste(String nomPiste) {
	this.nomPiste = nomPiste;
}
public Couleur getCouleur() {
	return couleur;
}
public void setCouleur(Couleur couleur) {
	this.couleur = couleur;
}
public int getLongeur() {
	return longeur;
}
public void setLongeur(int longeur) {
	this.longeur = longeur;
}
public int getPente() {
	return pente;
}
public void setPente(int pente) {
	this.pente = pente;
}
public Set<Skieur> getSkieur() {
	return skieur;
}
public void setSkieur(Set<Skieur> skieur) {
	this.skieur = skieur;
}

}
