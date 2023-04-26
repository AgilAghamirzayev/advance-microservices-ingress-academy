package creation.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

    public static void main(String[] args) {
        SingletonEager instanceOne = SingletonEager.getInstance();
        SingletonEager instanceTwo = null;
        try {
            Constructor[] constructors = SingletonEager.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                // This code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (SingletonEager) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}