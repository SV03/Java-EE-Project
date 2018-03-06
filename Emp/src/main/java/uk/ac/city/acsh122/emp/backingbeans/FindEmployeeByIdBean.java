/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.acsh122.emp.backingbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.validation.constraints.NotNull;
import uk.ac.city.acsh122.emp.domian.Employee;
import uk.ac.city.acsh122.emp.services.EmpManagementService;

/**
 *
 * @author Sarath
 */
@ManagedBean (name="findEmployeeByIdBean")
public class FindEmployeeByIdBean {
    
    @EJB
    private EmpManagementService service;
    private Employee employee;
    @NotNull(message="Valid Employee ID Required")
    private Short id;
    
    public String findEmployeeByIdBean(){
        employee = service.findEmployeeById(id);
        return "displayemployees";
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }
    
    
}
