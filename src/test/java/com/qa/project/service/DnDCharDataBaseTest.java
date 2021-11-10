package com.qa.project.service;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.project.domain.DnDChar;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@Sql(scripts = { "classpath:dndchar-schema.sql",
		"classpath:dndchar-data.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
@ActiveProfiles("test")
public class DnDCharDataBaseTest {

	@Autowired
	private MockMvc mvc;

	@Autowired
	private ObjectMapper mapper;

	@Test
	void testCreate() throws Exception {
		DnDChar requestBody = new DnDChar("Test Char", "Test Race", "Test Class", 20, 180, 75.5, "Neutral Neutral");
		String requestBodyAsJSON = this.mapper.writeValueAsString(requestBody);

		RequestBuilder request = post("/characters/create").contentType(MediaType.APPLICATION_JSON)
				.content(requestBodyAsJSON);

		DnDChar responseBody = new DnDChar("Test Char", "Test Race", "Test Class", 20, 180, 75.5, "Neutral Neutral");
		String responseBodyAsJSON = this.mapper.writeValueAsString(responseBody);

		ResultMatcher checkStatus = status().isCreated();
		ResultMatcher checkBody = content().json(responseBodyAsJSON);

		this.mvc.perform(request).andExpect(checkStatus).andExpect(checkBody);
	}

	@Test
	void testListAll() throws Exception {
		RequestBuilder request = get("/characters/list");
		ResultMatcher checkStatus = status().isOk();

		DnDChar dndchar = new DnDChar("Test Char", "Test Race", "Test Class", 20, 180, 75.5, "Neutral Neutral");
		List<DnDChar> charList = List.of(dndchar);
		String responseBody = this.mapper.writeValueAsString(charList);
		ResultMatcher checkBody = content().json(responseBody);

		this.mvc.perform(request).andExpect(checkStatus).andExpect(checkBody);
	}

	@Test
	void testFindChar() throws Exception {
		RequestBuilder request = get("/characters/find/1");
		ResultMatcher checkStatus = status().isOk();

		DnDChar dndchar = new DnDChar("Test Char", "Test Race", "Test Class", 20, 180, 75.5, "Neutral Neutral");
		String responseBody = this.mapper.writeValueAsString(dndchar);
		ResultMatcher checkBody = content().json(responseBody);

		this.mvc.perform(request).andExpect(checkStatus).andExpect(checkBody);

	}

	@Test
	void testEditChar() throws Exception {
		DnDChar requestBody = new DnDChar("Test 2", "Race 2", "Class 2", 25, 180, 85.5, "Neutral Good");
		String requestBodyAsJSON = this.mapper.writeValueAsString(requestBody);

		RequestBuilder request = put("/characters/editChar/1").contentType(MediaType.APPLICATION_JSON)
				.content(requestBodyAsJSON);

		DnDChar responseBody = new DnDChar("Test 2", "Race 2", "Class 2", 25, 180, 85.5, "Neutral Good");
		String responseBodyAsJSON = this.mapper.writeValueAsString(responseBody);

		ResultMatcher checkStatus = status().isAccepted();
		ResultMatcher checkBody = content().json(responseBodyAsJSON);

		this.mvc.perform(request).andExpect(checkStatus).andExpect(checkBody);

	}

	@Test
	void testKill() throws Exception {
		RequestBuilder request = delete("/characters/kill/1");
		ResultMatcher checkStatus = status().isNoContent();

		this.mvc.perform(request).andExpect(checkStatus);
	}

}