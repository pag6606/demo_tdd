package com.krugercorp.ec.tdd.model;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Component
public class Cuenta {
	
	
	Long id; 
	
	double saldo;
	
 	public Cuenta() {
 		this.id= 1l;
 		this.saldo= 0.00d;
 	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		
		return "Cuenta #:" + this.getId() + "saldo: " + this.getSaldo() ;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cuenta(Long id, double saldo) {
		super();
		this.id = id;
		this.saldo = saldo;
	}
	
	
 	
}
