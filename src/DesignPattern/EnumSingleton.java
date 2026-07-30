package DesignPattern;


public enum EnumSingleton {

    INSTANCE;

    // Example variable
    private String value;

    // Example method
    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void doSomething() {
        System.out.println("Singleton working...");
    }
}
