package com.mycompagny.tennis.core;





import java.util.List;

import com.mycompagny.tennis.core.dao.JoueurRepositoryImpl;
import com.mycompagny.tennis.core.dao.TournoiRepositoryImpl;
import com.mycompagny.tennis.core.entity.Joueur;
import com.mycompagny.tennis.core.entity.Tournoi;

public class TestDeConnection {
    public static void main(String... args){
    	
    	TournoiRepositoryImpl tournoiRepository=new TournoiRepositoryImpl();
   
    	
    	List<Tournoi> liste=tournoiRepository.list();
    	
    	for(Tournoi t: liste) {
    		System.out.println(t.getCode()+" "+t.getNom());
    	}
    	
    }
}
