package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.IPLPlayer;
import com.nt.repositroy.IIPLPlayerRepository;

import lombok.extern.slf4j.Slf4j;
@Service("IPLPlayerService")
@Slf4j
public class IPLPlayerServiceImpl implements IIPLPlayerService {
	@Autowired
	private IIPLPlayerRepository iPlayerRepo;

	@Override
	public String savePlayer(IPLPlayer player) throws Exception {
		log.info("IPL Player register method Started ");
		return "IPLPlayer saved with id "+iPlayerRepo.save(player).getPid();
	}

	@Override
	public List<IPLPlayer> fetchALlPlayer() throws Exception {
		log.info("IPLPlayer Fetch operation started ");
		return iPlayerRepo.findAll();
	}

	@Override
	public IPLPlayer fetchPlayerById(int pid) throws Exception {
		log.info("Player finding method started");
	return iPlayerRepo.findById(pid).orElseThrow(() -> new IllegalArgumentException("Player Not found"));
		
	}

}
