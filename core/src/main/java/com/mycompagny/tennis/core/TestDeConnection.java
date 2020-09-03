package com.mycompagny.tennis.core;





import java.util.List;

import com.mycompagny.tennis.core.dao.JoueurRepositoryImpl;
import com.mycompagny.tennis.core.entity.Joueur;

public class TestDeConnection {
    public static void main(String... args){
    	
    	JoueurRepositoryImpl joueurRepository=new JoueurRepositoryImpl();
   
    	
    	List<Joueur> liste=joueurRepository.list();
    	
    	for(Joueur j: liste) {
    		System.out.println(j.getPrenom()+" "+j.getNom());
    	}
    	
    }
}
