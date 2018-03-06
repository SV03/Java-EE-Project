/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.acsh122.emp.backingbeans;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import uk.ac.city.acsh122.emp.domian.Employee;
import uk.ac.city.acsh122.emp.services.EmpManagementService;

/**
 *
 * @author Sarath
 */
@ManagedBean (name="allEmployeesBean")
public class AllEmployeesBean {
    
    @EJB
    private EmpManagementService service;
    
    public List<Employee> departmentList(){
        return service.findAllEmployees();
    }
}
