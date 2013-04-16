package de.objektpark.java.examples.guice;

public class GuicyInterfaceImpl implements GuicyInterface {

    public String get() {
        return GuicyInterfaceImpl.class.getName();
    }
}
