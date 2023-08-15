package com.nt.restms;

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

import com.nt.client.IPlayerServiceMSCilent;
import com.nt.entity.IPLPlayer;
import com.nt.entity.IPLTeam;
import com.nt.service.IIPLPlayerService;

@RestController
@RequestMapping("/Player-Api")
public class IIPLPlayerOperationController {
	@Autowired
	private IIPLPlayerService iPlayerService;
	@Autowired
	private IPlayerServiceMSCilent client;

	@PostMapping("/save")
	public ResponseEntity<?> registerAllPlayer(@RequestBody IPLPlayer player) {
		// get player team id
		// get IPL Team object From Target MS (IPLTeamMs)
		IPLTeam team = client.fetchIPLTeamById(player.getTeam().getTeamId());
		// set Team object to Player object
		player.setTeam(team);
		try {
			// user service to register player
			String savePlayer = iPlayerService.savePlayer(player);
			return new ResponseEntity<String>(savePlayer, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	@GetMapping("/fetch/all")
	public ResponseEntity<?> showAllPlayer(){
		try {
			//use service to get all player
			List<IPLPlayer> list=iPlayerService.fetchALlPlayer();
			return new ResponseEntity<List<IPLPlayer>>(list, HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/findby/{id}")
	public ResponseEntity<?> findIPLPlayerById(@PathVariable int id){
		try {
			//use service to get all player
			IPLPlayer player=iPlayerService.getPlayerById(id);
			return new ResponseEntity<IPLPlayer>(player, HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
