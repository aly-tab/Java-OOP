package com.codingdojo.zookeeperpartone;

public class ZooKeeperTest {

    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        gorilla.setEnergyLevel(50);
        System.out.println(gorilla.throwSomething());
        System.out.println(gorilla.throwSomething());
        System.out.println(gorilla.throwSomething());
        System.out.println(gorilla.eatBananas());
        System.out.println(gorilla.eatBananas());
        System.out.println(gorilla.climb());
    }

}
