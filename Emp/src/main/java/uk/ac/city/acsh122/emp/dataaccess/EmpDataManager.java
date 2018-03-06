/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.acsh122.emp.dataaccess;

import java.util.List;
import uk.ac.city.acsh122.emp.domian.Client;
import uk.ac.city.acsh122.emp.domian.Department;
import uk.ac.city.acsh122.emp.domian.Employee;

/**
 *
 * @author Sarath
 */
public interface EmpDataManager {
    
    List<Department>allDepartments();
    List<Employee>allEmployees();
    Employee findEmployeeById(Short id);
    void addEmployee(Employee employee);
    Client findClientByName(String name);
}
