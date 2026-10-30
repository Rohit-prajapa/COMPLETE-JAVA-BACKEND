package com.setterinjection.examle;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class Employee {
	 private Project project; // ✅ declare variable

	    @Autowired
	    public void setProject(Project project) {
	        this.project = project; // ✅ correct assignment
	    }

	    public void display() {
	        System.out.println("employee working on project");
	        System.out.println(project.getProjectName());
	    }
	}









   