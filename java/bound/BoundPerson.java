package bound;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class BoundPerson {

    private String name;
    private PropertyChangeSupport support;

    public BoundPerson() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        String oldName = this.name;
        this.name = newName;

        // Fire property change event
        support.firePropertyChange("name", oldName, newName);
    }
}
