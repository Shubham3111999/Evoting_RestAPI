package com.codingninjas.EVotingSystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingninjas.EVotingSystem.controllers.VoteController;
import com.codingninjas.EVotingSystem.entities.Election;
import com.codingninjas.EVotingSystem.entities.Vote;
import com.codingninjas.EVotingSystem.repositories.VoteRepository;

@Service
public class VoteService {
	@Autowired
	VoteRepository voteRepository;

	public List<Vote> getAllLists() {
		return voteRepository.findAll();
	}

	public Vote createVote(Vote vote) {
		return voteRepository.save(vote);
	}

	public long totalVotes() {
		return  voteRepository.count();
	}

	public long totalVoteByElection(Election election) {
		return  voteRepository.countByElection(election);
	}

	
	
}
