package com.codingninjas.EVotingSystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingninjas.EVotingSystem.controllers.ElectionController;
import com.codingninjas.EVotingSystem.entities.Election;
import com.codingninjas.EVotingSystem.entities.ElectionChoice;
import com.codingninjas.EVotingSystem.repositories.ElectionChoiceRepository;
import com.codingninjas.EVotingSystem.controllers.ElectionChoiceController;

@Service
public class ElectionChoiceService {
	@Autowired
	ElectionChoiceRepository electionChoiceRepository;

	public ElectionChoice addElectionChoice(ElectionChoice electionChoice) {
		return electionChoiceRepository.save(electionChoice);
	}

	public List<ElectionChoice> getAllElectionChoices() {
		return electionChoiceRepository.findAll();
	}

	public List<ElectionChoice> getAllElectionChoicesForElection(Election election) {
		return electionChoiceRepository.findAllByElection(election);
	}

	

	
}
