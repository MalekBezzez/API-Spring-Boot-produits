package com.gt.produits.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produit {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProduit;
	private String nomProduit;
	private Double prixProduit;
	private Date dateProduit;
	
	@ManyToOne
	private Categorie categorie;
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(String nomProduit, Double prixProduit, Date dateProduit) {
		super();
		this.nomProduit = nomProduit;
		this.prixProduit = prixProduit;
		this.dateProduit = dateProduit;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public Double getPrixProduit() {
		return prixProduit;
	}

	public void setPrixProduit(Double prixProduit) {
		this.prixProduit = prixProduit;
	}

	public Date getDateProduit() {
		return dateProduit;
	}

	public void setDateProduit(Date dateProduit) {
		this.dateProduit = dateProduit;
	}

	public Long getIdProduit() {
		return idProduit;
	}

	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", prixProduit=" + prixProduit
				+ ", dateProduit=" + dateProduit + "]";
	}
	
	
	
	
	
}
