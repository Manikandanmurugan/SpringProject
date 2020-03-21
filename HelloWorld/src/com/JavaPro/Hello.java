package com.JavaPro;

public class Hello {
	private String nmae;

	public String getNmae() {
		return nmae;
	}

	public void setNmae(String nmae) {
		this.nmae = nmae;
	}
    public void display() {
    	System.out.println("Hello:"+nmae);
    }
}
