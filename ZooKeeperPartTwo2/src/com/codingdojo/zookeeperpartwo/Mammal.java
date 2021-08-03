package com.codingdojo.zookeeperpartwo;

public class Mammal {
    public int energyLevel;

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public String displayEnergy(int energyLevel) {
        return "Energy level: " + this.energyLevel;
    }
}
