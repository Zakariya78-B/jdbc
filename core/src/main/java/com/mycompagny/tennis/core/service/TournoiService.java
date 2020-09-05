package com.mycompagny.tennis.core.service;

import com.mycompagny.tennis.core.dao.TournoiRepositoryImpl;
import com.mycompagny.tennis.core.entity.Tournoi;

public class TournoiService {
	private TournoiRepositoryImpl tournoiRepository;
	
	public TournoiService() {
		this.tournoiRepository=new TournoiRepositoryImpl();
	}
	
	public Tournoi getTournoi(Integer id) {
		return tournoiRepository.getById(id);
	}
	
	public void createTournoi(Tournoi tournoi) {
		tournoiRepository.create(tournoi);
	}

}
