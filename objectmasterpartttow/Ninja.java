package com.wp.objectmasterpartttow;

public class Ninja extends Human {
    private int stealth = 10;
    
    
    public String stealth(Human human) {
    	human.setHealth(human.getHealth() - this.stealth);
    	this.setHealth(this.getHealth() + this.stealth); 
    	int humanHealth = human.getHealth();
    	int ninjaHealth = this.getHealth();
    	return "Human health: " + humanHealth + " Ninja health: " + ninjaHealth;
    }

    public String runAway() {
    	this.setHealth(this.getHealth() - 10);
    	return "Ninja health: " + this.getHealth();
    }
}
