package com.krugercorp.ec.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.krugercorp.ec.tdd.controller.CuentaController;
import com.krugercorp.ec.tdd.model.Cuenta;

@RunWith(SpringRunner.class)
@WebMvcTest(CuentaController.class)
public class TddApplicationTests {

	@Autowired
	MockMvc mock;

	@MockBean
	Cuenta cuenta;

	@Test
	public void testAlCrearCuentaSaldoes0() throws Exception {
		MvcResult result = mock.perform(get("/cuenta")).andExpect(status().isOk()).andReturn();
		System.out.println(result.getResponse().getContentAsString());
	}

}
