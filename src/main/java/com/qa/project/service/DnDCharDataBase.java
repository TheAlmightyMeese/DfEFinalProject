package com.qa.project.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import com.qa.project.domain.DnDChar;
import com.qa.project.repo.CharRepo;

@Service
public class DnDCharDataBase implements DnDCharService {

	private CharRepo repo;

	public DnDCharDataBase(CharRepo repo) {
		super();
		this.repo = repo;
	}

	// create will add an entry to an in memory repo within H2
	// will later Add to a full SQL database
	// adding print statements for console read out
	@Override
	public DnDChar create(DnDChar newDnDChar) {
		System.out.println(newDnDChar.getName() + " Has been added to the Database");
		return this.repo.save(newDnDChar);
	}

//Will print the full list of entities in the console
	@Override
	public List<DnDChar> listAll() {
		System.out.println("Here is a list of all characters: ");
		this.repo.findAll().stream().forEach(e -> System.out.println(e));
		return this.repo.findAll();
	}

//will bring call and print based on the id of the entry 
	@Override
	public DnDChar findChar(Integer id) {
		System.out.println("Retreiveing id " + id + " from Database");
		System.out.println(this.repo.findById(id).toString());
		return this.repo.findById(id).orElseThrow(() -> new EntityNotFoundException("Unable to find Character"));
	}

// will replace the entry in the id slot with a whole new object
	@Override
	public DnDChar editChar(Integer id, DnDChar newDnDChar) {
		DnDChar existing = this.findChar(id);
		System.out.println("Character in slot " + id + " will be changed to " + newDnDChar);
		existing.setName(newDnDChar.getName());
		existing.setRace(newDnDChar.getRace());
		existing.setJob(newDnDChar.getJob());
		existing.setAge(newDnDChar.getAge());
		existing.setHeight(newDnDChar.getHeight());
		existing.setWeight(newDnDChar.getWeight());
		existing.setAlignment(newDnDChar.getAlignment());
		return this.repo.save(existing);

	}

// will remove the entry from the list 
// as its a list not a DB
// all other entries will move id to fill the space
	@Override
	public boolean killChar(Integer id) {
		System.out.println("It will be done.");
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}

}
