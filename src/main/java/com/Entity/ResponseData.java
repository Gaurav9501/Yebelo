package com.Entity;

public class ResponseData {
	private int oldValue;
	private int newValue;
	public ResponseData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseData(int oldValue, int newValue) {
		super();
		this.oldValue = oldValue;
		this.newValue = newValue;
	}
	public int getOldValue() {
		return oldValue;
	}
	public void setOldValue(int oldValue) {
		this.oldValue = oldValue;
	}
	public int getNewValue() {
		return newValue;
	}
	public void setNewValue(int newValue) {
		this.newValue = newValue;
	}
	
	
}
