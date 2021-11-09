package com.qa.project.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.project.domain.DnDChar;
import com.qa.project.service.DnDCharService;

@RestController
@RequestMapping("/characters")
public class DnDCharController {
// Links to Service
	private DnDCharService service;

	public DnDCharController(DnDCharService service) {
		super();
		this.service = service;
	}

//Adds Address to run the 'Create' Service along with appropriate status response	
	@PostMapping("/create")
	public ResponseEntity<DnDChar> create(@RequestBody DnDChar newDnDChar) {
		DnDChar body = this.service.create(newDnDChar);
		return new ResponseEntity<DnDChar>(body, HttpStatus.CREATED);
	}

// 	will retrieve the entire list
	@GetMapping("/list")
	public List<DnDChar> listAll() {
		return this.service.listAll();
// The Status code will be the default 200 - OK
	}

// retrieves a singly entry by its index number in the list
	@GetMapping("/Character/{id}")
	public DnDChar findChar(@PathVariable Integer id) {
		return this.service.findChar(id);
// Status = Default 200 -ok
	}

//Calls upon editChar to replace the entry based on id
	@PutMapping("/editChar/{id}")
	public ResponseEntity<DnDChar> editChar(@PathVariable Integer id, @RequestBody DnDChar newDnDChar) {
		DnDChar evolve = this.service.editChar(id, newDnDChar);
		return new ResponseEntity<DnDChar>(evolve, HttpStatus.ACCEPTED);
	}

//Removes the entity from
	@DeleteMapping("/kill/{id}")
	public ResponseEntity<DnDChar> kill(@PathVariable Integer id) {
		boolean removed = this.service.killChar(id);
		if (removed) {
			System.out.println("Number " + id + " on the list is no more");
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			System.out.println("Something went wrong, I have failed");
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		// prints to console on success or failure.
	}
}
