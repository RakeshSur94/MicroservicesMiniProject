package com.eal.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetails {

	private LocalDateTime ldt;
	private String status;
	private String mssg;
}
