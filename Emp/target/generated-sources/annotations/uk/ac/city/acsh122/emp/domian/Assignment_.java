package uk.ac.city.acsh122.emp.domian;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.ac.city.acsh122.emp.domian.AssignmentPK;
import uk.ac.city.acsh122.emp.domian.Client;
import uk.ac.city.acsh122.emp.domian.Employee;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-10T15:34:47")
@StaticMetamodel(Assignment.class)
public class Assignment_ { 

    public static volatile SingularAttribute<Assignment, Integer> hours;
    public static volatile SingularAttribute<Assignment, Client> client;
    public static volatile SingularAttribute<Assignment, Employee> employee;
    public static volatile SingularAttribute<Assignment, AssignmentPK> assignmentPK;

}