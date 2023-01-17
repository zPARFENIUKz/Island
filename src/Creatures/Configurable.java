package Creatures;


import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Configurable {
    String configFilepath() default "src\\properties.json";
    String fieldName();

    String groupJsonPath();
}
