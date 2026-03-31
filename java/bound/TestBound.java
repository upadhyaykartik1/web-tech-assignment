package bound;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class TestBound {
    public static void main(String[] args) {

        BoundPerson person = new BoundPerson();

        // Add listener
        person.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                System.out.println("Property changed: " 
                    + evt.getPropertyName()
                    + " | Old: " + evt.getOldValue()
                    + " | New: " + evt.getNewValue());
            }
        });

        person.setName("Harshit");
        person.setName("Rahul");
    }
}
