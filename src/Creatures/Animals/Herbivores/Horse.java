package Creatures.Animals.Herbivores;


import Creatures.Animals.Animal;
import Creatures.Configurable;
import Creatures.Creature;
import Creatures.CreaturesPropertiesLoader;

@Configurable(fieldName = "Horse", groupJsonPath = "/Animals/Herbivores")
public class Horse extends Animal implements Herbivores {
    private static double weight;
    private static double maxLocationCount;
    private static double maxSpeed;
    private static double fullStomachKg;

    static {
        CreaturesPropertiesLoader.loadProperties(Horse.class);
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
