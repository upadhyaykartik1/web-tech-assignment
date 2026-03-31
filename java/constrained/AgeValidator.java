package constrained;

import java.beans.*;

public class AgeValidator implements VetoableChangeListener {

    @Override
    public void vetoableChange(PropertyChangeEvent evt) 
            throws PropertyVetoException {

        int newAge = (int) evt.getNewValue();

        if (newAge < 18) {
            throw new PropertyVetoException(
                "Age must be 18 or above!", evt);
        }
    }
}