
package beaninfo;

import java.beans.*;
import beans.Person;

public class TestBeanInfo {
    public static void main(String[] args) throws Exception {

        BeanInfo info = Introspector.getBeanInfo(Person.class);

        PropertyDescriptor[] props = info.getPropertyDescriptors();

        for (PropertyDescriptor pd : props) {
            System.out.println("Property: " + pd.getName());
        }
    }
}