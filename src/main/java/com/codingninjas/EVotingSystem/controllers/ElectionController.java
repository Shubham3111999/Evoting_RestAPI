package com.codingninjas.EVotingSystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codingninjas.EVotingSystem.entities.Election;
import com.codingninjas.EVotingSystem.services.ElectionService;

@RestController
public class ElectionController {
	@Autowired
	ElectionService electionService;
	
	@GetMapping("/get/elections")
	public List<Election> getAllElections(){
		 return electionService.getAllElections();
	}
	
	@PostMapping("/add/election")
	public Election createNewElection(@RequestBody Election election) {
		return electionService.createNewElection(election);
	}
}
