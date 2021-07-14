package com.example.crocheting.service;

import java.util.ArrayList;

import com.example.crocheting.data.crochetingProject;

public interface crochetingService {

	public crochetingProject createProject(crochetingProject crochetingProject);

	public ArrayList<crochetingProject> getProjectList();

	public crochetingProject getProject(int id);

	public crochetingProject updateProject(int id, crochetingProject newcrochetingProject);

	public String deleteProject(int id);

}
