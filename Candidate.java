package com.Encapsulation;

public class Candidate {

	private int id;
	private String name;


	public void getCandidateDetails() {

		System.out.println(id);
		System.out.println(name);

	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}




}



