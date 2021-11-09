package com.qa.project.service;

import java.util.ArrayList;
import java.util.List;

import com.qa.project.domain.DnDChar;

public class DnDCharServiceH2Test implements DnDCharService {

	// creating List for H2 to use to test functionality.
	private List<DnDChar> dndchar = new ArrayList<>();

	// create will add an entry to a temporary repo within H2
	// adding print statements for console read out
	@Override
	public DnDChar create(DnDChar newDnDChar) {
		this.dndchar.add(newDnDChar);
		System.out.println(newDnDChar.getName() + " Has been added to the list");
		DnDChar body = this.dndchar.get(this.dndchar.size() - 1);
		return body;
	}

//Will print the full list of entities in the console line by line
	@Override
	public List<DnDChar> listAll() {
		System.out.println(" List of current characters: ");
		dndchar.stream().forEach(e -> System.out.println(e));
		return this.dndchar;
	}

//will bring call and print based on the id of the entry 
	@Override
	public DnDChar findChar(Integer id) {
		System.out.println(this.dndchar.get(id));
		return this.dndchar.get(id);
	}

// will replace the entry in the id slot with a whole new object
	@Override
	public DnDChar editChar(Integer id, DnDChar newDnDChar) {
		System.out.println("Character in slot " + id + " will be changed to " + newDnDChar);
		DnDChar evolve = this.dndchar.set(id, newDnDChar);
		return evolve;
	}

// will remove the entry from the list 
// as its a list not a DB
// all other entries will move id to fill the space
	@Override
	public boolean killChar(Integer id) {
		System.out.println("It will be done.");
		System.out.println("Number " + id + " on the list is no more");
		DnDChar kill = this.dndchar.get(id);
		this.dndchar.remove(id.intValue());
		return !this.dndchar.contains(kill);
	}

}
