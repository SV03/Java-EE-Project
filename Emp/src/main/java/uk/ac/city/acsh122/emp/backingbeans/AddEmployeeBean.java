/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.acsh122.emp.backingbeans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import uk.ac.city.acsh122.emp.domian.Department;
import uk.ac.city.acsh122.emp.domian.Employee;
import uk.ac.city.acsh122.emp.services.EmpManagementService;

/**
 *
 * @author Sarath
 */
@ManagedBean (name="addEmployeeBean")
public class AddEmployeeBean {
    
    @EJB
    private EmpManagementService service;
    private List<Employee> employees;
    @NotNull(message="Employee_Id is Required")        
    Short employeeID;
    @Size(min=1, max=30, message="Name is Required")
    String name;
    @Size(min =1, max=30, message="Job is Required")
    String job;
    @NotNull(message="Department_Id is Required")
    Department departmentID;
    
    public String addEmployee(){
        
        Employee employee = new Employee();
        
        employee.setName(name);
        employee.setJob(job);
        employee.setDepartmentID(departmentID);
        employee.setEmployeeID(employeeID);
        
        
        employees = service.addEmployee(employee);
        return "displaynewemployee";
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Short getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Short employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    
    @PostConstruct
    public void initDepartment(){
    this.departmentID = new Department();
    }
    
    public Department getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Department departmentID) {
        this.departmentID = departmentID;
    }
    
    
}
