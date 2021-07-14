package com.example.crocheting.rest;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crocheting.data.crochetingProject;
import com.example.crocheting.service.crochetingService;

@RestController
public class CrochetingController {

	private crochetingService service;

	public CrochetingController(crochetingService service) {
		super();
		this.service = service;
	}

	@GetMapping("/")
	public String hello() {
		return "hello,World!";
	}

	@PostMapping("/createProject")
	public crochetingProject createProject(@RequestBody crochetingProject crochetingProject) {
		return service.createProject(crochetingProject);
	}

	@GetMapping("/getProjectList")
	public ArrayList<crochetingProject> getProjectList() {
		return service.getProjectList();

	}

	@GetMapping("/getProject/{index}")
	public crochetingProject getProject(@PathVariable int index) {
		return service.getProject(index);
	}

	@DeleteMapping("/deleteProject/{id}")
	public String deleteProject(@PathVariable int id) {
		return service.deleteProject(id);
	}

	@PutMapping("/updateProject/{id}")
	public crochetingProject updateProject(@PathVariable int id, @RequestBody crochetingProject crochetingProject) {
		return service.updateProject(id, crochetingProject);
	}
}
