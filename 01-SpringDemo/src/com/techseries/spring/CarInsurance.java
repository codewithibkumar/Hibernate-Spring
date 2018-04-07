package com.techseries.spring;

public class CarInsurance implements LicInsurance {

	private int insuranceNo;
	private int validity;
	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}
	

	@Override
	public String toString() {
		return "CarInsurance [insuranceNo=" + insuranceNo + ", validity=" + validity + ", insuranceName="
				+ insuranceName + "]";
	}

	public CarInsurance(int insuranceNo, String insuranceName) {
		super();
		this.insuranceNo = insuranceNo;
		this.insuranceName = insuranceName;
	}

	private String insuranceName;
	
	@Override
	public String showStatus() {
		// TODO Auto-generated method stub
		return "You car is Insured!! Policy No is: "+insuranceNo+ "\n Policy Name is: "+insuranceName;
	}

}
