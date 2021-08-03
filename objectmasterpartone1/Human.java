package comd.codingdojo.objectmasterpartone;

public class Human {
    public int strength = 3;
    public int stealth = 3;
    public int intelligence = 3;
    public int health = 100;

    public int getHealth() {
        return health;
    }

    public int attack(Human Human) {
        System.out.println("Health: " + Human.getHealth() + " Attack: " + this.strength);
        return Human.getHealth() - this.strength;
    }

}
