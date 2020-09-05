package com.mycompagny.tennis.core.service;

import com.mycompagny.tennis.core.dao.JoueurRepositoryImpl;
import com.mycompagny.tennis.core.entity.Joueur;

public class JoueurService {
	private JoueurRepositoryImpl joueurRepository;
	
	public JoueurService() {
		this.joueurRepository=new JoueurRepositoryImpl();
	}
	
	
	public void createJoueur(Joueur joueur) {
		joueurRepository.create(joueur);
	}
	
	public Joueur getJoueur(Integer id) {
		return joueurRepository.getById(id);		
	}

}
