package com.cohete.domain;



public class Cohete {

	
	
	public Cohete (String code, int propulsor){
		this.code=code;
		this.propulsor= propulsor;
	}
	
	
	

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	

	public int getPropulsor() {
		return propulsor;
	}




	public void setPropulsor(int propulsor) {
		this.propulsor = propulsor;
	}





	private String code;
	private int propulsor;
	
	
}
