package com.wordanalyzer.testTask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wordanalyzer.testTask.services.FileService;

@Controller
public class WordanalyzerController {

	@Autowired
	public FileService fileService;

	@GetMapping(path = "/wordanalyzer.html")
	public String wordAndCount() {
		return "wordanalyzer";

	}

	@PostMapping(path = "/wordanalyzer.html")
	public String writeAWord(@RequestParam(name = "word") String word, Model model) {

		model.addAttribute("count", fileService.getCount(word));
		model.addAttribute("letter", fileService.getLetter(word));

		return "wordanalyzer";
	}

}
