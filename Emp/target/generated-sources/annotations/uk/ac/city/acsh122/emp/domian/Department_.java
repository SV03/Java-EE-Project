package uk.ac.city.acsh122.emp.domian;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.ac.city.acsh122.emp.domian.Employee;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-10T15:34:47")
@StaticMetamodel(Department.class)
public class Department_ { 

    public static volatile SingularAttribute<Department, String> departmentName;
    public static volatile SingularAttribute<Department, Short> departmentID;
    public static volatile CollectionAttribute<Department, Employee> employeeCollection;

}