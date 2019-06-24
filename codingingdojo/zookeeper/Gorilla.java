package com.codingingdojo.zookeeper;

public class Gorilla extends Mammal {
	public Gorilla throwSomething() {
		System.out.println("The gorilla has thrown something! It is super effective!");
		this.energyLevel -= 5;
		return this;
	}
	public Gorilla eatBananas() {
		System.out.println("The gorilla happily eats a cluster of bananas");
		this.energyLevel += 10;
		return this;
	}
	public Gorilla climb() {
		System.out.println("The gorilla climbs the tree and seems a little tired");
		this.energyLevel -= 10;
		return this;
	}

}
