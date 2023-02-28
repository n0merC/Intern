package org.example;

import org.reflections.Reflections;

import java.lang.reflect.*;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Reflections reflections = new Reflections("org.example");
        Set<Class<?>> typesAnnotatedWith = reflections.getTypesAnnotatedWith(Component.class);
        for(Class c:typesAnnotatedWith){
            for(Constructor<?> constructor:c.getConstructors()){
                if(constructor.isAnnotationPresent(Autowired.class)){
                    new First((Second) constructor.newInstance());
                }
            }
        }
    }

}