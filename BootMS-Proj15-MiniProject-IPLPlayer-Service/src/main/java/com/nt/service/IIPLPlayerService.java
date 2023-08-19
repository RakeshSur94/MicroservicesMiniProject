package com.nt.service;

import java.util.List;

import com.nt.entity.IPLPlayer;

public interface IIPLPlayerService {
	public String savePlayer(IPLPlayer player) throws Exception;
	public List<IPLPlayer> fetchALlPlayer() throws Exception;
	public IPLPlayer fetchPlayerById(int pid) throws Exception;

}
