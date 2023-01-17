package Creatures.Plants;

import Creatures.Configurable;
import Creatures.Creature;
import Creatures.CreaturesPropertiesLoader;

@Configurable(fieldName = "Plant", groupJsonPath = "/Animals/Plants")
public class Plant implements Creature {
    private static double weight;
    private static double maxLocationCount;
    private static double maxSpeed;
    private static double fullStomachKg;

    static {
        CreaturesPropertiesLoader.loadProperties(Plant.class);
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getMaxLocationCount() {
        return maxLocationCount;
    }

    @Override
    public double getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public double getFullStomachKg() {
        return fullStomachKg;
    }

    @Override
    public boolean eatSomething(Creature creature) {
        return false;
    }

    @Override
    public double getNowInStomachKg() {
        return 0;
    }
}
