package Creatures.Animals.Herbivores;

import Creatures.Animals.Animal;
import Creatures.Configurable;
import Creatures.CreaturesPropertiesLoader;

@Configurable(fieldName = "Boar", groupJsonPath = "/Animals/Herbivores")
public class Boar extends Animal implements Herbivores {
    private static double weight;
    private static double maxLocationCount;
    private static double maxSpeed;
    private static double fullStomachKg;

    static {
        CreaturesPropertiesLoader.loadProperties(Boar.class);
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
