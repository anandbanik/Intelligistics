package com.walmart.scm.fresh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.walmart.scm.fresh.dao.ReadingRepository;
import com.walmart.scm.fresh.model.Reading;

@Controller
@RequestMapping("/reading")
public class ReadingController {
	
	
	
public static final Logger logger = LoggerFactory.getLogger(ReadingController.class);
	
	@Autowired
	private ReadingRepository readingRepositor;
	
	
	@RequestMapping(method=RequestMethod.POST)
    public ResponseEntity<?> sayHello(@RequestBody Reading reading) {
		logger.info("Reading: "+reading.toString());
		readingRepositor.save(reading);
        return new ResponseEntity<String>(HttpStatus.CREATED);
    }


}
