package com.codingninjas.EVotingSystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codingninjas.EVotingSystem.entities.Election;
import com.codingninjas.EVotingSystem.entities.Vote;
import com.codingninjas.EVotingSystem.services.VoteService;

@RestController
public class VoteController {
	@Autowired
	VoteService voteService;
	
	@GetMapping("/get/votes")
	private List<Vote> getAllLists(){
		return voteService.getAllLists();
	}
	
	@PostMapping("/add/vote")
	private Vote createVote(@RequestBody Vote vote) {
		return voteService.createVote(vote);
	}
	
	@GetMapping("/count/votes")
	private long totalVotes() {
		return voteService.totalVotes();
	}
	
	@PostMapping("/count/election/votes")
	private long totalVoteByElection(@RequestBody Election election) {
		return voteService.totalVoteByElection(election);
		
	}
	
}
