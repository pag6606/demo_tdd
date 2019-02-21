package com.krugercorp.ec.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.krugercorp.ec.tdd.model.Cuenta;

@RunWith(SpringRunner.class)
public class TddApplicationClasses {
	

	Cuenta cuenta;
	
	@Test
	public void testCuentaInicia0() {
		cuenta = new Cuenta();
		assertEquals(0.0d, cuenta.getSaldo(),0.0d);//(1L, cuenta.getId());
	}
}
