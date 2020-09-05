package com.mycompagny.tennis.core;





import java.util.List;

import com.mycompagny.tennis.core.dao.JoueurRepositoryImpl;
import com.mycompagny.tennis.core.dao.TournoiRepositoryImpl;
import com.mycompagny.tennis.core.entity.Joueur;
import com.mycompagny.tennis.core.entity.Tournoi;
import com.mycompagny.tennis.core.service.JoueurService;
import com.mycompagny.tennis.core.service.TournoiService;

public class TestDeConnection {
    public static void main(String... args){
    	
    	JoueurService joueurService=new JoueurService();
    	TournoiService tournoiService=new TournoiService();
    	
    	Tournoi tournoi = tournoiService.getTournoi(2);
    	//Joueur zak= new Joueur();
    	//zak.setNom("Bazbaz");
    	//zak.setPrenom("Zak");
    	//zak.setSexe('H');
    	Joueur joueur = joueurService.getJoueur(45);
    	
    	System.out.println("le joueur est "+joueur.getPrenom()+" "+joueur.getNom());
    	System.out.println("le tournoi est "+tournoi.getNom()+" et son code est "+tournoi.getCode());
    	
    }
}
