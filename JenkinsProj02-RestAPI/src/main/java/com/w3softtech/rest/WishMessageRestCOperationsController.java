package com.w3softtech.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish-api")
public class WishMessageRestCOperationsController {

	@GetMapping("/display")
	public ResponseEntity<String> showWishMsg(){
		return new ResponseEntity<>("Good morning JRTP",HttpStatus.OK);
	}
}
