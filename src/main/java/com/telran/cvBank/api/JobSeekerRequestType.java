package com.telran.cvBank.api;

public interface JobSeekerRequestType {
	String REGISTRATION = "/jobSeeker/registration";
	String LOGIN = "/jobSeeker/login";
	String SEARCH_PROFILE = "/jobSeeker/profile";
	String SEARCH_CATALOGS = "/jobSeeker/catalogs";
	String SEARCH_CVLIST = "/jobSeeker/cvList";
	String SEARCH_CV = "/jobSeeker/cv";
	String SAVE_CV = "/jobSeeker/cv";       //????duplication
	String DELETE_CV = "/jobSeeker/cv";
	String OPEN_CV = "/jobSeeker/cvVisible";
	String EDIT_PROFILE = "/jobSeeker/profile";
	String PROVE_SKILLS_RESULT = "/jobSeeker/proveSkillsResult";
	String PROVE_SKILL = "/jobSeeker/proveSkill";
	String PROVE_CV_RESULTS = "/jobSeeker/proveCvResult";
}
