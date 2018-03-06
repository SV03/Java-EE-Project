package uk.ac.city.acsh122.emp.domian;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.ac.city.acsh122.emp.domian.Assignment;
import uk.ac.city.acsh122.emp.domian.Department;
import uk.ac.city.acsh122.emp.domian.EmployeeSkills;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-10T15:34:47")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, Department> departmentID;
    public static volatile SingularAttribute<Employee, String> name;
    public static volatile SingularAttribute<Employee, Short> employeeID;
    public static volatile SingularAttribute<Employee, String> job;
    public static volatile CollectionAttribute<Employee, Assignment> assignmentCollection;
    public static volatile CollectionAttribute<Employee, EmployeeSkills> employeeSkillsCollection;

}