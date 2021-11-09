package com.qa.project.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DnDCharTest {

	public DnDChar testChar;

	@BeforeEach
	public void setup() {
		testChar = new DnDChar("Test", "Race", "Tester", 30, 185, 60.6, "Lawful Neutral");
	}

	@Test
	public void dndCharTest() {
		assertTrue(testChar instanceof DnDChar);
	}

	@Test
	public void getNameTest() {
		assertEquals("Test", testChar.getName(), "No Match");

	}

	@Test
	public void setNameTest() {
		testChar.setName("Other");
		assertEquals("Other", testChar.getName(), "No Match");
	}

	@Test
	public void getRaceTest() {
		assertEquals("Race", testChar.getRace(), "No Match");
	}

	@Test
	public void setRaceTest() {
		testChar.setRace("TestRace");
		assertEquals("TestRace", testChar.getRace(), "No Match");
	}

	@Test
	public void getJobTest() {
		assertEquals("Tester", testChar.getJob(), "No Match");
	}

	@Test
	public void setJobTest() {
		testChar.setJob("TestingTester");
		assertEquals("TestingTester", testChar.getJob(), "No Match");
	}

	@Test
	public void getAgeTest() {
		assertEquals(30, testChar.getAge(), "No Match");
	}

	@Test
	public void setAgeTest() {
		testChar.setAge(20);
		assertEquals(20, testChar.getAge(), "No Match");
	}

	@Test
	public void getHieghtTest() {
		assertEquals(185, testChar.getHieght(), "Macthed");
	}

	@Test
	public void setHieghtTest() {
		testChar.setHieght(1);
		assertEquals(1, testChar.getHieght(), "No Match");
	}

	@Test
	public void getWieghtTest() {
		assertEquals(60.6, testChar.getWieght(), "No Match");
	}

	@Test
	public void setWieghtTest() {
		testChar.setWieght(1.1);
		assertEquals(1.1, testChar.getWieght(), "No Match");
	}

	@Test
	public void getAlignmentTest() {
		assertEquals("Lawful Neutral", testChar.getAlignment(), "No Match");
	}

	@Test
	public void setAlignmentTest() {
		testChar.setAlignment("Chaotic Neutral");
		assertEquals("Chaotic Neutral", testChar.getAlignment(), "No Match");
	}

	@Test
	public void toStringTest() {
		assertEquals(
				"Character: Name: Test, Race: Race, Class: Tester, Age: 30, Hieght(cm): 185, Wieght(kg): 60.6, Alignment: Lawful Neutral",
				testChar.toString(), "Match");
	}

}