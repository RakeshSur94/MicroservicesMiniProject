package com.nt.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.IPLTeam;
import com.nt.repository.IIPLTeamRepository;

import lombok.extern.slf4j.Slf4j;
@Service("IPLTeamService")
@Slf4j
public class IPLTeamServiceImpl implements IPLTeamService {
	@Autowired
	private IIPLTeamRepository iRepository;

	@Override
	public String registerIPLTeam(IPLTeam team) {
		log.info("Registraton mehtod is Started:: Registration Process is started");
		
		return "IPLTeam Register with Id "+iRepository.save(team).getTeamId();
	}

	@Override
	public List<IPLTeam> showAllTeam()  {
		log.info("Fetching all Team mehtod is Started:: Fetch Process is started");
		return iRepository.findAll();
	}

	@Override
	public IPLTeam findIPLTeamById(int id)  {
		log.error("Find IPLTeam by id method started:: Find Team by ID Process is started");		
		return iRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Team not Found"));
	}

}
