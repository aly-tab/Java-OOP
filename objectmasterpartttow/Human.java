package com.wp.objectmasterpartttow;

public class Human {
    private int strength = 3;
    private int stealth = 3;
    private int intelligence = 3;
    private int health = 100;
    
    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int attack(Human Human) {
        System.out.println("Health: " + Human.getHealth() + " Attack: " + this.strength);
        return Human.getHealth() - this.strength;
    }
}
