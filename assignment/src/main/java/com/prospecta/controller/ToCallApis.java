package com.prospecta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToCallApis {

	@GetMapping("https://api.publicapis.org/entries")
	public String getAllEntriesHandler() {

		return null;

	}

	@GetMapping("https://api.publicapis.org/random")
	public String getRandomEntriesHandler() {

		return null;

	}

	@GetMapping("https://api.publicapis.org/entries")
	public String getAllCategoriesEntriesHandler(@RequestParam String category) {

		return null;

	}

}
