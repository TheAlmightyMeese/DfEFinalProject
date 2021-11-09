package com.qa.project.service;

import java.util.List;

import com.qa.project.domain.DnDChar;

public interface DnDCharService {

	DnDChar create(DnDChar newDnDChar);

	List<DnDChar> listAll();

	DnDChar findChar(Integer id);

	DnDChar editChar(Integer id, DnDChar newDnDChar);

	boolean killChar(Integer id);
}
