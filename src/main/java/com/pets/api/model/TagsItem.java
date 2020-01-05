package com.pets.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TagsItem{


	public	TagsItem(String name, int id){
		this.name = name;
		this.id = id;
	}
	public	TagsItem(){}


	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"TagsItem{" + 
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}