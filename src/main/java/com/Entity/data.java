package com.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class data {
	@Id
	private int CategoryCode;
	private int value;
	public data() {
		super();
		// TODO Auto-generated constructor stub
	}
	public data(int categoryCode, int value) {
		super();
		CategoryCode = categoryCode;
		this.value = value;
	}
	public int getCategoryCode() {
		return CategoryCode;
	}
	public void setCategoryCode(int categoryCode) {
		CategoryCode = categoryCode;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
