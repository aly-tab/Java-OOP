public class Human {
    public int strength = 3;
    public int stealth = 3;
    public int intelligence = 3;
    public int health = 100;

    public int attack(Object Human) {
        return Human.health - this.strength;
    }
}