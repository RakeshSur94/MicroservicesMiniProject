package com.nt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.IPLTeam;
import com.nt.service.IPLTeamService;

@RestController
@RequestMapping("/IplTeam-Api")
public class IPLTeamOperationControlller {
	@Autowired
	private IPLTeamService iplService;
	
	@PostMapping("/register")
	public ResponseEntity<?> registerALLIPLTeam(@RequestBody IPLTeam team){		
			String saveAll = iplService.registerIPLTeam(team);
			return new ResponseEntity<String>(saveAll,HttpStatus.CREATED);
	}
	@GetMapping("/fetch")
	public ResponseEntity<?> fetchAllIPLTeam(){
		List<IPLTeam> list=iplService.showAllTeam();
		return new ResponseEntity<List<IPLTeam>>(list, HttpStatus.OK);
	}
	@GetMapping("/find/{id}")
	public ResponseEntity<?> findIPLTeamById(@PathVariable int id){
		IPLTeam findById=iplService.findIPLTeamById(id);
		return new ResponseEntity<IPLTeam>(findById, HttpStatus.OK);
	}

}
