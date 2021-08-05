package com.wp.phone;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
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
    	return "Unlock via facial recognition";
    }
    @Override
    public void displayInfo() {
        // your code here 
    	System.out.println("IPhone " + this.getVersionNumber() + " from " + this.getCarrier());
    }

}




