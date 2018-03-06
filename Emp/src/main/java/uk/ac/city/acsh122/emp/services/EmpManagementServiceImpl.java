/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.acsh122.emp.services;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import uk.ac.city.acsh122.emp.dataaccess.EmpDataManager;
import uk.ac.city.acsh122.emp.domian.Client;
import static uk.ac.city.acsh122.emp.domian.Client_.name;
import uk.ac.city.acsh122.emp.domian.Department;
import uk.ac.city.acsh122.emp.domian.Employee;

/**
 *
 * @author Sarath
 */
@Stateless
public class EmpManagementServiceImpl implements EmpManagementService{
    
    @EJB
    private EmpDataManager dao;

    @Override
    public List<Department> findAllDepartments() {
        return dao.allDepartments();
    }

    @Override
    public List<Employee> findAllEmployees() {
        return dao.allEmployees();
    }

    @Override
    public Employee findEmployeeById(Short id) {
        return dao.findEmployeeById(id);
    }

    @Override
    public List<Employee> addEmployee(Employee employee) {
        dao.addEmployee(employee);
        return dao.allEmployees();
    }

    @Override
    public Client findClientByName(String name) {
        return dao.findClientByName(name);
    }

    
    
    
    
}
