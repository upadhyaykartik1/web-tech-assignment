
package constrained;

import java.beans.*;

public class ConstrainedPerson {

    private int age;
    private VetoableChangeSupport support;

    public ConstrainedPerson() {
        support = new VetoableChangeSupport(this);
    }

    public void addVetoableChangeListener(VetoableChangeListener listener) {
        support.addVetoableChangeListener(listener);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) throws PropertyVetoException {
        int oldAge = this.age;

        // Fire vetoable change before setting value
        support.fireVetoableChange("age", oldAge, newAge);

        this.age = newAge;
    }
}