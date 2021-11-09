package com.qa.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.project.domain.DnDChar;

@Repository
public interface CharRepoTest extends JpaRepository<DnDChar, Integer> {

}
