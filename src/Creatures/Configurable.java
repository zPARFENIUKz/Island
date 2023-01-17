package Creatures;


import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CreatureInfo {
    int weight();               // Вес организма
    int maxLocationCount();     // Максимальное количество организма этого вида на одной клетке
    int maxSpeed() default 0;   // Максимальная скорость перемещения, не более чем клеток за ход


}
