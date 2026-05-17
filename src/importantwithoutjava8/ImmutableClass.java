package importantwithoutjava8;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {
    // Private and final fields
    private final int intValue;
    private final String stringValue;
    private final List<String> stringList;

    // Constructor to initialize the fields
    public ImmutableClass(int intValue, String stringValue, List<String> stringList) {
        this.intValue = intValue;
        this.stringValue = stringValue;
        // Defensively copy the list
        this.stringList = new ArrayList<>(stringList);
    }

    // Provide only getter methods
    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    // Return a defensive copy of the list
    public List<String> getStringList() {
        return new ArrayList<>(stringList);
    }
}
