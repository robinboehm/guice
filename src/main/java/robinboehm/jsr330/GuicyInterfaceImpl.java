package robinboehm.jsr330;

public class GuicyInterfaceImpl implements GuicyInterface {

    public String get() {
        return GuicyInterfaceImpl.class.getName();
    }
}
