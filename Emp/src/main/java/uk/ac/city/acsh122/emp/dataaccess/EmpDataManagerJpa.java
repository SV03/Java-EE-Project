/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.acsh122.emp.dataaccess;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import uk.ac.city.acsh122.emp.domian.Client;
import uk.ac.city.acsh122.emp.domian.Department;
import uk.ac.city.acsh122.emp.domian.Employee;

/**
 *
 * @author Sarath
 */
@Stateless
public class EmpDataManagerJpa implements EmpDataManager{
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Department> allDepartments() {
        TypedQuery<Department> query = em.createNamedQuery("Department.findAll", Department.class);
        return query.getResultList();
    }

    @Override
    public List<Employee> allEmployees() {
        TypedQuery<Employee> query = em.createNamedQuery("Employee.findAll", Employee.class);
        return query.getResultList();
    }

    @Override
    public Employee findEmployeeById(Short id) {
        TypedQuery<Employee> query = em.createNamedQuery("Employee.findByEmployeeID", Employee.class);
        query.setParameter("employeeID", id);
        return query.getSingleResult();
    }

    @Override
    public void addEmployee(Employee employee) {
        em.persist(employee);
    }

    @Override
    public Client findClientByName(String name) {
        TypedQuery<Client> query = em.createNamedQuery("Client.findByName", Client.class);
        query.setParameter("name", name);
        return query.getSingleResult();
    }
    
    
}
