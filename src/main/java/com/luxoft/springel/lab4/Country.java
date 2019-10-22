package com.luxoft.springel.lab4;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private String codeName;
	private City capital;
	private String fullCapitalInfo;


	public Country(int id, String name, String codeName) {
		this.id = id;
		this.name = name;
		this.codeName = codeName;
	}

	public Country(String name, String codeName) {
		this.name = name;
		this.codeName = codeName;
	}
}
