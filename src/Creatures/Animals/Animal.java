package Creatures.Animals;

import Creatures.Creature;
import IslandLocation.IslandLocation;

public abstract class Animal implements Creature{
    protected double nowInStomachKg = getFullStomachKg();

    public abstract double getWeight();
    public abstract double getMaxLocationCount();
    public abstract double getMaxSpeed();
    public abstract double getFullStomachKg();

    @Override
    public boolean eatSomething(Creature creature) {
        // Надо переписать с логикой
        double creatureWeight = creature.getWeight();
        nowInStomachKg = Math.min(nowInStomachKg + creatureWeight, getFullStomachKg());
        return true;
    }

    @Override
    public double getNowInStomachKg() {
        return nowInStomachKg;
    }

    //    public abstract void eat(Creature creature);
//    public abstract void move();
//    public abstract void reproduce();
//    public abstract void dieOfHunger();
}

