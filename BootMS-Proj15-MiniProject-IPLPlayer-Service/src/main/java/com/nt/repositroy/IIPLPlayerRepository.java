package com.nt.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.IPLPlayer;

public interface IIPLPlayerRepository extends JpaRepository<IPLPlayer, Integer> {

}
