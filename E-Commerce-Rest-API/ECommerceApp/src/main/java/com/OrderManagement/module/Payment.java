package com.OrderManagement.module;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String methodName;
	
	// by default true
	@JsonIgnore
	private boolean active;
	

	
	@JsonIgnore
	@OneToMany(mappedBy = "payments", cascade = CascadeType.ALL)
	private List<Orders> orders = new ArrayList<>();
}
