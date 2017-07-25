package com.walmart.scm.fresh.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.walmart.scm.fresh.model.Reading;

public interface ReadingRepository extends JpaRepository<Reading, Long>{
	
	List<Reading> findByReadingId(Long readingId);

}
