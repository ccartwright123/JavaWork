package com.example.crocheting.service;

import java.util.ArrayList;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.crocheting.data.crochetingProject;

@Service
@Primary // tells Spring just to make this one
public class crochetingServiceList implements crochetingService {

	private ArrayList<crochetingProject> projects = new ArrayList<crochetingProject>();

	@Override
	public crochetingProject createProject(crochetingProject crochetingProject) {
		// TODO Auto-generated method stub
		this.projects.add(crochetingProject);
		System.out.println(crochetingProject);
		return crochetingProject;
	}

	@Override
	public crochetingProject getProject(int id) {
		// TODO Auto-generated method stub
		return this.projects.get(id);

	}

	@Override
	public ArrayList<crochetingProject> getProjectList() {
		return projects;
	}

	@Override
	public crochetingProject updateProject(int id, crochetingProject crochetingProject) {
		// Remove existing Person with matching 'id'
		this.projects.remove(id);
		// Add new Person in its place
		this.projects.add(id, crochetingProject);
		// Return updated Person from List
		return this.projects.get(id);
	}

	@Override
	public String deleteProject(int id) {
		// TODO Auto-generated method stub
		this.projects.remove(id);
		return "deleted project with the id: " + id;
	}
}
