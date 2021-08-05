package com.wp.phone;

public class Galaxy extends Phone implements Ringable {
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		// TODO Auto-generated constructor stub
        super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	@Override
    public String ring() {
        // your code here
    	return "Galaxy " + this.getVersionNumber() + " says " + this.getRingTone() + "!";
    }
    @Override
    public String unlock() {
        // your code here
    	return "Unlock via finger print";
    }
    @Override
    public void displayInfo() {
        // your code here  
    	System.out.println("Galaxy " + this.getVersionNumber() + " from " + this.getCarrier());
    }
}



