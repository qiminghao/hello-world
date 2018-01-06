package pres.qmh.springmvc.web;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;

import pres.qmh.springmvc.web.controller.UserController;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class HelloControllerTest {

	@Test
	public void testHello() throws Exception {
		UserController controller = new UserController();
		MockMvc mockMvc = standaloneSetup(controller).build();
		mockMvc.perform(get("/hello")).andExpect(view().name("helloWorld"));
	}

}
