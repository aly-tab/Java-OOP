package com.wp.objectmasterpartttow;

public class Wizard extends Human {
    private int health = 50;
    private int intelligence = 8;
    
    public int fireball(Human Human) {
    	return Human.getHealth() - this.intelligence * 3;
    }
}
