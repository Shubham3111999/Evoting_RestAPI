package com.codingninjas.EVotingSystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingninjas.EVotingSystem.entities.Election;
import com.codingninjas.EVotingSystem.entities.ElectionChoice;
import com.codingninjas.EVotingSystem.repositories.ElectionChoiceRepository;
import com.codingninjas.EVotingSystem.repositories.VoteRepository;


@Service
public class ResultService {
	
	@Autowired
	VoteRepository voteRepository;
	
	@Autowired
	ElectionChoiceRepository electionChoiceRepository;

	public ElectionChoice giveWinner(Election election) {
		
		List<ElectionChoice> list=electionChoiceRepository.findAllByElection(election);
		
		ElectionChoice result=null;
		long maxCount=0;

		
		for(ElectionChoice ec:list) {
			long count=voteRepository.countByElectionChoice(ec);
			
			if(count>maxCount) {
				maxCount=count;
				result=ec;
			}
		}
		
		
		
		return result;
	}
	
	
}
