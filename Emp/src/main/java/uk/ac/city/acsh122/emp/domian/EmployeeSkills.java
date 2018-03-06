/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.acsh122.emp.domian;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sarath
 */
@Entity
@Table(name = "employeeSkills")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmployeeSkills.findAll", query = "SELECT e FROM EmployeeSkills e")
    , @NamedQuery(name = "EmployeeSkills.findByEmployeeID", query = "SELECT e FROM EmployeeSkills e WHERE e.employeeSkillsPK.employeeID = :employeeID")
    , @NamedQuery(name = "EmployeeSkills.findBySkill", query = "SELECT e FROM EmployeeSkills e WHERE e.employeeSkillsPK.skill = :skill")})
public class EmployeeSkills implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmployeeSkillsPK employeeSkillsPK;
    @JoinColumn(name = "employeeID", referencedColumnName = "employeeID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Employee employee;

    public EmployeeSkills() {
    }

    public EmployeeSkills(EmployeeSkillsPK employeeSkillsPK) {
        this.employeeSkillsPK = employeeSkillsPK;
    }

    public EmployeeSkills(short employeeID, String skill) {
        this.employeeSkillsPK = new EmployeeSkillsPK(employeeID, skill);
    }

    public EmployeeSkillsPK getEmployeeSkillsPK() {
        return employeeSkillsPK;
    }

    public void setEmployeeSkillsPK(EmployeeSkillsPK employeeSkillsPK) {
        this.employeeSkillsPK = employeeSkillsPK;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeSkillsPK != null ? employeeSkillsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeeSkills)) {
            return false;
        }
        EmployeeSkills other = (EmployeeSkills) object;
        if ((this.employeeSkillsPK == null && other.employeeSkillsPK != null) || (this.employeeSkillsPK != null && !this.employeeSkillsPK.equals(other.employeeSkillsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uk.ac.city.acsh122.emp.domian.EmployeeSkills[ employeeSkillsPK=" + employeeSkillsPK + " ]";
    }
    
}
