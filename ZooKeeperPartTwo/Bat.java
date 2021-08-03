public class Bat extends Mammal {
    public String fly() {
        energyLevel = energyLevel - 50;
        return "ZOOORPPPPPP! Energy level: " + this.energyLevel;
    }

    public String eatHumans() {
        energyLevel = energyLevel + 25;
        return "Noms! Energy level: " + this.energyLevel;
    }

    public String attackTown() {
        energyLevel = energyLevel - 100;
        return "Murdurdur! Energy level: " + this.energyLevel;
    }    
}
