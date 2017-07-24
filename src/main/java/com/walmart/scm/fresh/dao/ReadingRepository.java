package com.walmart.scm.fresh.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.walmart.scm.fresh.model.Reading;

public interface ReadingRepository extends CrudRepository<Reading, Long>{
	
	List<Reading> findByReadingId(Long readingId);

}
