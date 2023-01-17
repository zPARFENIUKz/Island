package Creatures.Animals.Herbivores;

import Creatures.Animals.Animal;
import Creatures.Configurable;
import Creatures.Creature;
import Creatures.CreaturesPropertiesLoader;

@Configurable(fieldName = "Rabbit", groupJsonPath = "/Animals/Herbivores")
public class Rabbit extends Animal implements Herbivores {
    private static double weight;
    private static double maxLocationCount;
    private static double maxSpeed;
    private static double fullStomachKg;

    static {
        CreaturesPropertiesLoader.loadProperties(Rabbit.class);
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
