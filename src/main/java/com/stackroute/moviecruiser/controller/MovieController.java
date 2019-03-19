package com.stackroute.moviecruiser.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
/*
 * @RequestMapping provides “routing” information. It tells Spring that any HTTP
 * request with the /api/v1 path should be mapped to this class
 */
@RequestMapping(path = "/api/v1")
public class MovieController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@GetMapping("/movie")
	public ResponseEntity<String> fetchAllMovies() {
		logger.debug("This is a debug message");
		logger.info("This is an info message");
		logger.warn("This is a warn message");
		logger.error("This is an error message");
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}
}
