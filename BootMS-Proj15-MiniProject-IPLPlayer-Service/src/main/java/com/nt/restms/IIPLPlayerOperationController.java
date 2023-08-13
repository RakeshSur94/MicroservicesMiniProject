package com.nt.restms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.IPlayerServiceMSCilent;
import com.nt.entity.IPLPlayer;
import com.nt.entity.IPLTeam;
import com.nt.service.IIPLPlayerService;

@RestController
@RequestMapping("Player-Api")
public class IIPLPlayerOperationController {
	@Autowired
	private IIPLPlayerService iPlayerService;
	@Autowired
	private IPlayerServiceMSCilent client;
	
	public ResponseEntity<?> registerAllPlayer(@RequestBody IPLPlayer player){
		//get player team id
		IPLTeam team=client.fetchIPLTeamById(player.getTeam().getTeamId());
		player.setTeam(team);
		return null;
		
	}

}
