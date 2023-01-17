package Creatures;

import Creatures.Animals.Herbivores.Horse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;

public class CreaturesPropertiesLoader {
    public static void loadProperties(Class<?> clazz) {
        Configurable configurable = clazz.getAnnotation(Configurable.class);
        final String groupJsonPath = configurable.groupJsonPath();
        final String fieldName = configurable.fieldName();
        final String filepath = configurable.configFilepath();
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = null;
        try {
            root = mapper.readTree(new File(filepath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Iterator<String> fieldsIterator = root.at(String.format("%s/%s", groupJsonPath, fieldName)).fieldNames();
        while (fieldsIterator.hasNext()) {
            try {
                String innerFieldName = fieldsIterator.next();
                Field field = clazz.getDeclaredField(innerFieldName);
                field.setAccessible(true);
                final double value = root.at(String.format("%s/%s/%s", groupJsonPath, fieldName, innerFieldName)).asDouble();
                field.setInt(value, field.getModifiers() & ~Modifier.FINAL);
                field.set(null, value);
            } catch (NoSuchFieldException | IllegalAccessException ignore) {
            }
        }
    }
}
