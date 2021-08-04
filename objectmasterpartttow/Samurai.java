package com.wp.objectmasterpartttow;

public class Samurai extends Human {
	private int health = 200;
	private static int numSamurai = 0;
	
	public Samurai() {
		numSamurai++;
	}
	
    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
	
	public String deathBlow(Human human) {
		human.setHealth(0);
		this.setHealth(this.getHealth() / 2);
		return "Human health = " + human.getHealth() + " KO, Samurai health: " + this.getHealth();
	}
	
	public String meditate() {
		this.setHealth(health + (health / 2));
		return "Samurai health: " + this.getHealth();
	}
	
	public static int howMany() {
		return numSamurai;
	}
}
