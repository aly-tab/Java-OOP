public class Gorilla extends Mammal {
    public String throwSomething() {
        energyLevel = energyLevel - 5;
        return "The gorilla has thrown something! Energy level: " + this.energyLevel;
    }

    public String eatBananas() {
        energyLevel = energyLevel + 10;
        return "The gorilla is satisfied! Energy level: " + this.energyLevel;
    }

    public String climb() {
        energyLevel = energyLevel - 10;
        return "The gorilla climbed a tree! Energy level: " + this.energyLevel;
    }    
}
