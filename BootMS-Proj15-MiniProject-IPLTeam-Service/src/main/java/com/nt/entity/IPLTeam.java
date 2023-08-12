package com.nt.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "IPL_TEAM")
@Getter
@Setter
public class IPLTeam implements Serializable {

}
