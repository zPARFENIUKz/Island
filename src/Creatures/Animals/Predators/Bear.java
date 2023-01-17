package Creatures.Animals.Predators;

import Creatures.Animals.Animal;
import Creatures.Configurable;
import Creatures.CreaturesPropertiesLoader;

@Configurable(fieldName = "Bear", groupJsonPath = "/Animals/Predators")
public class Bear extends Animal implements Predator {
    private static double weight;
    private static double maxLocationCount;
    private static double maxSpeed;
    private static double fullStomachKg;

    static {
        CreaturesPropertiesLoader.loadProperties(Bear.class);
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
}
