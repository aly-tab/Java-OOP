package com.wp.objectmasterpartttow;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Human human1 = new Human();
        Human human2 = new Human();
        Wizard wizard1 = new Wizard();
        Ninja ninja1 = new Ninja();
        Samurai samurai1 = new Samurai();
        Samurai samurai2 = new Samurai();
        Samurai samurai3 = new Samurai();
        
        System.out.println("Current health: " + human1.attack(human2));
        System.out.println(wizard1.fireball(human1));
        System.out.println(ninja1.stealth(human2));
        System.out.println(ninja1.runAway());
        System.out.println(samurai1.deathBlow(human1));
        System.out.println(samurai1.meditate());
        System.out.println(Samurai.howMany());
	}

}
