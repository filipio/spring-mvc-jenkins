package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void defaultGreetingWithoutProvidingName() throws Exception {
		this.mockMvc.perform(get("/greeting"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string("{\"id\":2,\"content\":\"Hello, World!\"}"));

	}

	@Test
	void greetingWithProvidedNameAsQueryParameter() throws Exception{
		this.mockMvc.perform(get("/greeting?name=Ben"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string("{\"id\":1,\"content\":\"Hello, Ben!\"}"));
	}

}
