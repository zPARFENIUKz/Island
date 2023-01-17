package Creatures;

public interface Creature {
    boolean eatSomething(Creature creature);

    double getNowInStomachKg();
    double getWeight();
    double getMaxLocationCount();
    double getMaxSpeed();
    double getFullStomachKg();
}
