/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.acsh122.emp.domian;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Sarath
 */
@Embeddable
public class EmployeeSkillsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "employeeID")
    private short employeeID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "skill")
    private String skill;

    public EmployeeSkillsPK() {
    }

    public EmployeeSkillsPK(short employeeID, String skill) {
        this.employeeID = employeeID;
        this.skill = skill;
    }

    public short getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(short employeeID) {
        this.employeeID = employeeID;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) employeeID;
        hash += (skill != null ? skill.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeeSkillsPK)) {
            return false;
        }
        EmployeeSkillsPK other = (EmployeeSkillsPK) object;
        if (this.employeeID != other.employeeID) {
            return false;
        }
        if ((this.skill == null && other.skill != null) || (this.skill != null && !this.skill.equals(other.skill))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uk.ac.city.acsh122.emp.domian.EmployeeSkillsPK[ employeeID=" + employeeID + ", skill=" + skill + " ]";
    }
    
}
