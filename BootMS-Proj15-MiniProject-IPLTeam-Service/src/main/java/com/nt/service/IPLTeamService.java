package com.nt.service;

import java.util.List;

import com.nt.entity.IPLTeam;

public interface IPLTeamService {
	public String registerIPLTeam(IPLTeam team) ;
	public List<IPLTeam> showAllTeam();
	public IPLTeam findIPLTeamById(int id);

}
