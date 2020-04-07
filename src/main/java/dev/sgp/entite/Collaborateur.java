package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {

	String matricule;
	String nom;
	String prenom;
	LocalDate date_de_naissance;
	String adresse;
	String num_sec_social;
	String emailPro;
	String photo;
	ZonedDateTime dateHeureCreation;
	Boolean actif;
	
	public Collaborateur() {
		super();
	}

	public Collaborateur(String matricule, String nom, String prenom, LocalDate date_de_naissance, String adresse,
			String num_sec_social, String emailPro, String photo, ZonedDateTime dateHeureCreation, Boolean actif) {

		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.date_de_naissance = date_de_naissance;
		this.adresse = adresse;
		this.num_sec_social = num_sec_social;
		this.emailPro = emailPro;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.actif = actif;
	}
	
	public String getMatricule() {
		return matricule;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public LocalDate getDate_de_naissance() {
		return date_de_naissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public String getNum_sec_social() {
		return num_sec_social;
	}

	public String getEmailPro() {
		return emailPro;
	}

	public String getPhoto() {
		return photo;
	}

	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}

	public Boolean getActif() {
		return actif;
	}
}
