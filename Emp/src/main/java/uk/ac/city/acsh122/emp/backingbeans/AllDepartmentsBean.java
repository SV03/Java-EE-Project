/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.acsh122.emp.backingbeans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import uk.ac.city.acsh122.emp.domian.Department;
import uk.ac.city.acsh122.emp.services.EmpManagementService;

/**
 *
 * @author Sarath
 */
@ManagedBean (name="allDepartmentsBean")
public class AllDepartmentsBean {
    
    @EJB
    private EmpManagementService service;
    
    public List<Department> departmentList(){
        return service.findAllDepartments();
    }
    
}
