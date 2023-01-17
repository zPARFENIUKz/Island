package IslandLocation;

import Creatures.Configurable;
import Creatures.Creature;
import IslandExceptions.IslandNullPointerException;
import org.reflections.Reflections;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.reflections.scanners.Scanners.SubTypes;
import static org.reflections.scanners.Scanners.TypesAnnotated;

public class IslandLocation implements Runnable {
    private final int locationId;
    private final List<Creature> locationCreatures = new CopyOnWriteArrayList<>();


    public IslandLocation(int locationId) {
        this.locationId = locationId;
    }

    public final boolean addCreature(Creature creature) {
        if (creature == null) throw new IslandNullPointerException("creature cannot be null");
        return locationCreatures.add(creature);
    }

    public static void main(String[] args) {
        Reflections reflections = new Reflections("Creatures");

        Set<Class<?>> set = reflections.get(SubTypes.of(TypesAnnotated.with(Configurable.class)).asClass());
        for (final Class<?> c : set) {
            System.out.println(c.getSimpleName());
        }
    }


    @Override
    public void run() {

//        plantsGrowth();
//        eating();
//        dying();
//        reproducing();
//        moving();
    }
}
