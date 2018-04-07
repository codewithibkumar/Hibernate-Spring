package com.techseries.spring;

public class BikeInsurance implements LicInsurance {

	private Offer offers;
	
	@Override
	public String showStatus() {
		// TODO Auto-generated method stub
		return "Your Bike is insured!!";
	}

	public BikeInsurance(Offer offers) {
		
		this.offers = offers;
		System.out.println(offers.getOffer());
	}
	public BikeInsurance()
	{
		
	}

}
