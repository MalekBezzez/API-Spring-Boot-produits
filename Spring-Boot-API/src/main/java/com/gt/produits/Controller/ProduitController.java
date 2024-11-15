package com.gt.produits.Controller;

import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gt.produits.entities.Produit;
import com.gt.produits.service.ProduitService;

@Controller // pour dire qu’il s’agit d’un controlleur
public class ProduitController {
@Autowired
ProduitService produitService; // demande à spring de nous //injecter un object qui implémente l’interface produitService
@RequestMapping("/showCreate")// lorsque la demande url est //showCreate je vais retourner la vue CreateProduit.jsp
public String showCreate()
{
return "createProduit"; // le nom de la jsp
}
@RequestMapping("/saveProduit") //l’action
public String saveProduit(@ModelAttribute("produit") Produit produit,
@RequestParam("date") String date,
ModelMap modelMap) throws ParseException
{
//conversion de la date
SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
Date dateCreation = dateformat.parse(String.valueOf(date));
produit.setDateProduit(dateCreation);
Produit saveProduit = produitService.saveProduit(produit);
//Ajouter  le produit dans la BD
String msg ="produit enregistré avec Id "+saveProduit.getIdProduit();
modelMap.addAttribute("msg", msg);
return "createProduit";
}
@RequestMapping("/ListeProduits")
public String listeProduits(ModelMap modelMap)
{
List<Produit> prods = produitService.getAllProduits();
modelMap.addAttribute("produits", prods);
return "listeProduits";
}
}