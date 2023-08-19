package com.nt.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="PLAYER_SERVICE")
//@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class IPLPlayer implements Serializable{
	
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "PID_SEQ",initialValue = 1,allocationSize = 500)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer pid;
	@NonNull
	@Column(length = 20)
	private String pName;
	private Integer age;
	@NonNull
	private Integer jersyNo;
	@NonNull
	@Column(length = 20)
	private String role;
	@ManyToOne(targetEntity = IPLTeam.class,cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
	@JoinColumn(name = "t_id",referencedColumnName = "teamId")
	private IPLTeam team; 
	
	public IPLPlayer() {
	   System.out.println("IPLPlayer.IPLPlayer()");
	}

	@Override
	public String toString() {
		return "IPLPlayer [pid=" + pid + ", pName=" + pName + ", age=" + age + ", jersyNo=" + jersyNo + ", role=" + role
				+ "]";
	}

	
	
	
	

}
