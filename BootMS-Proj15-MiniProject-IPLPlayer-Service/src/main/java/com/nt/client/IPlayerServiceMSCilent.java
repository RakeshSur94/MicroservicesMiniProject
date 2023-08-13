package com.nt.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nt.entity.IPLPlayer;
import com.nt.entity.IPLTeam;

@FeignClient("TEAM-SERVICE")
public interface IPlayerServiceMSCilent {
	@GetMapping("/IplTeam-Api/find/{id}")
	public IPLTeam fetchIPLTeamById(@PathVariable int id);

}
