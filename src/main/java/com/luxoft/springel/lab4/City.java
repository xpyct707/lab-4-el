package com.luxoft.springel.lab4;

import lombok.Data;

@Data
public class City {
	private int id;
	private String name;
	private long population;


	public String getFullCityInfo() {
		return name + ", population: " + population; 
	}
}
